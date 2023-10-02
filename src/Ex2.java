import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First string:");
        String str1 = input.nextLine();
        System.out.println("Second string:");
        String str2 = input.nextLine();
        System.out.println("Third string:");
        String str3 = input.nextLine();
        input.close();
        System.out.println(str1+str2+str3);
        System.out.println(str3+str2+str1);
    }
}
