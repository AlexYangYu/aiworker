# 阿里云资源层级关系

阿里云核心资源的逻辑层级关系如下：

## 全球基础设施层
- **Region（地域）**
  - 地理位置上的独立数据中心区域
  - 包含多个可用区

  - **Availability Zone（可用区）**
    - Region内的物理隔离区域
    - 提供电力、网络独立的基础设施
    - 同一Region内的可用区之间通过低延迟网络连接

## Region级核心服务层

在Region下，VPC和Instance（ECS）作为并行的核心服务存在，而非简单的包含关系：

### 网络服务 - VPC（专有网络）
- **VPC（Virtual Private Cloud）**
  - Region级资源，提供隔离的虚拟网络环境
  - 定义网络地址空间（CIDR）

  - **vRouter（虚拟路由器）**
    - 每个VPC自动创建的路由设备
    - 管理VPC内的路由策略

    - **Route Table（路由表）**
      - 关联到vRouter的路由规则集
      - 控制网络流量转发

  - **vSwitch（交换机）**
    - VPC内的子网，必须属于某个可用区
    - 提供IP地址分配和二层网络隔离
    - 关联到特定的Route Table

  - **SecurityGroup（安全组）**
    - VPC级的虚拟防火墙
    - 控制实例的入站和出站流量
    - 可以关联多个实例

  - **NetworkACL（网络访问控制列表）**
    - VPC级的子网级防火墙
    - 作用于vSwitch层面
    - 提供无状态的访问控制

### 计算服务 - ECS（云服务器）
- **Instance（ECS实例）**
  - Region级服务，实际运行在特定可用区
  - 必须关联到特定的vSwitch（从而确定VPC和可用区）
  - 必须关联至少一个SecurityGroup

  - **ENI（弹性网卡）**
    - 绑定到Instance的虚拟网络接口
    - 提供网络连接能力
    - 主网卡（Primary ENI）：实例创建时自动创建
    - 辅助网卡（Secondary ENI）：可以额外挂载
    - 通过vSwitch连接到VPC网络
    - 受SecurityGroup规则控制

## 资源关系说明

### 层级关系特点
1. **地理层级**：Region > Availability Zone
2. **网络层级**：VPC > vRouter > Route Table
3. **网络层级**：VPC > vSwitch（跨可用区）
4. **网络层级**：VPC > SecurityGroup
5. **网络层级**：VPC > NetworkACL
6. **计算层级**：Instance > ENI

### 关联关系
- **Instance与VPC**：Instance通过vSwitch连接到VPC
- **Instance与可用区**：Instance部署在特定可用区，通过该可用区的vSwitch接入网络
- **vSwitch与可用区**：每个vSwitch必须属于一个可用区
- **SecurityGroup与Instance**：多对多关系，一个实例可加入多个安全组
- **ENI与vSwitch**：ENI从vSwitch获取IP地址
- **ENI与SecurityGroup**：ENI的流量受SecurityGroup规则控制

### 设计理念
- VPC作为网络服务，提供网络隔离和管理能力
- Instance作为计算服务，提供计算资源
- 两者通过vSwitch和ENI建立连接关系
- 这种设计符合云计算服务分层的架构理念
