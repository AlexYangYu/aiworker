# 云领域对象实现总结

## 概述

本项目实现了混合云平台安全策略管理的领域对象抽象，支持阿里云、华为云等多云平台的统一管理。

## 设计原则

1. **统一抽象**：基于阿里云和华为云的对象模型，抽象出通用的领域对象
2. **扩展性**：支持多云平台差异化字段（通过特定字段标注）
3. **完整性**：覆盖安全策略管理所需的核心网络和计算资源

## 对象层次结构

```
BaseCloudResource (基类)
├── Vpc (虚拟私有云)
├── Subnet (子网/交换机)
├── SecurityGroup (安全组)
├── NetworkAcl (网络ACL)
├── RouteTable (路由表)
├── Instance (云主机实例)
└── NetworkInterface (网络接口)
```

## 已实现的领域对象

### 1. 基础类和枚举

#### BaseCloudResource
- **文件**: `domain/BaseCloudResource.java`
- **说明**: 所有云资源的抽象基类
- **核心属性**:
  - id: 资源唯一标识
  - name: 资源名称
  - provider: 云提供商（CloudProvider枚举）
  - regionId: 地域ID
  - availabilityZoneId: 可用区ID
  - status: 资源状态
  - tags: 资源标签
  - createTime/updateTime: 时间戳

#### CloudProvider
- **文件**: `domain/CloudProvider.java`
- **说明**: 云提供商枚举
- **支持**: ALIYUN, HUAWEI, TENCENT, AWS, AZURE

#### 协议和策略枚举
- `Protocol.java`: 网络协议（TCP, UDP, ICMP, ICMPv6, ALL）
- `IpProtocolVersion.java`: IP版本（IPv4, IPv6）
- `TrafficDirection.java`: 流量方向（INGRESS, EGRESS）
- `RuleAction.java`: 规则动作（ALLOW, DENY）
- `RouteType.java`: 路由类型（SYSTEM, CUSTOM, BGP）

### 2. 网络资源

#### Vpc (虚拟私有云)
- **文件**: `domain/Vpc.java`
- **说明**: 提供隔离的虚拟网络环境
- **核心属性**:
  - cidrBlock: IPv4 CIDR块
  - ipv6CidrBlock: IPv6 CIDR块（可选）
  - secondaryCidrBlocks: 辅助CIDR列表
  - subnetIds: 子网ID列表
  - routeTableIds: 路由表ID列表
  - vRouterId: 虚拟路由器ID（阿里云）
  - enterpriseProjectId: 企业项目ID（华为云）

#### Subnet (子网)
- **文件**: `domain/Subnet.java`
- **说明**: VPC内的子网资源，阿里云称为vSwitch
- **核心属性**:
  - vpcId: 所属VPC ID
  - cidrBlock: 子网CIDR块
  - gatewayIp: 网关IP
  - dhcpEnabled: 是否启用DHCP
  - dnsList: DNS服务器列表
  - routeTableId: 关联路由表ID
  - networkAclId: 关联网络ACL ID

### 3. 安全策略资源

#### SecurityGroup (安全组)
- **文件**: `domain/SecurityGroup.java`
- **说明**: 虚拟防火墙，控制实例级别的流量
- **核心属性**:
  - vpcId: 所属VPC ID（可选）
  - rules: 安全组规则列表
  - instanceCount: 关联实例数
  - innerAccessPolicy: 内部访问策略（阿里云）

#### SecurityGroupRule (安全组规则)
- **文件**: `domain/SecurityGroupRule.java`
- **说明**: 安全组的具体规则
- **核心属性**:
  - direction: 流量方向
  - action: 允许或拒绝
  - protocol: 协议类型
  - priority: 优先级
  - sourceCidrIp/destinationCidrIp: 源/目标IP段
  - sourcePortRange/destinationPortRange: 端口范围

#### NetworkAcl (网络ACL)
- **文件**: `domain/NetworkAcl.java`
- **说明**: 子网级别的无状态防火墙
- **核心属性**:
  - vpcId: 所属VPC ID
  - subnetIds: 关联子网列表
  - ingressRules: 入站规则
  - egressRules: 出站规则

#### NetworkAclRule (网络ACL规则)
- **文件**: `domain/NetworkAclRule.java`
- **说明**: 网络ACL的具体规则
- **特点**: 无状态，需要明确配置双向规则

### 4. 路由资源

#### RouteTable (路由表)
- **文件**: `domain/RouteTable.java`
- **说明**: 控制VPC内流量路由
- **核心属性**:
  - vpcId: 所属VPC ID
  - vRouterId: 虚拟路由器ID（阿里云）
  - routeEntries: 路由条目列表
  - subnetIds: 关联子网列表
  - isMainRouteTable: 是否主路由表

