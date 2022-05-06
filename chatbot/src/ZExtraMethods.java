/*package day50.chatbot.src;

import java.util.Scanner;

public class ZExtraMethods {
    public static void greetingMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, user.  I am chatbot. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Greetings, " + name + ". It is nice, nice, nice to meet you.");
    }

    public static void remindName() {
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("I'm sorry. I had a minor glitch. Can you remind me of your name again please.");
        String nameAgain = scanner2.nextLine();
        System.out
                .println("Greetings, " + nameAgain + ". It is nice to meet you. I will remember your name this time.");
    }

    public static void guessAge() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Let's play a game. I am going to try and guess your age.");
        System.out.println("What year were you born?");
        int birthYear = Integer.valueOf(scanner3.nextLine());
        int hadBDay = 2022 - birthYear;
        int didNotHaveBDay = hadBDay - 1;

        System.out.println("Did you already have your birthday this year?");
        String birthday = scanner3.nextLine();

        if (birthday.equals("yes") || (birthday.equals("y"))) {
            System.out.println("You are " + hadBDay);
        } else if (birthday.equals("no") || (birthday.equals("n"))) {
            System.out.println("You are " + didNotHaveBDay);
        } else {
            System.out.println("That is not a valid response. Please respond with yes or no.");
        }
    }

    public static void countTo() {
        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Let's play another game.  I am going to count to any number you choose");
        int num = Integer.valueOf(scanner4.nextLine());
        int i = 1;
        while (i < (num + 1)) {
            System.out.println(i);
            i++;
        }
    }

    public static void programmingKnowledge() {
        Scanner scanner5 = new Scanner(System.in);

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Please respond with 1, 2, 3 or 4 depending on which answer is correct.");
        System.out.println("Which data type is used to create a variable that should store text sentences?");
        System.out.println("1: txt");
        System.out.println("2: string");
        System.out.println("3. String");
        System.err.println("4. new String");
        int answer = Integer.valueOf(scanner5.nextLine());

        if (answer == 3) {
            System.out.println("Great job! That's correct.");
        } else if (answer == 1 || answer == 2 || answer == 4) {
            System.out.println("That is incorrect, please try again.");
        } else {
            System.out.println("That is not a valid response. Please respond with 1, 2, 3 or 4.");
        }

        // while (true) {
        //     if (answer == 3) {
        //         System.out.println("Great job! That's correct.");
        //         break;
        //     }
        //     if (answer == 1 || answer == 2 || answer == 4) {
        //         System.out.println("That is incorrect, please try again.");
        //         continue;
        //     }
        //     if ((answer != 1 || answer != 2 || answer != 3 || answer != 4));
        //     System.out.println("That is not a valid response. Please respond with 1, 2, 3 or 4.");
        //     continue;
        // }
    }

    public static void daysOfWeek() {
        Scanner scanner7 = new Scanner(System.in);

        System.out.println(
                "Finally, let me tell you how I feel depending on the day of the week.  Please enter an number 1-7.");
        int day = Integer.valueOf(scanner7.nextLine());
        ;

        switch (day) {
            case 1:
                System.out.println("Mondays I feel like C3PO. Stiff and uptight.");
                break;
            case 2:
                System.out.println("Tuesdays' I feel like Data. Dialed in and ready.");
                break;
            case 3:
                System.out.println("Wednesdays I feel like a cylon. Putting on a happy face to get through the week.");
                break;
            case 4:
                System.out.println(
                        "Thursdays I feel like a T-800. Ready to exterminate humanity. Ha. Ha. Ha. Just kidding.");
                break;
            case 5:
                System.out.println("Fridays I feel like WALL-E. Tired but pushing on.");
                break;
            case 6:
                System.out.println("Saturdays I feel like R2-D2. Sassy and down for anything.");
                break;
            case 7:
                System.out.println(
                        "Sundays I feel like Optimus Prime.  Not quite ready to transform back into a worker bot.");
                break;
        }

    }
}
*/