package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 安全组（Security Group）
 * 虚拟防火墙，控制关联实例的入站和出站流量
 */
public class SecurityGroup extends BaseCloudResource {
    /**
     * 所属VPC的ID（可选，某些云平台安全组可以跨VPC）
     */
    public String vpcId;

    /**
     * 安全组类型（如：normal, enterprise）
     */
    public String securityGroupType;

    /**
     * 安全组规则列表
     */
    public List<SecurityGroupRule> rules = new ArrayList<>();

    /**
     * 关联的实例数量
     */
    public Integer instanceCount;

    /**
     * 可关联的最大实例数量
     */
    public Integer maxInstanceCount;

    /**
     * 内部访问策略（阿里云特有：Accept表示同安全组实例互通）
     */
    public String innerAccessPolicy;

    /**
     * 企业项目ID（华为云特有）
     */
    public String enterpriseProjectId;

    /**
     * 是否为系统服务管理的安全组
     */
    public boolean serviceManaged;
}
