package domain;

/**
 * 路由条目
 * 路由表中的单条路由规则
 */
public class RouteEntry {
    /**
     * 路由条目ID
     */
    public String routeEntryId;

    /**
     * 目标CIDR块
     */
    public String destinationCidrBlock;

    /**
     * 下一跳类型（如：Instance, NatGateway, InternetGateway, VpnGateway等）
     */
    public String nextHopType;

    /**
     * 下一跳ID
     */
    public String nextHopId;

    /**
     * 路由类型
     */
    public RouteType routeType;

    /**
     * 路由状态
     */
    public String status;

    /**
     * 路由描述
     */
    public String description;

    @Override
    public String toString() {
        return "RouteEntry{" +
                "destinationCidrBlock='" + destinationCidrBlock + '\'' +
                ", nextHopType='" + nextHopType + '\'' +
                ", nextHopId='" + nextHopId + '\'' +
                ", routeType=" + routeType +
                ", status='" + status + '\'' +
                '}';
    }
}
