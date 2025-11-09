public class NetworkInterface extends Entity {

    public static final String ENTITY_TYPE = "CENI";

    // 设备ID
    private UUID deviceId;

    // 云服务商
    private CloudProvider cloudProvider;

    // 网卡所在区域
    private String region;

    // 网卡所在可用区
    private String availabilityZone;

    // 网卡ID
    private String networkInterfaceId;

    // 网卡类型
    private String type;

    // 网卡名称
    private String name;

    // 网卡状态
    private String status;

    // MAC地址
    private Mac macAddress;

    // 主私网IP地址
    private INet primaryIp;

    // 私网IP地址列表
    private List<INet> privateIps = new ArrayList<>();

    // 绑定的公网IP
    private List<INet> publicIps = new ArrayList<>();

    // 所属VPC ID
    private String vpcId;

    // 所属交换机ID
    private String vSwitchId;

    // 关联的实例ID
    private String instanceId;

    // 关联的安全组ID列表
    private List<String> securityGroupIds = new ArrayList<>();

    // 云上的创建时间
    private Date createdAtCloud;

    // 描述
    private String description;

    // 在iNet的创建时间
    private Date createTime;

    // 在iNet的更新时间
    private Date updateTime;

    // Tags
    private Map<String, String> tags = new HashMap<>();

    /**
     * 其它需要存储的属性
     * key: 属性名称
     * value: 属性值
     */
    private Map<String, Option<?>> options = new HashMap<>();

    @Override
    public String getEntityType() {
        // Cloud ENI
        return ENTITY_TYPE;
    }

    /**
     * 获取网卡的唯一标识键
     * <p>
     * 组合格式：cloudProvider:region:networkInterfaceId
     * 例如：ALIYUN:cn-hangzhou:eni-bp1234567890abcde
     * </p>
     *
     * @return 唯一标识键
     */
    public String getUniqueKey() {
        if (cloudProvider == null || region == null || networkInterfaceId == null) {
            throw new IllegalStateException("cloudProvider, region, and networkInterfaceId must not be null");
        }
        return cloudProvider.getCode() + ":" + region + ":" + networkInterfaceId;
    }
}
