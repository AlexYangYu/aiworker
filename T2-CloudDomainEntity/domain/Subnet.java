package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 子网（Subnet / vSwitch）
 * VPC内的子网资源，阿里云称为vSwitch（交换机）
 */
public class Subnet extends BaseCloudResource {
    /**
     * 所属VPC的ID
     */
    public String vpcId;

    /**
     * 子网CIDR块（IPv4）
     */
    public String cidrBlock;

    /**
     * IPv6 CIDR块（可选）
     */
    public String ipv6CidrBlock;

    /**
     * 网关IP地址
     */
    public String gatewayIp;

    /**
     * IPv6网关IP地址
     */
    public String gatewayIpv6;

    /**
     * 是否启用IPv6
     */
    public boolean ipv6Enabled;

    /**
     * 是否启用DHCP
     */
    public boolean dhcpEnabled;

    /**
     * 主DNS服务器
     */
    public String primaryDns;

    /**
     * 辅助DNS服务器
     */
    public String secondaryDns;

    /**
     * DNS服务器列表
     */
    public List<String> dnsList = new ArrayList<>();

    /**
     * 关联的路由表ID
     */
    public String routeTableId;

    /**
     * 关联的网络ACL ID
     */
    public String networkAclId;

    /**
     * 可用IP地址数量
     */
    public Integer availableIpCount;
}
