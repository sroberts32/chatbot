package day50.Bonus.src;
import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.valueOf(scanner.nextLine());

        System.out.println(Integer.toHexString(decimal));

        scanner.close();
    }
}

