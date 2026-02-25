import java.util.Scanner;

class MainCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SIMPLE CALCULATOR =====");

        
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        // Menu
        System.out.println("\nChoose Operation:");
        System.out.println("1. Sum");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.print("Enter your choice (1-5): ");

        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {

            case 1:
                Sum s = new Sum();
                result = s.calculate(num1, num2);
                break;

            case 2:
                Subtract sub = new Subtract();
                result = sub.calculate(num1, num2);
                break;

            case 3:
                Multiply mul = new Multiply();
                result = mul.calculate(num1, num2);
                break;

            case 4:
                Divide div = new Divide();
                result = div.calculate(num1, num2);
                break;

            case 5:
                Mod mod = new Mod();
                result = mod.calculate(num1, num2);
                break;

            default:
                System.out.println("Invalid Choice!");
                return;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}
