package day50.chatbot.src;

import java.util.Scanner;

public class Quiz {
    public static void programmingKnowledge() {
        Scanner scanner5 = new Scanner(System.in);

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Please respond with 1, 2, 3 or 4 depending on which answer is correct.");
        System.out.println("Which data type is used to create a variable that should store text sentences?");
        System.out.println("1: txt");
        System.out.println("2: string");
        System.out.println("3. String");
        System.err.println("4. new String");

        while (true) {
            int answer = Integer.valueOf(scanner5.nextLine());
            if (answer == 3) {
                System.out.println("Correct!");
                break;
            } else if (answer == 1 || answer == 2 || answer == 4) {
                System.out.println("Incorrect. Please try again.");
            } else {
                System.out.println("That is not a valid response. Please respond with 1, 2, 3 or 4.");
            }
        }

    }
}
