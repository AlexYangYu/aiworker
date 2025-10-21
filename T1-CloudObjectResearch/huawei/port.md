# 华为云Port

```Text
class ListPortsResponse {
    ports: [class Port {
        id: 2578f781-4a51-40ef-bd7f-89228f2d1e0a
        name: 
        networkId: b423de68-3a68-45e1-b536-6eda49d6a00f
        adminStateUp: true
        macAddress: fa:16:3e:57:1b:f7
        fixedIps: [class FixedIp {
            ipAddress: 192.168.1.254
            subnetId: f2c211d7-3803-4119-b3bb-eb962c8ba69a
        }]
        deviceId: 
        deviceOwner: network:dhcp
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        status: DOWN
        securityGroups: []
        allowedAddressPairs: []
        extraDhcpOpts: []
        bindingVnicType: normal
        dnsAssignment: null
        dnsName: null
        bindingVifDetails: class BindingVifDetails {
            primaryInterface: null
            portFilter: null
            ovsHybridPlug: null
        }
        bindingProfile: {}
        instanceId: 
        instanceType: 
        portSecurityEnabled: false
        zoneId: 
        enableEfi: false
        ipv6BandwidthId: null
    }, class Port {
        id: 4290ad43-d5d8-44d1-8e0d-ae796f8dfe12
        name: 
        networkId: 11596ed4-3612-4956-8b92-58983159bb81
        adminStateUp: true
        macAddress: fa:16:3e:2f:30:8e
        fixedIps: [class FixedIp {
            ipAddress: 10.0.1.95
            subnetId: 04b45dfa-1a96-474a-b4b5-a4b1af2bb32e
        }]
        deviceId: dd5e75fc-08f9-4610-b152-a721172c09cd
        deviceOwner: compute:cn-southwest-2a
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        status: ACTIVE
        securityGroups: [3b004224-ce59-401d-8fef-e91a9fe0fb91, 34619057-3789-452d-8d99-10532ade8cb7]
        allowedAddressPairs: []
        extraDhcpOpts: []
        bindingVnicType: normal
        dnsAssignment: null
        dnsName: null
        bindingVifDetails: class BindingVifDetails {
            primaryInterface: true
            portFilter: null
            ovsHybridPlug: null
        }
        bindingProfile: {}
        instanceId: 
        instanceType: 
        portSecurityEnabled: true
        zoneId: 
        enableEfi: false
        ipv6BandwidthId: null
    }, class Port {
        id: 66af493d-ad91-4340-b398-83c6fa643c1f
        name: f2c211d7-3803-4119-b3bb-eb962c8ba69a
        networkId: b423de68-3a68-45e1-b536-6eda49d6a00f
        adminStateUp: true
        macAddress: fa:16:3e:7a:29:28
        fixedIps: [class FixedIp {
            ipAddress: 192.168.1.1
            subnetId: f2c211d7-3803-4119-b3bb-eb962c8ba69a
        }]
        deviceId: dc2cceef-fe1f-4311-8204-43b47a0c2ec8
        deviceOwner: network:router_interface_distributed
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        status: DOWN
        securityGroups: [cc9152c6-ec39-4d4e-882e-74bb07024615]
        allowedAddressPairs: []
        extraDhcpOpts: []
        bindingVnicType: normal
        dnsAssignment: null
        dnsName: null
        bindingVifDetails: class BindingVifDetails {
            primaryInterface: null
            portFilter: null
            ovsHybridPlug: null
        }
        bindingProfile: {}
        instanceId: 
        instanceType: 
        portSecurityEnabled: true
        zoneId: 
        enableEfi: false
        ipv6BandwidthId: null
    }, class Port {
        id: 6e5ee64f-70cc-474a-a80c-30b88a347a4f
        name: 
        networkId: 11596ed4-3612-4956-8b92-58983159bb81
        adminStateUp: true
        macAddress: fa:16:3e:2f:30:6a
        fixedIps: [class FixedIp {
            ipAddress: 10.0.1.59
            subnetId: 04b45dfa-1a96-474a-b4b5-a4b1af2bb32e
        }]
        deviceId: de9a6d63-087c-486f-9249-ae3f4969cf4b
        deviceOwner: compute:cn-southwest-2a
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        status: ACTIVE
        securityGroups: [e8ea1cfd-2605-47f9-a8ac-f53e451f3566]
        allowedAddressPairs: []
        extraDhcpOpts: []
        bindingVnicType: normal
        dnsAssignment: null
        dnsName: null
        bindingVifDetails: class BindingVifDetails {
            primaryInterface: true
            portFilter: null
            ovsHybridPlug: null
        }
        bindingProfile: {}
        instanceId: 
        instanceType: 
        portSecurityEnabled: true
        zoneId: 
        enableEfi: false
        ipv6BandwidthId: null
    }, class Port {
        id: 7457ccb4-9829-4286-a0fd-8db54a705815
        name: c2e5afc0-f5d6-450d-860c-51ae001e7bf6
        networkId: 35352fbb-80a2-431d-899f-78da6d9f49e7
        adminStateUp: true
        macAddress: fa:16:3e:2e:0f:70
        fixedIps: [class FixedIp {
            ipAddress: 192.168.0.1
            subnetId: c2e5afc0-f5d6-450d-860c-51ae001e7bf6
        }]
        deviceId: dc2cceef-fe1f-4311-8204-43b47a0c2ec8
        deviceOwner: network:router_interface_distributed
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        status: DOWN
        securityGroups: [cc9152c6-ec39-4d4e-882e-74bb07024615]
        allowedAddressPairs: []
        extraDhcpOpts: []
        bindingVnicType: normal
        dnsAssignment: null
        dnsName: null
        bindingVifDetails: class BindingVifDetails {
            primaryInterface: null
            portFilter: null
            ovsHybridPlug: null
        }
        bindingProfile: {}
        instanceId: 
        instanceType: 
        portSecurityEnabled: true
        zoneId: 
        enableEfi: false
        ipv6BandwidthId: null
    }, class Port {
        id: b1ab980e-f053-4602-94ee-717a37b88977
        name: 04b45dfa-1a96-474a-b4b5-a4b1af2bb32e
        networkId: 11596ed4-3612-4956-8b92-58983159bb81
        adminStateUp: true
        macAddress: fa:16:3e:bc:f2:32
        fixedIps: [class FixedIp {
            ipAddress: 10.0.1.1
            subnetId: 04b45dfa-1a96-474a-b4b5-a4b1af2bb32e
        }]
        deviceId: 127fd10f-349b-4d6b-b2cf-c69dd3eb712f
        deviceOwner: network:router_interface_distributed
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        status: DOWN
        securityGroups: [cc9152c6-ec39-4d4e-882e-74bb07024615]
        allowedAddressPairs: []
        extraDhcpOpts: []
        bindingVnicType: normal
        dnsAssignment: null
        dnsName: null
        bindingVifDetails: class BindingVifDetails {
            primaryInterface: null
            portFilter: null
            ovsHybridPlug: null
        }
        bindingProfile: {}
        instanceId: 
        instanceType: 
        portSecurityEnabled: true
        zoneId: 
        enableEfi: false
        ipv6BandwidthId: null
    }, class Port {
        id: d6febf14-b356-40cd-a39c-c15bf88d0bd7
        name: 
        networkId: 1d4aaf45-e11a-4b1d-8000-1831af827ed0
        adminStateUp: true
        macAddress: fa:16:3e:d9:31:30
        fixedIps: [class FixedIp {
            ipAddress: 192.168.0.254
            subnetId: 66f21d60-50da-40b6-aeca-e6feed028ee6
        }]
        deviceId: 
        deviceOwner: network:dhcp
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        status: DOWN
        securityGroups: []
        allowedAddressPairs: []
        extraDhcpOpts: []
        bindingVnicType: normal
        dnsAssignment: null
        dnsName: null
        bindingVifDetails: class BindingVifDetails {
            primaryInterface: null
            portFilter: null
            ovsHybridPlug: null
        }
        bindingProfile: {}
        instanceId: 
        instanceType: 
        portSecurityEnabled: false
        zoneId: 54dcaf4e57c04f368767674f5a4048ab
        enableEfi: false
        ipv6BandwidthId: null
    }, class Port {
        id: e55320f5-abd9-4757-85dc-a68b2efda94d
        name: 
        networkId: 11596ed4-3612-4956-8b92-58983159bb81
        adminStateUp: true
        macAddress: fa:16:3e:e3:ce:f6
        fixedIps: [class FixedIp {
            ipAddress: 10.0.1.254
            subnetId: 04b45dfa-1a96-474a-b4b5-a4b1af2bb32e
        }]
        deviceId: 
        deviceOwner: network:dhcp
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        status: DOWN
        securityGroups: []
        allowedAddressPairs: []
        extraDhcpOpts: []
        bindingVnicType: normal
        dnsAssignment: null
        dnsName: null
        bindingVifDetails: class BindingVifDetails {
            primaryInterface: null
            portFilter: null
            ovsHybridPlug: null
        }
        bindingProfile: {}
        instanceId: 
        instanceType: 
        portSecurityEnabled: false
        zoneId: 
        enableEfi: false
        ipv6BandwidthId: null
    }, class Port {
        id: f0b46213-3a10-45e7-a7e1-d9924d47c8e6
        name: 
        networkId: 35352fbb-80a2-431d-899f-78da6d9f49e7
        adminStateUp: true
        macAddress: fa:16:3e:81:ae:f3
        fixedIps: [class FixedIp {
            ipAddress: 192.168.0.254
            subnetId: c2e5afc0-f5d6-450d-860c-51ae001e7bf6
        }]
        deviceId: 
        deviceOwner: network:dhcp
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        status: DOWN
        securityGroups: []
        allowedAddressPairs: []
        extraDhcpOpts: []
        bindingVnicType: normal
        dnsAssignment: null
        dnsName: null
        bindingVifDetails: class BindingVifDetails {
            primaryInterface: null
            portFilter: null
            ovsHybridPlug: null
        }
        bindingProfile: {}
        instanceId: 
        instanceType: 
        portSecurityEnabled: false
        zoneId: 
        enableEfi: false
        ipv6BandwidthId: null
    }, class Port {
        id: f948eb11-7827-4fff-acc1-b4c29d36e47e
        name: 66f21d60-50da-40b6-aeca-e6feed028ee6
        networkId: 1d4aaf45-e11a-4b1d-8000-1831af827ed0
        adminStateUp: true
        macAddress: fa:16:3e:d9:31:32
        fixedIps: [class FixedIp {
            ipAddress: 192.168.0.1
            subnetId: 66f21d60-50da-40b6-aeca-e6feed028ee6
        }]
        deviceId: 64bf40b5-f847-483a-b635-80cb43268c0a
        deviceOwner: network:router_interface_distributed
        tenantId: 3ddd4de9088e40caa5ea251b148f8d2c
        status: DOWN
        securityGroups: [cc9152c6-ec39-4d4e-882e-74bb07024615]
        allowedAddressPairs: []
        extraDhcpOpts: []
        bindingVnicType: normal
        dnsAssignment: null
        dnsName: null
        bindingVifDetails: class BindingVifDetails {
            primaryInterface: null
            portFilter: null
            ovsHybridPlug: null
        }
        bindingProfile: {}
        instanceId: 
        instanceType: 
        portSecurityEnabled: true
        zoneId: 54dcaf4e57c04f368767674f5a4048ab
        enableEfi: false
        ipv6BandwidthId: null
    }]
}
```
