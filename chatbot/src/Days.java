package day50.chatbot.src;
import java.util.Scanner;

public class Days {
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
