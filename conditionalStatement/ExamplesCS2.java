package conditionalStatement;
import java.util.Scanner;

public class ExamplesCS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 5 number max");

        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        int l = g;

        if (h > l) {
            l = h;
        }
        if (i > l) {
            l = i;
        }

        if (j > l) {
            l = j;
        }

        if (k > l) {
            l = k;
        }

        if (g == h && i == j && j == k && k == g) {
            System.out.println("equal");
        }
        System.out.println(l + " is biggest");

        System.out.println("2. Uppercase or Lowercase");

        System.out.println("Enter a character");

        char r = sc.next().charAt(0);

        if (r >= 'A' && r <= 'Z')
            System.out.println("Uppercase");
        else if (r >= 'a' && r <= 'b')
            System.out.println("Lowercase");
        else
            System.out.println(r + " is not an alphabet");

        System.out.println("3. Divide by 7 or 3's multiple");

        System.out.println("Enter a number");

        int s = sc.nextInt();

        if (s % 7 == 0 || s % 3 == 0)
            System.out.println("yes divided by 7 or 3");
        else
            System.out.println("not divided by 7 or 3");

        System.out.println("4. Number swap");

        System.out.println("Enter two numbers");
        int t = sc.nextInt();
        int u = sc.nextInt();

        System.out.println("Before swapping \n"
                + "1st = " + t + "\n2nd = " + u);

        int temp = t;
        t = u;
        u = temp;

        System.out.println("AFter swapping \n"
                + "1st = " + t + "\n2nd = " + u);

        System.out.println("without temp");

        System.out.println("Before swapping \n"
                + "1st = " + t + "\n2nd = " + u);

        t = t + u;
        u = t - u;
        t = t - u;

        System.out.println("AFter swapping \n"
                + "1st = " + t + "\n2nd = " + u);

        System.out.println("5. Gender");

        System.out.println("Enter your gender (m or f)");
        char gender = sc.next().charAt(0);

        if (gender == 'm')
            System.out.println("Male");
        else if (gender == 'f')
            System.out.println("Female");
        else
            System.out.println("other");

        System.out.println("6. Weekdays");

        System.out.println("Enter a number b/w 1&7 ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 7) {

            switch (num) {

                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
            }
        } else
            System.out.println("invalid");

        System.out.println("7. Match");

        System.out.println("Enter a alphabet(a,b or c)");
        char x = sc.next().charAt(0);

        if (x == 'a' || x == 'b' || x == 'c') {
            switch (x) {
                case 'a':
                    System.out.println("Apple");
                    break;
                case 'b':
                    System.out.println("Ball");
                    break;
                case 'c':
                    System.out.println("Cat");
                    break;
            }
        } else
            System.out.println("Enter valid character");

        System.out.println("8. celsius to fahrenheit and vice versa");

        //f=c*9/5+32
        System.out.println("Enter temperature in fahrenheit or celsius");
        double temperature = sc.nextDouble();
        System.out.println("F=fahrenheit & C=celsius");
        double ans = 0;
        System.out.println("Enter the unit in which u wanna change.");
        char unit = sc.next().charAt(0);

        if (unit == 'F' || unit == 'C') {
            switch (unit) {

                case 'F':
                    ans = (temperature * 9 / 5) + 32;
                    break;
                case 'C':
                    ans = (temperature - 32) * 5 / 9;
                    break;
            }

        } else
            System.out.println("invalid input");

        System.out.println("After converting into " + unit + "= " + ans);

        System.out.println("9. Alphabet or digit");
        System.out.println("Enter a single character : ");
        sc.nextLine();
        String input = sc.nextLine();

        if (input.length() != 1) {
            System.out.println("Please enter exactly one character.");
        } else {
            char ch = input.charAt(0);
            if (Character.isLetter(ch)) {
                System.out.println("Input = " + ch + " = alphabet");
            } else if (Character.isDigit(ch)) {
                System.out.println("Input = " + ch + " = digit");
            } else {
                System.out.println("Input = " + ch + " = neither an alphabet nor a digit");
            }
        }

        System.out.println("10. Height comparison");

        System.out.println("Enter your height in cm");
        float height = sc.nextFloat();

        if (height >= 170)
            System.out.println("high");

        else if (height < 170 && height >= 152)
            System.out.println("Mid");

        else
            System.out.println("Low");
        sc.close();
    }
}