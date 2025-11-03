package domain;

/**
 * 规则动作枚举
 */
public enum RuleAction {
    /**
     * 允许
     */
    ALLOW("allow", "accept"),

    /**
     * 拒绝
     */
    DENY("deny", "drop");

    private final String[] values;

    RuleAction(String... values) {
        this.values = values;
    }

    public String[] getValues() {
        return values;
    }

    public String getPrimaryValue() {
        return values[0];
    }

    public static RuleAction fromValue(String value) {
        if (value == null) {
            return ALLOW;
        }
        for (RuleAction action : values()) {
            for (String v : action.values) {
                if (v.equalsIgnoreCase(value)) {
                    return action;
                }
            }
        }
        return ALLOW;
    }
}
