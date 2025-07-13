package Basic;
import java.util.Scanner;//importing Scanner class from java.util package

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//create its object for frequent use
		System.out.println("Enter a number");
		int a = sc.nextInt();//it will create a memory for the variable and ask the user for an input 
		
		sc.nextLine();//consume the newline character left by nextInt()
		
		System.out.println("Enter a string");
		String text = sc.nextLine();
		//it will read a whole line
		System.out.println("Enter a word");
		String word = sc.next();
		//it will read a single word
		
		System.out.println("Enter a float");
		float f =sc.nextFloat();
		//Reads float
		System.out.println("Enter a Double");
		double d = sc.nextDouble();
        //Reads double
		
		//Same for boolean , byte, short , long 
		
		System.out.println("Enter a Character");
		//""IMP"" there's no direct method read character 
		char c = sc.next().charAt(0);
        //It will read the string and give the first character
        
        System.out.println("You entered: " + a);
        System.out.println("You entered: " + text);
        System.out.println("You entered: " + word);
        System.out.println("You entered: " + f);
        System.out.println("You entered: " + d);
        System.out.println("You entered: " + c);
        //Prints the values entered by the user
		sc.close();//it will close scanner class
	}

}

