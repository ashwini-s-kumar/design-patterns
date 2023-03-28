package creationalPatterns.builderDesignPattern.buildHouse.enums;

public enum RoofType {

    GABLE("GABLE"),
    DUCHED_GABLE("DUCHED_GABLE"),
    CLIPPED_GABLE("CLIPPED_GABLE"),
    FLAT("FLAT"),
    SHED("SHED");
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    RoofType(String value) {
        this.value = value;
    }
}
