package day50.Bonus.src;

public class AddBinary {
    public static void main(String[] args) {

        String input0 = "10";
        String input1 = "11";

        int number0 = Integer.parseInt(input0, 2);
        int number1 = Integer.parseInt(input1, 2);

        int sum = number0 + number1;
        System.out.println(sum);
    }
}