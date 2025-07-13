package conditionalStatement;
import java.util.Scanner;

public class ExampelsCS{
    public static void main(String[] args) {
        
        System.out.println("1. Max b/w three numbers");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        if(a==b&&b==c) {
			System.out.println("equal");
		}

        System.out.println(largest);

        System.out.println("2. Check if a number is positive or negateive");
	
	System.out.println("Enter a number");

	int d=sc.nextInt();
	
	if(d<0) System.out.println("-ve");
	
	else if(d>0) System.out.println("+ve");
	
    else
        System.out.println("zero");
    
    System.out.println("3. Check if a number is divided by 5&11");
        
    System.out.println("Enter a number");

	int e=sc.nextInt();
	
	if(e%5==0&&e%11==0) System.out.println("yes divided by 5&11");
    else System.out.println("not divided by 5&11");
    
    System.out.println("4. Check if a number is even or odd");

    System.out.println("Enter a number");

	int f=sc.nextInt();
	
	if(f%2==0) System.out.println("even");
    else System.out.println("odd");
    
    System.out.println("5. Check if a year is leap year or not");
        
    System.out.println("Enter a year");

	int g=sc.nextInt();
	
	if((g%4==0&&g%100!=0)||g%400==0) System.out.println(g+" is a leap year");
    else System.out.println("not a leap year");
	
    System.out.println("6. Check if a character is alphabet or not");

    System.out.println("Enter a character");

	char h=sc.next().charAt(0);
	
	if((h>='A'&&h<='Z')||(h>='a'&&h<='b')) System.out.println(h+" is an alphabet");
    else
        System.out.println(h + " is not an alphabet");
    
    System.out.println("7. Check if a character is vowel or not");
        
    System.out.println("Enter an alphabet");

	char i=sc.next().charAt(0);

	if((i=='A'||i=='E'||i=='I'||i=='O'||i=='U')||(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')) {
		System.out.println(i+" is a vowel");
	}
    else System.out.println(i + " is a consonent");
    
    System.out.println("8. A triangle or not");

    System.out.println("Enter three angles");

	int j=sc.nextInt();
	int k=sc.nextInt();
	int l=sc.nextInt();
	
	if(j+k+l==180) System.out.println("is a triangle");
	else System.out.println("not a triangle");
    
    System.out.println("9. Type of triangle");

    System.out.println("Enter three angles");

	float n=sc.nextInt();
	float m=sc.nextFloat();
	float o=sc.nextFloat();
	
	if(m+n+o==180) {
		if(m==n&&n==o) {
			System.out.println("is a equilateral triangle");
		}
		else if((m==n&&m!=o)||(n==o&&n!=m)||(o==m&&o!=n)) {
			System.out.println("isosceles triangle");
			}
		else System.out.println("scalene triangle");
	}
    else System.out.println("not a triangle");
    
        System.out.println("10. Voter id");
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Citizen of");
		String citizen=sc.next();
		
		if(age>=18) {
			if(citizen.equals("India")||citizen.equals("india")) {
				System.out.println("Eligible for voter id");
			}
			else System.out.println("Not a citizen of india");
		}
		else System.out.println("Not eligible for voter id");
		
    sc.close();
    }
}
       

