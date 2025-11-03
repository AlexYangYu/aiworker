package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * VPC（Virtual Private Cloud）虚拟私有云
 * 提供隔离的网络环境
 */
public class Vpc extends BaseCloudResource {
    /**
     * VPC的CIDR块（IPv4）
     */
    public String cidrBlock;

    /**
     * IPv6 CIDR块（可选）
     */
    public String ipv6CidrBlock;

    /**
     * 辅助CIDR块列表
     */
    public List<String> secondaryCidrBlocks = new ArrayList<>();

    /**
     * 是否启用IPv6
     */
    public boolean ipv6Enabled;

    /**
     * 是否为默认VPC
     */
    public boolean isDefault;

    /**
     * 虚拟路由器ID（阿里云特有）
     */
    public String vRouterId;

    /**
     * 路由表ID列表
     */
    public List<String> routeTableIds = new ArrayList<>();

    /**
     * 子网ID列表
     */
    public List<String> subnetIds = new ArrayList<>();

    /**
     * NAT网关ID列表
     */
    public List<String> natGatewayIds = new ArrayList<>();

    /**
     * 企业项目ID（华为云特有）
     */
    public String enterpriseProjectId;
}
