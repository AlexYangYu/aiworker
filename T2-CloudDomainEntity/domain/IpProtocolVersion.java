package domain;

/**
 * IP协议版本枚举
 */
public enum IpProtocolVersion {
    IPv4("IPv4"),
    IPv6("IPv6");

    private final String value;

    IpProtocolVersion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
