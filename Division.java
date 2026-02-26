package git_project;

public class Division {

    public static int divide(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }

        return num1 / num2;
    }
}
