import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle side 1:");
        double s1 = Double.parseDouble(input.nextLine());
        System.out.println("Rectangle side 2:");
        double s2 = Double.parseDouble(input.nextLine());
        System.out.println(rectanglePerimeter(s1, s2));
        System.out.println("Insert a number:");
        System.out.println(evenOdd(Integer.parseInt(input.nextLine())));
        System.out.println("Triangle side 1:");
        s1 = Double.parseDouble(input.nextLine());
        System.out.println("Triangle side 2:");
        s2 = Double.parseDouble(input.nextLine());
        System.out.println("Triangle side 3:");
        double s3 = Double.parseDouble(input.nextLine());
        System.out.println(trianglePerimeter(s1, s2, s3));
        input.close();
    }
    public static double rectanglePerimeter(double side1, double side2) {
        return side1*2 + side2*2;
    }
    public static int evenOdd(int n) {
        return n % 2;
    }
    public static double trianglePerimeter(double side1, double side2, double side3) {
        double semiPerimeter = (side1+side2+side3)/2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
}
