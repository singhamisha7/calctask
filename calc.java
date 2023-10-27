import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int n1, n2;
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.out.println("Enter the first number");
        n1 = sc.nextInt();
        System.out.println("Enter second number");
        n2 = sc.nextInt();
        int key;
        System.out.println("Enter your choice key");
        System.out.println("Enter one for Addition");
        System.out.println("Enter two for Subtraction");
        System.out.println("Enter three for Multiplication");
        System.out.println("Enter four for Division");
        key = sc.nextInt();
        switch (key) {
            // addition
            case 1:

                break;
            // substraction
            case 2:

                break;
            // multiplication
            case 3:
                result = n1 * n2;
                System.out.println("The product of " + n1 + " and " + n2 + " is " + result);

                break;
            // division
            case 4:
                result = n1 / n2;
                System.out.println("The quotient of " + n1 + " / " + n2 + " is " + result);
                break;
            // default statement
            default:
                System.out.println("Enter a valid choice");
                break;
        }

    }

}