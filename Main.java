package git_project;

import java.util.Scanner;

public class MainCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SIMPLE CALCULATOR =====");

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Modulus");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        int result;

        switch (choice) {

            case 1:
                // Non-static method → object required
                Addition addObj = new Addition();
                result = addObj.add(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 2:
                // Static method → call with class name
                result = Subtraction.subtract(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 3:
                // Assuming Division class is static method
                result = Division.divide(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 4:
                // Static method
                result = Modulus.Mod(num1, num2);
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
