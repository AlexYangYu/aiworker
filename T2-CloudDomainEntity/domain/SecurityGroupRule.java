package domain;

/**
 * 安全组规则
 * 定义安全组的入站或出站流量规则
 */
public class SecurityGroupRule {
    /**
     * 规则ID
     */
    public String ruleId;

    /**
     * 流量方向（入站/出站）
     */
    public TrafficDirection direction;

    /**
     * 规则动作（允许/拒绝）
     */
    public RuleAction action;

    /**
     * 协议类型
     */
    public Protocol protocol;

    /**
     * IP协议版本
     */
    public IpProtocolVersion ipVersion;

    /**
     * 优先级（数字越小优先级越高）
     */
    public Integer priority;

    /**
     * 源IP地址段（CIDR格式）- 用于入站规则
     */
    public String sourceCidrIp;

    /**
     * 源安全组ID - 用于入站规则
     */
    public String sourceSecurityGroupId;

    /**
     * 源端口范围（格式：startPort/endPort，如 "1/65535" 或 "22/22"）
     */
    public String sourcePortRange;

    /**
     * 目标IP地址段（CIDR格式）- 用于出站规则
     */
    public String destinationCidrIp;

    /**
     * 目标安全组ID - 用于出站规则
     */
    public String destinationSecurityGroupId;

    /**
     * 目标端口范围（格式：startPort/endPort）
     */
    public String destinationPortRange;

    /**
     * 规则描述
     */
    public String description;

    /**
     * 创建时间
     */
    public String createTime;

    @Override
    public String toString() {
        return "SecurityGroupRule{" +
                "ruleId='" + ruleId + '\'' +
                ", direction=" + direction +
                ", action=" + action +
                ", protocol=" + protocol +
                ", priority=" + priority +
                ", sourceCidrIp='" + sourceCidrIp + '\'' +
                ", destinationPortRange='" + destinationPortRange + '\'' +
                '}';
    }
}
