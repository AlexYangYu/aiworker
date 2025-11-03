package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 网络ACL（Network Access Control List）
 * 子网级别的无状态防火墙，提供更细粒度的流量控制
 */
public class NetworkAcl extends BaseCloudResource {
    /**
     * 所属VPC的ID
     */
    public String vpcId;

    /**
     * 关联的子网ID列表
     */
    public List<String> subnetIds = new ArrayList<>();

    /**
     * 入站规则列表
     */
    public List<NetworkAclRule> ingressRules = new ArrayList<>();

    /**
     * 出站规则列表
     */
    public List<NetworkAclRule> egressRules = new ArrayList<>();

    /**
     * 是否为默认ACL
     */
    public boolean isDefault;
}
