package domain;

/**
 * 云提供商枚举
 * 表示不同的云服务提供商
 */
public enum CloudProvider {
    /**
     * 阿里云
     */
    ALIYUN("aliyun", "Alibaba Cloud"),

    /**
     * 华为云
     */
    HUAWEI("huawei", "Huawei Cloud"),

    /**
     * 腾讯云
     */
    TENCENT("tencent", "Tencent Cloud"),

    /**
     * AWS
     */
    AWS("aws", "Amazon Web Services"),

    /**
     * Azure
     */
    AZURE("azure", "Microsoft Azure");

    private final String code;
    private final String displayName;

    CloudProvider(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public String getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }
}
