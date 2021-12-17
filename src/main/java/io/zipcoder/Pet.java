package io.zipcoder;

public class Pet {
    private String name;
    String[] petPromptString;

    public Pet() {
    }

    public Pet(String name) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String name, String[] petPromptString) {
        this.name = name;
        this.petPromptString = petPromptString;
    }
    public String speak() {
        return "speak";
    }
}
