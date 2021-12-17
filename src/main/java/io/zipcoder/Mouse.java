package io.zipcoder;

public class Mouse extends Pet {

    public Mouse(String name) {
        super(name);
    }

    public Mouse() {
    }

    @Override
    public String speak() {
        return "Squeak";
    }
}
