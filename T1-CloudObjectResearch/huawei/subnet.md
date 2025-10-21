# 华为云Subnet

```Text
class ListSubnetsResponse {
    subnets: [class Subnet {
        id: 11596ed4-3612-4956-8b92-58983159bb81
        name: cloudman-subnet
        description:
        cidr: 10.0.1.0/24
        gatewayIp: 10.0.1.1
        ipv6Enable: false
        cidrV6: null
        gatewayIpV6: null
        dhcpEnable: true
        primaryDns: 100.125.1.250
        secondaryDns: 100.125.129.250
        dnsList: [100.125.1.250, 100.125.129.250]
        availabilityZone:
        vpcId: 127fd10f-349b-4d6b-b2cf-c69dd3eb712f
        status: ACTIVE
        neutronNetworkId: 11596ed4-3612-4956-8b92-58983159bb81
        neutronSubnetId: 04b45dfa-1a96-474a-b4b5-a4b1af2bb32e
        neutronSubnetIdV6: null
        extraDhcpOpts: [class ExtraDhcpOption {
            optName: addresstime
            optValue: 87600h
        }]
        scope: center
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        createdAt: 2025-10-21T06:48:26Z
        updatedAt: 2025-10-21T06:48:26Z
    }, class Subnet {
        id: 1d4aaf45-e11a-4b1d-8000-1831af827ed0
        name: subnet-default
        description: subnet-default
        cidr: 192.168.0.0/24
        gatewayIp: 192.168.0.1
        ipv6Enable: false
        cidrV6: null
        gatewayIpV6: null
        dhcpEnable: true
        primaryDns: 100.125.1.250
        secondaryDns: 100.125.129.250
        dnsList: [100.125.1.250, 100.125.129.250]
        availabilityZone: cn-southwest-2b
        vpcId: 64bf40b5-f847-483a-b635-80cb43268c0a
        status: ACTIVE
        neutronNetworkId: 1d4aaf45-e11a-4b1d-8000-1831af827ed0
        neutronSubnetId: 66f21d60-50da-40b6-aeca-e6feed028ee6
        neutronSubnetIdV6: null
        extraDhcpOpts: []
        scope: center
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        createdAt: 2022-09-01T02:29:59Z
        updatedAt: 2022-09-01T02:29:59Z
    }, class Subnet {
        id: 35352fbb-80a2-431d-899f-78da6d9f49e7
        name: subnet-3e3c
        description:
        cidr: 192.168.0.0/24
        gatewayIp: 192.168.0.1
        ipv6Enable: false
        cidrV6: null
        gatewayIpV6: null
        dhcpEnable: true
        primaryDns: 100.125.1.250
        secondaryDns: 100.125.129.250
        dnsList: [100.125.1.250, 100.125.129.250]
        availabilityZone:
        vpcId: dc2cceef-fe1f-4311-8204-43b47a0c2ec8
        status: ACTIVE
        neutronNetworkId: 35352fbb-80a2-431d-899f-78da6d9f49e7
        neutronSubnetId: c2e5afc0-f5d6-450d-860c-51ae001e7bf6
        neutronSubnetIdV6: null
        extraDhcpOpts: [class ExtraDhcpOption {
            optName: addresstime
            optValue: 87600h
        }]
        scope: center
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        createdAt: 2025-10-21T07:58:27Z
        updatedAt: 2025-10-21T07:58:27Z
    }, class Subnet {
        id: b423de68-3a68-45e1-b536-6eda49d6a00f
        name: subnet-d329
        description:
        cidr: 192.168.1.0/24
        gatewayIp: 192.168.1.1
        ipv6Enable: false
        cidrV6: null
        gatewayIpV6: null
        dhcpEnable: true
        primaryDns: 100.125.1.250
        secondaryDns: 100.125.129.250
        dnsList: [100.125.1.250, 100.125.129.250]
        availabilityZone:
        vpcId: dc2cceef-fe1f-4311-8204-43b47a0c2ec8
        status: ACTIVE
        neutronNetworkId: b423de68-3a68-45e1-b536-6eda49d6a00f
        neutronSubnetId: f2c211d7-3803-4119-b3bb-eb962c8ba69a
        neutronSubnetIdV6: null
        extraDhcpOpts: [class ExtraDhcpOption {
            optName: addresstime
            optValue: 87600h
        }]
        scope: center
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        createdAt: 2025-10-21T07:58:26Z
        updatedAt: 2025-10-21T07:58:26Z
    }]
}
```
