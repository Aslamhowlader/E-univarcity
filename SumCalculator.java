// Simple Java Program: Sum of Two Numbers
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        int sub= num1 + num2;
        System.out.println("Sub: " + sub);

       int div = num1 + num2;
        System.out.println("Sum: " + div);
        input.close();
    }
}