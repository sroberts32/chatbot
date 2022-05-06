package day50.chatbot.src;
import java.util.Scanner;

public class Count {
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
}
