package io.zipcoder;

public class Mouse extends Pet {
    String[] mousePromptString;

    public Mouse(String name, String[] mousePromptString) {
        super(name);
        this.mousePromptString = mousePromptString;

    }

    public Mouse() {
        super();
    }

    @Override
    public String speak() {
        return "Squeak";
    }
}
