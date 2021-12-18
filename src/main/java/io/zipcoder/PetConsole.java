package io.zipcoder;

import java.util.Arrays;
import java.util.Scanner;

public class PetConsole {
    public static final String ANSI_PURPLE = "\u001B[35m";
    private final IOConsole console = new IOConsole(AnsiColor.PURPLE);
    private static final Pet pet = new Pet();
    Scanner prompt = new Scanner(System.in);

    public PetConsole() {
    }

    public String getPetInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Pet Simulation!")
                .append("\nPlease Enter to Continue")
                .toString());
    }

    public void askForNumberOfPets() {
        System.out.println(ANSI_PURPLE + "Please enter the number of pets you have? ");
        //takes an integer input  // Example 5
        pet.typeOfPetArray = new String[prompt.nextInt()];
        prompt.nextLine();
    }

    public void askForTypesOfPets() {
        System.out.println("What are the type of pets you have? Please select out of Dog | Cat | Mouse");  // The names of the pets equal integer input
        for (int i = 0; i < pet.typeOfPetArray.length; i++) {
            pet.typeOfPetArray[i] = prompt.nextLine();  // Stores the pet type in the original array
        }
        System.out.println("\nYou have entered: ");
        //for-each loop to print the string
        for (String string : pet.typeOfPetArray) {
            System.out.println(string);
        }
    }

        public static void petSortComparableMethod() {
            Arrays.sort(pet.namesOfPets);
            Arrays.sort(pet.typeOfPetArray);
        }


    public void askForNames() {
        System.out.println("\nWhat are the names of your Pets?");  // The names of the pets equal integer input
        pet.namesOfPets = new String[pet.typeOfPetArray.length];
        for (int i = 0; i < pet.namesOfPets.length; i++) {
            pet.namesOfPets[i] = prompt.nextLine();
        }
        System.out.println("\nYou have entered: ");
        //for-each loop to print the string
        for (String string : pet.namesOfPets) {
            System.out.println(string);
        }
    }
}