#### RouteEntry (路由条目)
- **文件**: `domain/RouteEntry.java`
- **说明**: 路由表中的单条路由
- **核心属性**:
  - destinationCidrBlock: 目标CIDR
  - nextHopType: 下一跳类型
  - nextHopId: 下一跳ID
  - routeType: 路由类型

### 5. 计算资源

#### Instance (云主机实例)
- **文件**: `domain/Instance.java`
- **说明**: 云平台虚拟机实例
- **核心属性**:
  - instanceType: 实例规格
  - vpcId/subnetId: 网络位置
  - securityGroupIds: 关联安全组
  - networkInterfaceIds: 网络接口列表
  - privateIpAddresses: 私有IP列表
  - publicIpAddresses: 公有IP列表
  - cpu/memory: 计算资源

#### NetworkInterface (网络接口)
- **文件**: `domain/NetworkInterface.java`
- **说明**: 实例的网络接口卡（ENI/Port）
- **核心属性**:
  - vpcId/subnetId: 网络位置
  - macAddress: MAC地址
  - primaryIpAddress: 主IP地址
  - privateIpAddresses: IP地址列表
  - securityGroupIds: 关联安全组
  - instanceId: 绑定实例ID
  - isPrimary: 是否主网卡

## 云平台差异适配

### 阿里云特有字段
- Vpc.vRouterId: 虚拟路由器ID
- SecurityGroup.innerAccessPolicy: 同安全组实例互通策略

### 华为云特有字段
- Vpc.enterpriseProjectId: 企业项目ID
- SecurityGroup.enterpriseProjectId: 企业项目ID
- NetworkInterface.deviceOwner: 设备所有者类型

### 命名差异映射
| 通用名称 | 阿里云 | 华为云 |
|---------|--------|--------|
| 子网 | vSwitch (交换机) | Subnet |
| 网络接口 | ENI (Elastic Network Interface) | Port |

## 使用场景

### 1. 安全策略优化分析
- 分析SecurityGroup和NetworkAcl规则
- 检测冗余、冲突和不安全的规则
- 提供优化建议

### 2. IP访问需求管理
- 基于源IP和目标IP自动分析访问路径
- 评估现有SecurityGroup和NetworkAcl是否满足访问需求
- 自动生成和下发安全策略

### 3. 混合云网络拓扑分析
- 构建VPC、Subnet、Instance的拓扑关系
- 分析跨VPC、跨区域的网络连通性
- 路由分析和流量路径追踪

### 4. 合规性检查
- 检查安全组规则是否符合安全基线
- 验证网络隔离是否符合要求
- 生成合规性报告

## 扩展建议

### 短期扩展
1. 添加NatGateway（NAT网关）对象
2. 添加VpnGateway（VPN网关）对象
3. 添加EIP（弹性公网IP）对象
4. 添加LoadBalancer（负载均衡）对象

### 长期扩展
1. 添加更多云平台支持（AWS、Azure、腾讯云）
2. 实现云平台适配器模式，自动转换云平台API返回的对象
3. 添加关系对象（如VpcSubnetRelation），显式表达对象间关系
4. 添加变更历史追踪（ChangeHistory）

## 技术特点

1. **面向对象设计**: 清晰的继承关系和职责划分
2. **枚举类型安全**: 使用枚举表达有限状态，避免魔法字符串
3. **双向关联**: 通过ID列表建立对象间关联关系
4. **扩展性**: 预留云平台特有字段，支持多云差异
5. **可序列化**: 所有对象可用于JSON/XML序列化传输

## 项目结构

```
T2-CloudDomainEntity/
├── domain/
│   ├── BaseCloudResource.java        # 基类
│   ├── CloudProvider.java            # 云提供商枚举
│   ├── Protocol.java                 # 协议枚举
│   ├── IpProtocolVersion.java        # IP版本枚举
│   ├── TrafficDirection.java         # 流量方向枚举
│   ├── RuleAction.java               # 规则动作枚举
│   ├── RouteType.java                # 路由类型枚举
│   ├── Vpc.java                      # VPC
│   ├── Subnet.java                   # 子网
│   ├── SecurityGroup.java            # 安全组
│   ├── SecurityGroupRule.java        # 安全组规则
│   ├── NetworkAcl.java               # 网络ACL
│   ├── NetworkAclRule.java           # 网络ACL规则
│   ├── RouteTable.java               # 路由表
│   ├── RouteEntry.java               # 路由条目
│   ├── Instance.java                 # 云主机实例
│   └── NetworkInterface.java         # 网络接口
├── research.md                       # 需求文档
└── IMPLEMENTATION_SUMMARY.md         # 本文档
```

## 下一步

1. 实现云平台适配器（Adapter），将阿里云/华为云API对象转换为领域对象
2. 实现安全策略分析引擎
3. 实现访问路径分析算法
4. 添加单元测试
5. 补充使用示例和文档
