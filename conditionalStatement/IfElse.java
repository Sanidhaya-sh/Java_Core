package conditionalStatement;
import java.util.Scanner;
// This code demonstrates the use of if-else statements in Java to compare two numbers
public class IfElse {
    public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);//create its object for frequent use
			System.out.println("Enter two numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
            if (a > b) {
            //if statement basic,if true returns statement if not returns else
			 System.out.println(a);
			 }
		 else System.out.println(b);
		 
		 if(a>b) {
				 System.out.println(a);
				 }
			 else if(a<b) {
				 System.out.println(b);
			 }
			 else System.out.println("equal");
			 
			 if(a>b) {//nested if
				 System.out.println(a);
				 if(a<b) {
				 System.out.println(b);
			 }
		 }
			 if(a>b) {//if ladder
				 System.out.println(a);
			 }
				 if(a<b) {
				 System.out.println(b);
			 }
			 
			 
		 
		 sc.close();
    }
}