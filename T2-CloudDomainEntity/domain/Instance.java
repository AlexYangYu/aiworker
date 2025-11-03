package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 云主机实例（Instance / ECS）
 * 表示云平台上的虚拟机实例
 */
public class Instance extends BaseCloudResource {
    /**
     * 实例类型/规格（如：ecs.e-c1m1.large）
     */
    public String instanceType;

    /**
     * 主机名
     */
    public String hostName;

    /**
     * 操作系统名称
     */
    public String osName;

    /**
     * CPU核数
     */
    public Integer cpu;

    /**
     * 内存大小（MB）
     */
    public Integer memory;

    /**
     * 所属VPC的ID
     */
    public String vpcId;

    /**
     * 所属子网ID（阿里云为VSwitchId）
     */
    public String subnetId;

    /**
     * 关联的安全组ID列表
     */
    public List<String> securityGroupIds = new ArrayList<>();

    /**
     * 主网络接口ID
     */
    public String primaryNetworkInterfaceId;

    /**
     * 所有网络接口ID列表
     */
    public List<String> networkInterfaceIds = new ArrayList<>();

    /**
     * 私有IP地址列表
     */
    public List<String> privateIpAddresses = new ArrayList<>();

    /**
     * 公有IP地址列表
     */
    public List<String> publicIpAddresses = new ArrayList<>();

    /**
     * 弹性公网IP（EIP）
     */
    public String elasticIpAddress;

    /**
     * 镜像ID
     */
    public String imageId;

    /**
     * 网络类型（vpc或classic）
     */
    public String networkType;

    /**
     * 实例序列号
     */
    public String serialNumber;

    /**
     * 计费类型（如：按量付费、包年包月、竞价实例）
     */
    public String chargeType;
}
