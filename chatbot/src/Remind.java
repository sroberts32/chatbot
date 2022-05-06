package day50.chatbot.src;
import java.util.Scanner;

public class Remind {
    public static void remindName() {
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("I'm sorry. I had a minor glitch. Can you remind me of your name again please.");
        String nameAgain = scanner2.nextLine();
        System.out
                .println("Greetings, " + nameAgain + ". It is nice to meet you. I will remember your name this time.");
    }
}
