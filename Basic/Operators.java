package Basic;

public class Operators {
    int m = 5 ;
		public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//Relational operators = >,<,==,!=,>=,<=
		//Default value = true & false

		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		
		//Logical operators = AND[&&] , OR[||] and NOT[!!}
		int c=30;
		 boolean d=((a>b)||(b<c));//boolean data type returns T or F as default
		 System.out.println(d);
		 
		 System.out.println(a/b);//"/" shows division
		 System.out.println(a%b);//"%" shows reminder
		 
		 //Increment(a++ or ++a) and Decrement operator(a-- 0r --a)	
		 
		 System.out.println((a++)+" "+(++a)+" "+(a--)+" "+(--a));
		
		 //Assignment operator
		    a+=b;
			System.out.println(a);//30
			a-=b;
			System.out.println(a);//10
			a*=b;
			System.out.println(a);//200
			a/=b;
			 System.out.println(a);//10
			 a%=b;
			 System.out.println(a);//10
			 
			 //New operator = used for object creation of class or memory allocation to new array
			 Operators o = new Operators();//object creation
			 System.out.println(o.m);
			 
			 //Instance of Operator = mainly used in inheritance to find from which class the object is created.It is a binary operator returns true or false
		 
		 
		
		
		
		
		
		
		}

}
