import java.util.Scanner;

public class MathClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        double num = sc.nextDouble();

        System.out.println(java.lang.Math.round(num));
        System.out.println(java.lang.Math.floor(num));
        System.out.println(java.lang.Math.ceil(num));

    }
}
