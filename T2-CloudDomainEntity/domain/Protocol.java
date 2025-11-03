package domain;

/**
 * 网络协议枚举
 */
public enum Protocol {
    TCP("tcp"),
    UDP("udp"),
    ICMP("icmp"),
    ICMPv6("icmpv6"),
    ALL("all");

    private final String value;

    Protocol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Protocol fromValue(String value) {
        if (value == null) {
            return ALL;
        }
        for (Protocol protocol : values()) {
            if (protocol.value.equalsIgnoreCase(value)) {
                return protocol;
            }
        }
        return ALL;
    }
}
