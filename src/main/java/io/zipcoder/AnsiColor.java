package io.zipcoder;

public enum AnsiColor {
    RED("\u001B[31m"),
    PURPLE("\u001B[35m");
    private final String color;

    AnsiColor(String ansiColor) {
        this.color = ansiColor;
    }

    public String getColor() {
        return color;
    }
}

