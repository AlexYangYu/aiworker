package domain;

/**
 * 路由类型枚举
 */
public enum RouteType {
    /**
     * 系统路由
     */
    SYSTEM("system"),

    /**
     * 自定义路由
     */
    CUSTOM("custom"),

    /**
     * BGP路由
     */
    BGP("bgp");

    private final String value;

    RouteType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static RouteType fromValue(String value) {
        if (value == null) {
            return CUSTOM;
        }
        for (RouteType type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        return CUSTOM;
    }
}
