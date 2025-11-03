package domain;

/**
 * 网络ACL规则
 * 子网级别的无状态防火墙规则
 */
public class NetworkAclRule {
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
     * 规则编号/优先级（数字越小优先级越高）
     */
    public Integer ruleNumber;

    /**
     * 源IP地址段（CIDR格式）
     */
    public String sourceCidrIp;

    /**
     * 源端口范围
     */
    public String sourcePortRange;

    /**
     * 目标IP地址段（CIDR格式）
     */
    public String destinationCidrIp;

    /**
     * 目标端口范围
     */
    public String destinationPortRange;

    /**
     * 规则描述
     */
    public String description;

    @Override
    public String toString() {
        return "NetworkAclRule{" +
                "ruleId='" + ruleId + '\'' +
                ", direction=" + direction +
                ", action=" + action +
                ", protocol=" + protocol +
                ", ruleNumber=" + ruleNumber +
                ", sourceCidrIp='" + sourceCidrIp + '\'' +
                ", destinationCidrIp='" + destinationCidrIp + '\'' +
                ", destinationPortRange='" + destinationPortRange + '\'' +
                '}';
    }
}
