package domain;

/**
 * 流量方向枚举
 */
public enum TrafficDirection {
    /**
     * 入站流量
     */
    INGRESS("ingress"),

    /**
     * 出站流量
     */
    EGRESS("egress");

    private final String value;

    TrafficDirection(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static TrafficDirection fromValue(String value) {
        for (TrafficDirection direction : values()) {
            if (direction.value.equalsIgnoreCase(value)) {
                return direction;
            }
        }
        return INGRESS;
    }
}
