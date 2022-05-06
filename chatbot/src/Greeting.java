package day50.chatbot.src;
import java.util.Scanner;

public class Greeting {
    public static void greetingMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, user.  I am chatbot. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Greetings, " + name + ". It is nice, nice, nice to meet you.");
    }
}

