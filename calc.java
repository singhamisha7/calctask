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
                if (n1 > n2) {
                    result = n1 - n2;
                } else {
                    result = n2 - n1;
                }
                System.out.println("The difference of " + n1 + " and " + n2 + " is " + result);

                break;
            // multiplication
            case 3:

                break;
            // division
            case 4:

                break;
            // default statement
            default:
                System.out.println("Enter a valid choice");
                break;
        }

    }

}