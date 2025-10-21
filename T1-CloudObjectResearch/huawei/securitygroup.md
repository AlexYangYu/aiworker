# 华为云安全组

## Security Group

```Text
class ListSecurityGroupsResponse {
    securityGroups: [class SecurityGroup {
        name: Sys-FullAccess
        description: 
        id: 2828d3f7-8ac8-4e83-ad29-6964e60604f9
        vpcId: null
        enterpriseProjectId: 0
        securityGroupRules: [class SecurityGroupRule {
            id: 1b164cd3-6c28-478f-b115-2495fe4935f9
            description: null
            securityGroupId: 2828d3f7-8ac8-4e83-ad29-6964e60604f9
            direction: ingress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: 2828d3f7-8ac8-4e83-ad29-6964e60604f9
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 4659b33b-8005-448d-8b62-9e6063f290ef
            description: null
            securityGroupId: 2828d3f7-8ac8-4e83-ad29-6964e60604f9
            direction: ingress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: ::/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 9aad87b0-8a71-4ca6-be5f-b315efc877b1
            description: null
            securityGroupId: 2828d3f7-8ac8-4e83-ad29-6964e60604f9
            direction: ingress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: 2828d3f7-8ac8-4e83-ad29-6964e60604f9
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 9bacb432-ea39-4f5d-87d1-6333f1515e2f
            description: null
            securityGroupId: 2828d3f7-8ac8-4e83-ad29-6964e60604f9
            direction: egress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: ::/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: e2db46ff-a47b-431b-a43c-09d9a752c188
            description: null
            securityGroupId: 2828d3f7-8ac8-4e83-ad29-6964e60604f9
            direction: ingress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: 0.0.0.0/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: f00fb62d-3912-46a0-a42e-902c69fccf75
            description: null
            securityGroupId: 2828d3f7-8ac8-4e83-ad29-6964e60604f9
            direction: egress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: 0.0.0.0/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }]
    }, class SecurityGroup {
        name: cloudman-sg-c
        description: Security Group C for CloudMan testing
        id: 34619057-3789-452d-8d99-10532ade8cb7
        vpcId: null
        enterpriseProjectId: 0
        securityGroupRules: [class SecurityGroupRule {
            id: b0a6e164-2023-40a6-b672-c7c41cd2fc1a
            description: Deny ICMP from Instance A
            securityGroupId: 34619057-3789-452d-8d99-10532ade8cb7
            direction: ingress
            ethertype: IPv4
            protocol: icmp
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: 10.0.1.59/32
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 10af952f-8824-4c3b-9b92-050707af8c19
            description: null
            securityGroupId: 34619057-3789-452d-8d99-10532ade8cb7
            direction: ingress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: 34619057-3789-452d-8d99-10532ade8cb7
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 2dfdf13b-0043-4962-b49d-0c120f5fe07a
            description: null
            securityGroupId: 34619057-3789-452d-8d99-10532ade8cb7
            direction: egress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 37f6f1d1-4704-443d-a4f6-d3608f9153bb
            description: null
            securityGroupId: 34619057-3789-452d-8d99-10532ade8cb7
            direction: ingress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: 34619057-3789-452d-8d99-10532ade8cb7
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: f55acc2a-14e0-4e52-90db-db38a2686de6
            description: null
            securityGroupId: 34619057-3789-452d-8d99-10532ade8cb7
            direction: egress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }]
    }, class SecurityGroup {
        name: cloudman-sg-b
        description: Security Group B for CloudMan testing
        id: 3b004224-ce59-401d-8fef-e91a9fe0fb91
        vpcId: null
        enterpriseProjectId: 0
        securityGroupRules: [class SecurityGroupRule {
            id: 28897a0d-10fc-474d-bd53-4fdba227472c
            description: Allow ICMP from same subnet
            securityGroupId: 3b004224-ce59-401d-8fef-e91a9fe0fb91
            direction: ingress
            ethertype: IPv4
            protocol: icmp
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: 10.0.1.0/24
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: c45bd051-eafd-4da1-9514-7729c99eb8ea
            description: Allow SSH for testing
            securityGroupId: 3b004224-ce59-401d-8fef-e91a9fe0fb91
            direction: ingress
            ethertype: IPv4
            protocol: tcp
            portRangeMin: 22
            portRangeMax: 22
            remoteIpPrefix: 0.0.0.0/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 59c07e4a-1464-44bf-92df-29a882ff1ccf
            description: null
            securityGroupId: 3b004224-ce59-401d-8fef-e91a9fe0fb91
            direction: egress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 99eece4d-eed4-496b-b9ab-33ee3a059d52
            description: null
            securityGroupId: 3b004224-ce59-401d-8fef-e91a9fe0fb91
            direction: ingress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: 3b004224-ce59-401d-8fef-e91a9fe0fb91
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 9ed7d8a2-d0bc-41e4-a0c1-3f6e023cfc3a
            description: null
            securityGroupId: 3b004224-ce59-401d-8fef-e91a9fe0fb91
            direction: egress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: b3ec369f-8316-49ba-ba95-5d27e5f16f22
            description: null
            securityGroupId: 3b004224-ce59-401d-8fef-e91a9fe0fb91
            direction: ingress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: 3b004224-ce59-401d-8fef-e91a9fe0fb91
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }]
    }, class SecurityGroup {
        name: Sys-default
        description: default
        id: cc9152c6-ec39-4d4e-882e-74bb07024615
        vpcId: default
        enterpriseProjectId: 0
        securityGroupRules: [class SecurityGroupRule {
            id: 41fab851-9471-4b50-b3b0-a342c0ca0aab
            description: Permit default Windows remote desktop port.
            securityGroupId: cc9152c6-ec39-4d4e-882e-74bb07024615
            direction: ingress
            ethertype: IPv4
            protocol: tcp
            portRangeMin: 3389
            portRangeMax: 3389
            remoteIpPrefix: 0.0.0.0/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 8eb86653-9ea1-4da9-8257-ee5a8b9905fa
            description: Permit default Linux SSH port.
            securityGroupId: cc9152c6-ec39-4d4e-882e-74bb07024615
            direction: ingress
            ethertype: IPv4
            protocol: tcp
            portRangeMin: 22
            portRangeMax: 22
            remoteIpPrefix: 0.0.0.0/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 227c646d-6784-4016-84fc-d4b57de5604f
            description: null
            securityGroupId: cc9152c6-ec39-4d4e-882e-74bb07024615
            direction: ingress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: cc9152c6-ec39-4d4e-882e-74bb07024615
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 6497644f-8e07-44be-b082-73b223944597
            description: null
            securityGroupId: cc9152c6-ec39-4d4e-882e-74bb07024615
            direction: egress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 70892090-ee20-444c-b170-690b8c90e68b
            description: null
            securityGroupId: cc9152c6-ec39-4d4e-882e-74bb07024615
            direction: egress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: cca270db-e436-4588-ab8c-dd2b723b463d
            description: null
            securityGroupId: cc9152c6-ec39-4d4e-882e-74bb07024615
            direction: ingress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: cc9152c6-ec39-4d4e-882e-74bb07024615
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }]
    }, class SecurityGroup {
        name: Sys-WebServer
        description: 
        id: d46c54a0-72b7-46b5-a410-93899f75e772
        vpcId: null
        enterpriseProjectId: 0
        securityGroupRules: [class SecurityGroupRule {
            id: 207ed90a-1bf8-4436-982a-550a3489195d
            description: null
            securityGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            direction: ingress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 528f8ce0-c44a-47d6-8598-8ee926065113
            description: null
            securityGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            direction: egress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: 0.0.0.0/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 718c5199-273c-4988-80e4-92bd5348346b
            description: null
            securityGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            direction: ingress
            ethertype: IPv4
            protocol: tcp
            portRangeMin: 3389
            portRangeMax: 3389
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 92e6c02b-aa9b-49e9-af00-c9159e240898
            description: null
            securityGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            direction: ingress
            ethertype: IPv4
            protocol: icmp
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: 0.0.0.0/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 981ed8b8-3821-47fe-b6d8-45abea9479ff
            description: null
            securityGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            direction: ingress
            ethertype: IPv4
            protocol: tcp
            portRangeMin: 443
            portRangeMax: 443
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: b029785d-61f4-4d35-bc1c-84d895a4a49f
            description: null
            securityGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            direction: ingress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: cf6ba71d-f9e9-49f6-9d1d-ed063c6fd4be
            description: null
            securityGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            direction: egress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: ::/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: db7a25d3-8f07-4010-897e-3eddbc613e70
            description: null
            securityGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            direction: ingress
            ethertype: IPv4
            protocol: tcp
            portRangeMin: 80
            portRangeMax: 80
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: eccef9ce-4d3d-4eca-969d-248fe1b1be18
            description: null
            securityGroupId: d46c54a0-72b7-46b5-a410-93899f75e772
            direction: ingress
            ethertype: IPv4
            protocol: tcp
            portRangeMin: 22
            portRangeMax: 22
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }]
    }, class SecurityGroup {
        name: cloudman-sg-a
        description: Security Group A for CloudMan testing
        id: e8ea1cfd-2605-47f9-a8ac-f53e451f3566
        vpcId: null
        enterpriseProjectId: 0
        securityGroupRules: [class SecurityGroupRule {
            id: 545ea7cf-e26e-41de-b719-8cfcaf827c74
            description: Allow ICMP from same subnet
            securityGroupId: e8ea1cfd-2605-47f9-a8ac-f53e451f3566
            direction: ingress
            ethertype: IPv4
            protocol: icmp
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: 10.0.1.0/24
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 0b79b7d3-6827-40ac-ab6f-a947d3d2c8a5
            description: Allow SSH for testing
            securityGroupId: e8ea1cfd-2605-47f9-a8ac-f53e451f3566
            direction: ingress
            ethertype: IPv4
            protocol: tcp
            portRangeMin: 22
            portRangeMax: 22
            remoteIpPrefix: 0.0.0.0/0
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 270b3a8d-6864-49e9-9f99-4a79a4b0dd6c
            description: null
            securityGroupId: e8ea1cfd-2605-47f9-a8ac-f53e451f3566
            direction: ingress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: e8ea1cfd-2605-47f9-a8ac-f53e451f3566
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 382fedd0-8318-4b7e-a7b3-51215947b302
            description: null
            securityGroupId: e8ea1cfd-2605-47f9-a8ac-f53e451f3566
            direction: egress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 4e6af53a-256a-4921-8774-fe60c431cf7c
            description: null
            securityGroupId: e8ea1cfd-2605-47f9-a8ac-f53e451f3566
            direction: ingress
            ethertype: IPv6
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: e8ea1cfd-2605-47f9-a8ac-f53e451f3566
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }, class SecurityGroupRule {
            id: 6218ea61-0ec4-40b2-9287-40ad52961444
            description: null
            securityGroupId: e8ea1cfd-2605-47f9-a8ac-f53e451f3566
            direction: egress
            ethertype: IPv4
            protocol: null
            portRangeMin: null
            portRangeMax: null
            remoteIpPrefix: null
            remoteGroupId: null
            remoteAddressGroupId: null
            tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        }]
    }]
}
```
