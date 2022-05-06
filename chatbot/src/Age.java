package day50.chatbot.src;
import java.util.Scanner;

public class Age {
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
}
