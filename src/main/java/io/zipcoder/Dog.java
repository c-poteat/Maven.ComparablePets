package io.zipcoder;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    @Override
    public String speak() {
        return "woof";
    }
}
