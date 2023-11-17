import java.util.*;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Enter two numbers:");

        System.out.print("First number: ");
        double num1 = sc.nextDouble();

        System.out.print("Second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.println("Result: " + result);

    }
}