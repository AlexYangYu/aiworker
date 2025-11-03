package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 路由表（Route Table）
 * 控制VPC内网络流量的路由规则集合
 */
public class RouteTable extends BaseCloudResource {
    /**
     * 所属VPC的ID
     */
    public String vpcId;

    /**
     * 关联的虚拟路由器ID（阿里云特有）
     */
    public String vRouterId;

    /**
     * 路由条目列表
     */
    public List<RouteEntry> routeEntries = new ArrayList<>();

    /**
     * 关联的子网ID列表
     */
    public List<String> subnetIds = new ArrayList<>();

    /**
     * 是否为主路由表
     */
    public boolean isMainRouteTable;

    /**
     * 路由表类型（如：System, Custom）
     */
    public String routeTableType;
}
