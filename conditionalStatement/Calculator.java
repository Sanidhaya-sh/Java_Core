package conditionalStatement;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");

        char choice;
        double num1, num2, result;

        do {
            System.out.println("+ for Add");
            System.out.println("- for Sub");
            System.out.println("x for Multiply");
            System.out.println("/ for divide");
            System.out.println("! for Exit");

             System.out.println("Enter first number");
                num1 = sc.nextDouble();
             System.out.println("Enter second number");
                num2 = sc.nextDouble();
             System.out.println("What you wanna do");
            choice = sc.next().charAt(0);

            if (choice == '+' || choice == '-' || choice == 'x' || choice == '/') {
               
                switch (choice) {
                    case '+':
                        result = num1 + num2;
                        System.out.println(result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println(result);
                        break;
                    case 'x':
                        result = num1 * num2;
                        System.out.println(result);
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println(result);
                        } else
                            System.out.println("number 2 is zero");
                        break;
                }
            } else if (choice == '!')
                System.out.println("Exit");

            else
                System.out.println("Invalid input");

        } while (choice != '!');
        sc.close();
    }
}