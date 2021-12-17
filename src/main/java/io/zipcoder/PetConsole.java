package io.zipcoder;

import java.util.Scanner;

public class PetConsole {
    public static final String ANSI_PURPLE = "\u001B[35m";
    private final IOConsole console = new IOConsole(AnsiColor.PURPLE);
    private static final Pet pet = new Pet();
    private static final Cat cat = new Cat();
    private static final Dog dog = new Dog();
    private static final Mouse mouse = new Mouse();
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
        pet.petPromptString = new String[prompt.nextInt()];
        //consuming the <enter> from input above
        prompt.nextLine();
        askForTypesOfPets();
    }
        public void askForTypesOfPets() {
        System.out.println("What are the type of pets you have? Please select out of Dog | Cat | Mouse");  // The names of the pets equal integer input
        for (int i = 0; i < pet.petPromptString.length; i++) {
            pet.petPromptString[i] = prompt.nextLine();  // Stores the pet type in the original array
        }
        System.out.println("\nYou have entered: ");
        //for-each loop to print the string
        for (String string : pet.petPromptString) {
            System.out.println(string);
            }
        }

        public void namesAndTypes() {
            System.out.println("Tell us the names of your pets?");
            prompt.nextLine();
            System.out.println(pet.petPromptString);
            }

        }











