package day50.Bonus.src;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int arg1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int arg2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the third number: ");
        int arg3 = Integer.valueOf(scanner.nextLine());

        double answer = (arg1 + arg2 + arg3) / 3;

        System.out.println("The average is: " + answer);

        scanner.close();
}
}