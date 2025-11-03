# 变更日志

## 2025-11-03

### 已完成
- ✅ 实现了17个Java领域对象类
- ✅ 移除了所有getter和setter方法
- ✅ 将所有字段改为public访问

### 领域对象列表

**基础类和枚举 (7个)**
- BaseCloudResource - 基类（public字段）
- CloudProvider - 云提供商枚举
- Protocol - 网络协议枚举
- IpProtocolVersion - IP版本枚举
- TrafficDirection - 流量方向枚举
- RuleAction - 规则动作枚举
- RouteType - 路由类型枚举

**核心领域对象 (10个)**
- Vpc - 虚拟私有云（public字段）
- Subnet - 子网（public字段）
- SecurityGroup - 安全组（public字段）
- SecurityGroupRule - 安全组规则（public字段）
- NetworkAcl - 网络ACL（public字段）
- NetworkAclRule - 网络ACL规则（public字段）
- RouteTable - 路由表（public字段）
- RouteEntry - 路由条目（public字段）
- Instance - 云主机实例（public字段）
- NetworkInterface - 网络接口（public字段）

### 设计特点
- 简洁的public字段访问，无getter/setter
- 清晰的注释文档
- 支持阿里云和华为云差异化字段
- 完整的toString()方法便于调试
