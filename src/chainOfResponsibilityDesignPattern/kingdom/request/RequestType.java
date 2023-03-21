package chainOfResponsibilityDesignPattern.kingdom.request;

public enum RequestType {
    LEAD_WAR("LEAD_WAR"),
    PUNISH_CULPRIT("PUNISH_CULPRIT"),
    COLLECT_TAX("COLLECT_TAX"),
    WATER_HYGIENE("WATER_HYGIENE"),
    SAFETY_RULES("SAFETY_RULES"),
    WATCH_GATE("WATCH_GATE");

    private String value;

    RequestType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "RequestType{" +
                "value='" + value + '\'' +
                '}';
    }
}
