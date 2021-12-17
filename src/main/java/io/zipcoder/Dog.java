package io.zipcoder;

public class Dog extends Pet {
    String[] dogPromptString;

    public Dog(String name, String[] dogPromptString) {
        super(name);
        this.dogPromptString = dogPromptString;
    }

    public Dog() {
        super();
    }

    @Override
    public String speak() {
        return "woof";
    }
}
