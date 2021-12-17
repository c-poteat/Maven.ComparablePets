package io.zipcoder;

import java.util.ArrayList;

public class Cat extends Pet {
    ArrayList<String> catPromptString;

    public Cat(String name, ArrayList<String> catPromptString) {
        super(name);
        this.catPromptString = catPromptString;

    }

    public Cat() {
        super();
    }

    @Override
    public String speak() {
        return "meow";
    }

}
