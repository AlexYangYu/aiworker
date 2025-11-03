# 阿里云云研究

## 资源层级

### 需求

总结阿里云核心资源的**逻辑层级关系**，包含的资源对象包括：

- Region
- Availability Zone
- VPC
- SecurityGroup
- vSwitch
- vRouter
- NetworkACL
- ENI
- Instance

**关键要求:**
- 此层级关系应反映资源在管理和概念上的位置。
- 注意，VPC和Instance（ECS）等应被视为Region下的并行核心服务，而非简单的物理或网络包含关系。

### 输出格式要求

- 采用Markdown的目录层级结构（列表）进行展示。
- 输出文件：`./output/resource_hierarchy.md`

---

## 资源关系拓扑

### 需求

总结以下核心**资源类型**之间的**抽象关联关系**，而不是分析具体资源实例之间的连接。

- Region
- Availability Zone
- VPC
- SecurityGroup
- vSwitch
- vRouter
- NetworkACL
- ENI
- Instance

**关键要求:**
- 拓扑图应清晰展示资源类型之间的依赖和关联。
- 在每一条表示关系的连接上，必须注明**数量关系**（例如：一对一、一对多 `1..*`、多对多 `*..*`）。

### 输出格式要求

- 采用GraphViz的dot语言结构输出。
- 输出文件：`./output/resource_topology.dot`