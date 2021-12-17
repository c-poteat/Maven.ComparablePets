package io.zipcoder;

import java.util.HashMap;

public class PetConsole {
    private final IOConsole console = new IOConsole(AnsiColor.PURPLE);
    private String howManyPets;
    private String whatKindOfPet;
    private HashMap<String, String> petMap = new HashMap<String, String>();

    public PetConsole() {

    }

    // Ask how many users Create a program that asks the user how many pets they have. Once you know how many pets they have,
    // ask them what kind of pet each one is, along with each pet's name.
    // For now your program should just hold onto the user input and print out the list at the end; we'll modify this in part 3.
    public String getPetInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Pet Simulation!")
                .append("\nPlease Enter to Continue")
                .toString());
    }

    public void askForNumberOfPets() {
        while (true) {
            howManyPets = console.getStringInput("How many pets do you have?");
            if (howManyPets.equals(1)) {
                break;
            }
            whatKindOfPet = console.getStringInput("Please tell us what kind of pet you have?");
            if (whatKindOfPet.equals("Cat")) {
                petMap.put(howManyPets, whatKindOfPet);
            }
            System.out.println("The type of pet you have is a " + whatKindOfPet);
            break;

        }

    }
}






