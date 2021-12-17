package io.zipcoder;

public class Pet {
    private String name;

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }
    public String speak() {
        return "speak";
    }
}
