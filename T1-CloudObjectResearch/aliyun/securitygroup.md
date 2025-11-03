# 阿里云安全组

## SecurityGroup

```Text
----- Security Group [sg-f8zh9j3cnae6zxbc5azk] -----
GroupId: sg-f8zh9j3cnae6zxbc5azk
GroupName: cloudman-sg-a
SecurityGroupType: normal
VPCId: vpc-f8zb4btgfwkrukbuyt0t7
RuleCount: 2
GroupToGroupRuleCount: 0
InstanceCount: 1
AvailableInstanceAmount: 5999
Description:
CreationTime: 2025-11-03T03:46:57Z
Tags:
ResourceGroupId:
ServiceID: null
ServiceManaged: false
InnerAccessPolicy: Accept
 Description:
 ---- Rules ----
  RuleId: sgr-f8z0v38u3k9agy2yq8ec
  Direction: ingress
  Policy: Accept
  Priority: 1
  IpProtocol: ICMP
  SourceCidrIp: 10.0.1.0/24
  Ipv6SourceCidrIp:
  SourceGroupId:
  SourceGroupName:
  DestGroupOwnerAccount:
  SourcePrefixListId:
  SourcePrefixListName:
  SourcePortRange: -1/-1
  DestCidrIp:
  Ipv6DestCidrIp:
  DestGroupId:
  DestGroupName:
  DestGroupOwnerAccount:
  DestPrefixListId:
  DestPrefixListName:
  PortRangeListId:
  PortRangeListName:
  PortRange: -1/-1
  NicType: intranet
  Description: Allow ICMP from same subnet
  CreateTime: 2025-11-03T03:47:01Z

  RuleId: sgr-f8zc24ojqj3wc48704d9
  Direction: ingress
  Policy: Accept
  Priority: 1
  IpProtocol: TCP
  SourceCidrIp: 0.0.0.0/0
  Ipv6SourceCidrIp:
  SourceGroupId:
  SourceGroupName:
  DestGroupOwnerAccount:
  SourcePrefixListId:
  SourcePrefixListName:
  SourcePortRange:
  DestCidrIp:
  Ipv6DestCidrIp:
  DestGroupId:
  DestGroupName:
  DestGroupOwnerAccount:
  DestPrefixListId:
  DestPrefixListName:
  PortRangeListId:
  PortRangeListName:
  PortRange: 22/22
  NicType: intranet
  Description: Allow SSH for testing
  CreateTime: 2025-11-03T03:46:57Z

 ----------------
--------------------------------

----- Security Group [sg-f8z39a5cmwue4rbteneu] -----
GroupId: sg-f8z39a5cmwue4rbteneu
GroupName: cloudman-sg-b
SecurityGroupType: normal
VPCId: vpc-f8zb4btgfwkrukbuyt0t7
RuleCount: 2
GroupToGroupRuleCount: 0
InstanceCount: 1
AvailableInstanceAmount: 5999
Description:
CreationTime: 2025-11-03T03:46:57Z
Tags:
ResourceGroupId:
ServiceID: null
ServiceManaged: false
InnerAccessPolicy: Accept
 Description:
 ---- Rules ----
  RuleId: sgr-f8zgkawo6cmqwu6mv9m8
  Direction: ingress
  Policy: Accept
  Priority: 1
  IpProtocol: ICMP
  SourceCidrIp: 10.0.1.0/24
  Ipv6SourceCidrIp:
  SourceGroupId:
  SourceGroupName:
  DestGroupOwnerAccount:
  SourcePrefixListId:
  SourcePrefixListName:
  SourcePortRange: -1/-1
  DestCidrIp:
  Ipv6DestCidrIp:
  DestGroupId:
  DestGroupName:
  DestGroupOwnerAccount:
  DestPrefixListId:
  DestPrefixListName:
  PortRangeListId:
  PortRangeListName:
  PortRange: -1/-1
  NicType: intranet
  Description: Allow ICMP from same subnet
  CreateTime: 2025-11-03T03:47:01Z

  RuleId: sgr-f8z39a5cmwue4rbw5oq1
  Direction: ingress
  Policy: Accept
  Priority: 1
  IpProtocol: TCP
  SourceCidrIp: 0.0.0.0/0
  Ipv6SourceCidrIp:
  SourceGroupId:
  SourceGroupName:
  DestGroupOwnerAccount:
  SourcePrefixListId:
  SourcePrefixListName:
  SourcePortRange:
  DestCidrIp:
  Ipv6DestCidrIp:
  DestGroupId:
  DestGroupName:
  DestGroupOwnerAccount:
  DestPrefixListId:
  DestPrefixListName:
  PortRangeListId:
  PortRangeListName:
  PortRange: 22/22
  NicType: intranet
  Description: Allow SSH for testing
  CreateTime: 2025-11-03T03:46:57Z

 ----------------
--------------------------------

----- Security Group [sg-f8z4xvsk3kxke16pcttj] -----
GroupId: sg-f8z4xvsk3kxke16pcttj
GroupName: cloudman-sg-c
SecurityGroupType: normal
VPCId: vpc-f8zb4btgfwkrukbuyt0t7
RuleCount: 1
GroupToGroupRuleCount: 0
InstanceCount: 1
AvailableInstanceAmount: 5999
Description:
CreationTime: 2025-11-03T03:46:57Z
Tags:
ResourceGroupId:
ServiceID: null
ServiceManaged: false
InnerAccessPolicy: Accept
 Description:
 ---- Rules ----
  RuleId: sgr-f8zduqwbvzibvfn4ubg0
  Direction: ingress
  Policy: Drop
  Priority: 1
  IpProtocol: ICMP
  SourceCidrIp: 10.0.1.114
  Ipv6SourceCidrIp:
  SourceGroupId:
  SourceGroupName:
  DestGroupOwnerAccount:
  SourcePrefixListId:
  SourcePrefixListName:
  SourcePortRange: -1/-1
  DestCidrIp:
  Ipv6DestCidrIp:
  DestGroupId:
  DestGroupName:
  DestGroupOwnerAccount:
  DestPrefixListId:
  DestPrefixListName:
  PortRangeListId:
  PortRangeListName:
  PortRange: -1/-1
  NicType: intranet
  Description: Deny ICMP from Instance A
  CreateTime: 2025-11-03T03:47:12Z

 ----------------
--------------------------------
```
