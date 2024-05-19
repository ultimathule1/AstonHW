package ru.aston.hms.day2.hm3.programmingLanguages;

public enum Translation {
    COMPILATION("Compilation"), INTERPRETATION("Interpretation"), JIT("JIT");

    private final String value;

    Translation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return "This translation.... -> " + value;
    }
}
