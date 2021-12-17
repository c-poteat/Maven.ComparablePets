package io.zipcoder;

import java.util.HashMap;

public class PetConsole {
    private final IOConsole console = new IOConsole(AnsiColor.PURPLE);
    private HashMap<String, String> petMap = new HashMap<String, String>();
    private Cat cat = new Cat();
    private Dog dog = new Dog();
    private Mouse mouse = new Mouse();
    private String howManyPets;
    private String petInput1;
    private String petInput2;
    private String petInput3;
    private String petName1;
    private String petName2;
    private String petName3;

    public PetConsole() {
    }

    public String getPetInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Pet Simulation!")
                .append("\nPlease Enter to Continue")
                .toString());
    }

    public void askForNumberOfPets() {
        howManyPets = console.getStringInput("Please tell us how many pets you have from 1 - 3");
        if (howManyPets.equals("1")) {
            nameAndType1();
        } else if (howManyPets.equals("2")) {
            nameAndType2();
        } else if (howManyPets.equals("3")) {
            nameAndType3();
        }
    }

    public void nameAndType1() {
        petInput1 = console.getStringInput("Please enter whether you have a Cat | Dog | Mouse");
        petName1 = console.getStringInput("Please tell us the name of your " + petInput1);
        countThePets();
    }

    public void nameAndType2() {
        petInput1 = console.getStringInput("Please enter whether you have a Cat | Dog | Mouse");
        petInput2 = console.getStringInput("Enter the second type");
        petName1 = console.getStringInput("Please tell us the name of your " + petInput1);
        petName2 = console.getStringInput("Please tell us the name of your " + petInput2);
        countThePets();
    }

    public void nameAndType3() {
        petInput1 = console.getStringInput("Please enter whether you have a Cat | Dog | Mouse");
        petInput2 = console.getStringInput("Enter the second type");
        petInput3 = console.getStringInput("Enter the third type");
        petName1 = console.getStringInput("Please tell us the name of your " + petInput1);
        petName2 = console.getStringInput("Please tell us the name of your " + petInput2);
        petName3 = console.getStringInput("Please tell us the name of your " + petInput3);
        countThePets();
    }

    public void countThePets() {
        if (howManyPets.equals("1")) {
            petMap.put("1", petInput1);
        } else if (howManyPets.equals("2")) {
            petMap.put("1", petInput1);
            petMap.put("2", petInput2);
        } else if (howManyPets.equals("3")) {
            petMap.put("1", petInput1);
            petMap.put("2", petInput2);
            petMap.put("3", petInput3);
        }
    }

    public void printScreen() {
        System.out.println("The name of your pets are" + " " + petName1 + " " + petName2 + " " + petName3 +
                "." + " You have a total of 3 " + "pets " + petMap);
    }
}









