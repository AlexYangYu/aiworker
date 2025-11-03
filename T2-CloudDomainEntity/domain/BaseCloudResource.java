package domain;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * 云资源基类
 * 所有云资源对象的抽象基类，包含通用属性
 */
public abstract class BaseCloudResource {
    /**
     * 资源ID（云平台唯一标识）
     */
    public String id;

    /**
     * 资源名称
     */
    public String name;

    /**
     * 资源描述
     */
    public String description;

    /**
     * 云提供商
     */
    public CloudProvider provider;

    /**
     * 地域ID
     */
    public String regionId;

    /**
     * 可用区ID（可选，某些资源不绑定可用区）
     */
    public String availabilityZoneId;

    /**
     * 资源状态
     */
    public String status;

    /**
     * 创建时间
     */
    public LocalDateTime createTime;

    /**
     * 更新时间
     */
    public LocalDateTime updateTime;

    /**
     * 资源标签
     */
    public Map<String, String> tags = new HashMap<>();

    /**
     * 租户/账号ID
     */
    public String tenantId;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", provider=" + provider +
                ", regionId='" + regionId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
