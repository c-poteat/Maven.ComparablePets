package io.zipcoder;

public class Pet implements Comparable<Pet> {
    private String name;
    String[] typeOfPetArray;
    String[] namesOfPets;

    public Pet(String name, String[] typeOfPetArray, String[] namesOfPets) {
        this.name = name;
        this.typeOfPetArray = typeOfPetArray;
        this.namesOfPets = namesOfPets;
    }

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

    public String speak() {
        return "speak";
    }

    @Override
    public int compareTo(Pet type) {
        for (int i = 0; i < typeOfPetArray.length; i++) {
            for (int j = 0; j < typeOfPetArray.length; j++)
                if (this.typeOfPetArray[i].equals(type.typeOfPetArray[j])) {
                    return 0;
                }
        }
        return -1;
    }
}



