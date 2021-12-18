package io.zipcoder;

public class Pet implements Comparable{
    private String name;
    String[] typeOfPetArray;
    String[] namesOfPets;

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

    public Pet(String name, String[] typeOfPetArray, String[] namesOfPets) {
        this.name = name;
        this.typeOfPetArray = typeOfPetArray;
        this.namesOfPets = namesOfPets;
    }

    public String speak() {
        return "speak";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
