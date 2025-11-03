# 阿里云vRouter

## vRouter

```text
----- VRouter -----
VRouterId: vrt-f8zvi5rss7cwfdbn6g5ss
VRouterName:
VpcId: vpc-f8zb4btgfwkrukbuyt0t7
RegionId: cn-heyuan
Description:
CreationTime: 2025-11-03T03:46:53Z
RouteTableIds:
  vtb-f8ztj2jst5q3w1b7v49ct
  ----- Route Table Details -----
  VpcId: vpc-f8zb4btgfwkrukbuyt0t7
  OwnerId: 1242028158732421
  RouteTableId: vtb-f8ztj2jst5q3w1b7v49ct
  RouteTableName:
  RouteTableType: System
  Status: Available
  ResourceGroupId: rg-acfmxdfcyen4rbi
  CreationTime: 2025-11-03T03:46:53Z
  Description:
  RoutePropagation: true
  AssociateType: VSwitch
  VSwitchIds:
    - vsw-f8zlbgzx87xyqjmvddwvy
  GatewayIds:
  Tags:
  RouteEntries:
    --- Route Entry ---
    Status: Available
    Origin: SystemCreate
    RouteEntryId:
    RouteEntryName:
    Type: System
    Description: Created with VSwitch(vsw-f8zlbgzx87xyqjmvddwvy) by system.
    RouteTableId: vtb-f8ztj2jst5q3w1b7v49ct
    IpVersion: ipv4
    ServiceType: SYSTEM
    DestinationCidrBlock: 10.0.1.0/24
    GmtModified: 2025-11-03T03:46:57Z
    NextHops:
      Enabled: null
      NextHopType: local
      NextHopRegionId: null
      NextHopId:
      NextHopRelatedInfo: com.aliyun.sdk.service.vpc20160428.models.DescribeRouteEntryListResponseBody$NextHopRelatedInfo@73475ca2
      Weight: null
    -------------------
    --- Route Entry ---
    Status: Available
    Origin: SystemCreate
    RouteEntryId:
    RouteEntryName:
    Type: System
    Description: Created by system.
    RouteTableId: vtb-f8ztj2jst5q3w1b7v49ct
    IpVersion: ipv4
    ServiceType: SYSTEM
    DestinationCidrBlock: 100.64.0.0/10
    GmtModified: 2025-11-03T03:46:55Z
    NextHops:
      Enabled: null
      NextHopType: service
      NextHopRegionId: null
      NextHopId:
      NextHopRelatedInfo: com.aliyun.sdk.service.vpc20160428.models.DescribeRouteEntryListResponseBody$NextHopRelatedInfo@793283dd
      Weight: null
    -------------------
  -------------------------------
-------------------

----- VRouter -----
VRouterId: vrt-f8zluwyf2em0utyv1sw8d
VRouterName:
VpcId: vpc-f8zg0onoom38gqg2dixik
RegionId: cn-heyuan
Description:
CreationTime: 2025-10-21T16:28:48Z
RouteTableIds:
  vtb-f8zodg4wvngl759k3b4mm
  ----- Route Table Details -----
  VpcId: vpc-f8zg0onoom38gqg2dixik
  OwnerId: 1242028158732421
  RouteTableId: vtb-f8zodg4wvngl759k3b4mm
  RouteTableName:
  RouteTableType: System
  Status: Available
  ResourceGroupId: rg-acfmxdfcyen4rbi
  CreationTime: 2025-10-21T16:28:48Z
  Description:
  RoutePropagation: true
  AssociateType: VSwitch
  VSwitchIds:
    - vsw-f8zg0onoommxz0pss1y6l
    - vsw-f8zfqi9vgyzhyyly5itll
    - vsw-f8zuirmot7irmsjlfl5qz
    - vsw-f8zqpr41h7aomre5hgbiv
  GatewayIds:
  Tags:
  RouteEntries:
    --- Route Entry ---
    Status: Available
    Origin: SystemCreate
    RouteEntryId:
    RouteEntryName:
    Type: System
    Description: Created with VSwitch(vsw-f8zuirmot7irmsjlfl5qz) by system.
    RouteTableId: vtb-f8zodg4wvngl759k3b4mm
    IpVersion: ipv4
    ServiceType: SYSTEM
    DestinationCidrBlock: 172.16.4.0/24
    GmtModified: 2025-10-21T16:28:52Z
    NextHops:
      Enabled: null
      NextHopType: local
      NextHopRegionId: null
      NextHopId:
      NextHopRelatedInfo: com.aliyun.sdk.service.vpc20160428.models.DescribeRouteEntryListResponseBody$NextHopRelatedInfo@3cc4feba
      Weight: null
    -------------------
    --- Route Entry ---
    Status: Available
    Origin: SystemCreate
    RouteEntryId:
    RouteEntryName:
    Type: System
    Description: Created with VSwitch(vsw-f8zfqi9vgyzhyyly5itll) by system.
    RouteTableId: vtb-f8zodg4wvngl759k3b4mm
    IpVersion: ipv4
    ServiceType: SYSTEM
    DestinationCidrBlock: 172.16.3.0/24
    GmtModified: 2025-10-21T16:28:52Z
    NextHops:
      Enabled: null
      NextHopType: local
      NextHopRegionId: null
      NextHopId:
      NextHopRelatedInfo: com.aliyun.sdk.service.vpc20160428.models.DescribeRouteEntryListResponseBody$NextHopRelatedInfo@22343802
      Weight: null
    -------------------
    --- Route Entry ---
    Status: Available
    Origin: SystemCreate
    RouteEntryId:
    RouteEntryName:
    Type: System
    Description: Created with VSwitch(vsw-f8zg0onoommxz0pss1y6l) by system.
    RouteTableId: vtb-f8zodg4wvngl759k3b4mm
    IpVersion: ipv4
    ServiceType: SYSTEM
    DestinationCidrBlock: 172.16.2.0/24
    GmtModified: 2025-10-21T16:28:52Z
    NextHops:
      Enabled: null
      NextHopType: local
      NextHopRegionId: null
      NextHopId:
      NextHopRelatedInfo: com.aliyun.sdk.service.vpc20160428.models.DescribeRouteEntryListResponseBody$NextHopRelatedInfo@6bdfc2aa
      Weight: null
    -------------------
    --- Route Entry ---
    Status: Available
    Origin: SystemCreate
    RouteEntryId:
    RouteEntryName:
    Type: System
    Description: Created with VSwitch(vsw-f8zqpr41h7aomre5hgbiv) by system.
    RouteTableId: vtb-f8zodg4wvngl759k3b4mm
    IpVersion: ipv4
    ServiceType: SYSTEM
    DestinationCidrBlock: 172.16.1.0/24
    GmtModified: 2025-10-21T16:28:51Z
    NextHops:
      Enabled: null
      NextHopType: local
      NextHopRegionId: null
      NextHopId:
      NextHopRelatedInfo: com.aliyun.sdk.service.vpc20160428.models.DescribeRouteEntryListResponseBody$NextHopRelatedInfo@61e9867
      Weight: null
    -------------------
    --- Route Entry ---
    Status: Available
    Origin: SystemCreate
    RouteEntryId:
    RouteEntryName:
    Type: System
    Description: Created by system.
    RouteTableId: vtb-f8zodg4wvngl759k3b4mm
    IpVersion: ipv4
    ServiceType: SYSTEM
    DestinationCidrBlock: 100.64.0.0/10
    GmtModified: 2025-10-21T16:28:50Z
    NextHops:
      Enabled: null
      NextHopType: service
      NextHopRegionId: null
      NextHopId:
      NextHopRelatedInfo: com.aliyun.sdk.service.vpc20160428.models.DescribeRouteEntryListResponseBody$NextHopRelatedInfo@1d348730
      Weight: null
    -------------------
  -------------------------------
-------------------
```
