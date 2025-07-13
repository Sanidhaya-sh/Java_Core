package conditionalStatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 5");
        int number = sc.nextInt();
        // Switch case statement to handle multiple conditions based on the value of 'number'
        switch (number) {
            case 1:
                System.out.println("You entered One");
                break;
            case 2:
                System.out.println("You entered Two");
                break;
            case 3:
                System.out.println("You entered Three");
                break;
            case 4:
                System.out.println("You entered Four");
                break;
            case 5:
                System.out.println("You entered Five");
                break;
            default:
                System.out.println("Invalid number, please enter a number between 1 and 5");
        }
        sc.close();

    }
}