package day50.Bonus.src;

public class Rectangle {
    public static void main(String[] args) throws Exception {
        double width = 5.5;
        double height = 8.5;
        double perimeter = 2 * (width + height);
        double area = height * width;
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
        System.out.println("Area is " + width + " * " + height + " = " + area); 
    }
}

