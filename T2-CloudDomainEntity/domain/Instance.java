package net.skycloud.netdb.domain.cloud;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import net.skycloud.netdb.domain.Entity;
import net.skycloud.netdb.domain.Option;
import net.skycloud.netdb.domain.cloud.compare.InstanceChangeRecord;
import net.skycloud.netdb.domain.common.compare.ComparableEntity;
import net.skycloud.netdb.domain.common.compare.EntityChangeType;
import net.skycloud.netdb.domain.common.compare.ItemChangeWrapper;
import net.skycloud.netdb.domain.common.compare.SimpleListComparator;
import net.skycloud.netdb.domain.net.INet;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 云实例
 * - 阿里云ECS
 * - 华为云ECS
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Instance extends Entity implements ComparableEntity<Instance, InstanceChangeRecord> {

    public static final String ENTITY_TYPE = "CINS";

    // 云服务商
    private CloudProvider cloudProvider;

    // 实例所在区域
    private String region;

    // 实例所在可用区
    private String availabilityZone;

    // 实例ID
    private String instanceId;

    // 设备ID
    private UUID deviceId;

    // 实例类型, 如：ecs.g6.large
    private String instanceType;

    // 实例名称
    private String name;

    // 实例主机名
    private String hostName;

    // 实例状态, Aliyun: Running, Stopped; HUAWEI: ACTIVE, SHUTOFF
    private String status;

    // 操作系统名称
    private String osName;

    // CPU核数
    private Integer cpuCount;

    // 内存大小，单位：MB
    private Integer memoryCount;

    // 私有IP地址列表
    private List<INet> privateIps= new ArrayList<>();

    // 公有IP地址列表
    private List<INet> publicIps = new ArrayList<>();

    // VPC
    private String vpcId;

    // VSwitch
    private List<String> vSwitchIds;

    // 安全组
    private List<String> securityGroupIds;

    // Description
    private String description;

    // 云上的创建时间
    private Date createdAtCloud;

    // 在iNet的创建时间
    private Date createTime;

    // 在iNet的更新时间
    private Date updateTime;

    // Tags
    private Map<String, String> tags = new HashMap<>();

    /**
     * 其它需要存储的属性
     * key: 属性名称, aliyun:SpotStrategy; huawei:chargingMode
     * value: 属性值, 如: SpotStrategy: "NoSpot"
     */
    private Map<String, Option<?>> options = new HashMap<>();

    @Override
    public String getEntityType() {
        // Cloud Instance
        return ENTITY_TYPE;
    }

    /**
     * 获取实例的唯一标识键
     * <p>
     * 组合格式：cloudProvider:region:instanceId
     * 例如：ALIYUN:cn-hangzhou:i-bp1234567890abcde
     * </p>
     *
     * @return 唯一标识键
     */
    @Override
    public String getUniqueKey() {
        if (cloudProvider == null || region == null || instanceId == null) {
            throw new IllegalStateException("cloudProvider, region, and instanceId must not be null");
        }
        return cloudProvider.getCode() + ":" + region + ":" + instanceId;
    }
}
