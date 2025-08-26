import java.util.Scanner;

public class Floating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        if (num <= 0.00) {
            System.out.println(num + " is Negative");
        } else if (num > 0.00) {
            System.out.println(num + "is positive");
        } else if (num == 0.00) {
            System.out.println(num + " is zero");
        } else {
            System.out.println("invalid input");

        }
         sc.close();
    }
   
}
