package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 网络接口（NetworkInterface / ENI / Port）
 * 实例的虚拟网络接口卡
 * - 阿里云称为ENI（Elastic Network Interface）
 * - 华为云称为Port
 */
public class NetworkInterface extends BaseCloudResource {
    /**
     * 所属VPC的ID
     */
    public String vpcId;

    /**
     * 所属子网ID（阿里云为VSwitchId，华为云为NetworkId）
     */
    public String subnetId;

    /**
     * MAC地址
     */
    public String macAddress;

    /**
     * 主IP地址
     */
    public String primaryIpAddress;

    /**
     * 所有私有IP地址列表
     */
    public List<String> privateIpAddresses = new ArrayList<>();

    /**
     * IPv6地址列表
     */
    public List<String> ipv6Addresses = new ArrayList<>();

    /**
     * 关联的安全组ID列表
     */
    public List<String> securityGroupIds = new ArrayList<>();

    /**
     * 绑定的实例ID
     */
    public String instanceId;

    /**
     * 设备所有者类型（如：compute:zone-a, network:router_interface_distributed）
     */
    public String deviceOwner;

    /**
     * 接口类型（Primary主网卡 / Secondary辅助网卡）
     */
    public String interfaceType;

    /**
     * 是否为主网络接口
     */
    public boolean isPrimary;

    /**
     * 是否启用源/目标检查
     */
    public boolean sourceDestCheck;

    /**
     * 管理状态（是否启用）
     */
    public boolean adminStateUp;

    /**
     * 是否启用端口安全
     */
    public boolean portSecurityEnabled;

    /**
     * 绑定的虚拟网卡类型（如：normal, direct, macvtap）
     */
    public String vnicType;
}
