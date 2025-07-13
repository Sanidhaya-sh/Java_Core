package conditionalStatement;

import java.util.Scanner;

public class ExampleCS3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. College marksheet");
	        
	        System.out.print("Enter your marks ");
	        int marks=sc.nextInt();
	         if(marks<=25) System.out.println("Grade = F");

	         else if(marks>25&&marks<=45) System.out.println("Grade = E");
	         
	         else if(marks>45&&marks<=50) System.out.println("Grade = D");
	         
	         else if(marks>50&&marks<=60) System.out.println("Grade= C");
	         
	         else if(marks>60&&marks<=80) System.out.println("Grade = B");
	         
	         else if(marks>80) System.out.println("Grade = A");
	         
	         else System.out.println("invalid input");
	         
             System.out.println("Percentage = " + marks + "%");
             
        System.out.println("2. Test Data");
			
			System.out.print("Input the Roll Number of the student: ");
			        int roll = sc.nextInt();
			        sc.nextLine(); // consume newline

			        System.out.print("Student name: ");
			        String name = sc.nextLine();

			        System.out.print("Father's name: ");
			        String fname = sc.nextLine();

			        System.out.print("Mother's name: ");
			        String mname = sc.nextLine();

			        System.out.print("Address: ");
			        String address = sc.nextLine();

			        System.out.print("Contact number: ");
			        String contact = sc.nextLine();

			        // Input marks
			        System.out.print("Input the marks of Physics, Chemistry and Computer Application: ");
			        int physics = sc.nextInt();
			        int chemistry = sc.nextInt();
			        int compApp = sc.nextInt();

			        // Compute results
			        int total = physics + chemistry + compApp;
			        double percentage = (total / 3.0);
			        String division;

			        if (percentage >= 60) {
			            division = "First";
			        } else if (percentage >= 50) {
			            division = "Second";
			        } else if (percentage >= 40) {
			            division = "Third";
			        } else {
			            division = "Fail";
			        }

			        // Output
			        System.out.println("\n——— Student Report ———");
			        System.out.println("Roll Number : " + roll);
			        System.out.println("Name        : " + name);
			        System.out.println("Father's Name: " + fname);
			        System.out.println("Mother's Name: " + mname);
			        System.out.println("Address     : " + address);
			        System.out.println("Contact     : " + contact);

			        System.out.println("\nMarks:");
			        System.out.println("Physics     : " + physics);
			        System.out.println("Chemistry   : " + chemistry);
			        System.out.println("Comp. App.  : " + compApp);

			        System.out.println("\nTotal       : " + total);
			        System.out.printf("Percentage  : "+ percentage);
			        System.out.println("\nDivision    : " + division);
			        
		System.out.println("3.  Avg");
			        
		    System.out.println("Enter 5 numbers ");
			        int a=sc.nextInt();
			        int b=sc.nextInt();
			        int c=sc.nextInt();
			        int d=sc.nextInt();
			        int e=sc.nextInt();
			        
			        int sum=a+b+c+d+e;
			        int avg=sum/5;
			         if(avg>40) { 

			         if(avg>40&&avg<=50) System.out.println("Grade = D");
			         
			         else if(avg>50&&avg<=60) System.out.println("Grade= C");
			         
			         else if(avg>60&&avg<=80) System.out.println("Grade = B");
			         
			         else if(avg>80) System.out.println("Grade = A");
			         }
			         
			         else System.out.println("Fail");
			            
	     System.out.println("4. Salary");
			     	
			System.out.print("Enter Name: ");
		        String n = sc.nextLine();

	     	System.out.print("Enter Address: ");
		     	String add = sc.nextLine();

	     	System.out.print("Enter Bank Details: ");
		     	String bankDetails = sc.nextLine();

	     	System.out.print("Enter Monthly Salary: ");
		     	double salary = sc.nextDouble();

	        System.out.print("Enter Number of Holidays Taken: ");
		        int holidays = sc.nextInt();
			     	  
		        double fs=0;

			     	 if (holidays == 1) {
		     	            fs= salary; // full salary
		     	        } else if (holidays >= 2 && holidays <= 5) {
		     	        	 fs= salary * 0.95; // 5% deduction
		     	        } else if (holidays >= 6 && holidays <= 14) {
		     	        	 fs= salary* 0.90; // 10% deduction
		     	        } else if (holidays >= 15 && holidays <= 30) {
		     	        	 fs= salary* 0.50; // 50% deduction
		     	        } else System.out.println("final salary: "+fs);
			     	  System.out.println("\n--- Salary Slip ---");
			     	  System.out.println("Name: " + n);
			          System.out.println("Address: " + add);
		    	      System.out.println("Bank Details: " + bankDetails);
			     	  System.out.println("Base Salary: $" + salary);
			          System.out.println("Holidays Taken: " + holidays);
		   	          System.out.println("Final Salary Allotted: " +fs+"$" );
		   	          
		System.out.println("5. Electricity bill");
		   	          
		   	System.out.print("Enter Name: ");
			    String na = sc.nextLine();
	        System.out.print("Enter unit: ");
		        int u = sc.nextInt();
			        
			        int amount=u*10;
			        double discount=0;
			        if(u!=0) {
			        if(u>=1&&u<=10)discount=10.0/100;
			        else if(u>10&&u<=20)discount=15.0/100;
			        else if(u>20&&u<=40)discount=30.0/100;
			        else discount=50.0/100;
			        }
			        
			      System.out.println("\nName: "+na);
			     	  System.out.println("Unit: "+u);
			          System.out.println("Amount: "+amount);
		 	      System.out.println("Discount: "+discount*100+"%");
			     	  System.out.println("Pay amount: "+(amount-amount*discount));

		System.out.println("6. Retailer customer");
			           
			System.out.print("Enter retailer's name: ");
		        String rn = sc.nextLine();
	        System.out.print("Enter pieces: ");
		        int p = sc.nextInt();
				        
				        double disc=0;
				        
				        if(p!=0) {
				        if(p>=1&&p<=15)disc=0.15;
				        else if(p>15&&p<=30)disc=0.30;
				        else disc=0.50;
				        }
				        
			            sc.nextLine();
				        System.out.println("Customer's name: ");
				        String cn = sc.nextLine();
				        
				        System.out.println("Contact number: ");
				        long cc = sc.nextLong();
				        
			           System.out.print("Payment: ");
				        int pay = sc.nextInt();
				        
				        double di=0;
				        
				        if(pay>99) {
				        if(pay>=100&&pay<=1000)di=0.5;
				        else if(pay>1000&&pay<=2000)di=0.10;
				        else if(pay>2000&&pay<=3000)di=0.15;
				        else di=0.30;
				        }
				        
				        System.out.println("\nRetailer's Name: "+rn);
				        System.out.println("Pieces: "+p);
				        System.out.println("Discount: "+disc*100+"%");
				        
				        System.out.println("\rCustomer's Name: "+cn);
				        System.out.println("Contact number: "+cc);
			            System.out.println("Payment: "+pay);
				        System.out.println("Discount: "+di*100+"%");
                        System.out.println("Pay amount: " + (pay - pay * di));
                          
        System.out.println("7. Income Tax Calculator");
		    
		    System.out.println("Enter your Income");
		    double income = sc.nextDouble();
		    double tax = 0.0;
		    if(income<=10000) {
		    	tax=0.0;
		    }
		    else if(income>10000&&income<=30000) {
		    	tax=(income-10000)*0.10;
		    }
		    else if(income>30000&&income<=50000) {
		    	tax=(income-30000)*0.20+30000*0.10;
		    }
		    else if(income>50000) {
		    	tax=(income-50000)*0.30+500000*0.20+30000*0.10;
		    }
		    else System.out.println("invalid");
		    
		    System.out.println("tax = "+tax);
		    
		System.out.println("8. BMI Calculator");//bmi = weight/height*height
		    
		    System.out.print("Enter your height in m: ");
		    float height = sc.nextFloat();
		    System.out.print("Enter your weight in kg: ");
		    float weight = sc.nextFloat();
		    
		    float bmi=weight/(height*height);
		    
		    if(bmi<18.5)System.out.println(bmi+" Underweight");
		    else if(bmi>=18.5&&bmi<=24.9)System.out.println(bmi+"  Normal weight");
		    else if(bmi>24.9&&bmi<=29.9)System.out.println(bmi+" Overweight");
		    else System.out.println(bmi+" Obesity");
            
		System.out.println("9. Menu Selection");
		
		    System.out.println("1: Appetizers\n2: Main Course\n3: Desserts");
		    
		    System.out.println("Enter 1 , 2 or 3 as per your choice");
		    int menu=sc.nextInt();
		    
		    if(menu==1) {
		    	System.out.println("Appetizers:\n"
		    			+ "Garlic Bread: $4.99\n"
		    			+ "Mozzarella Sticks: $7.99\n"
		    			+ "Chicken Wings (6): $9.99\n"
		    			+ "Soup of the Day: $5.99");
		    }
		    else if (menu==2) {
		    	System.out.println("Main Courses:\n"
		    			+ "Spaghetti Carbonara: $12.99\n"
		    			+ "Grilled Salmon with Roasted Vegetables: $16.99\n"
		    			+ "Chicken Caesar Salad: $11.99\n"
		    			+ "Steak Frites: $18.99");
		    }
		    else if(menu==3) {
		    	System.out.println("Desserts:\n"
		    			+ "Chocolate Lava Cake: $7.99\n"
		    			+ "Cheesecake: $6.99\n"
		    			+ "Fruit Tart: $8.99\n"
		    			+ "Ice Cream Sundae: $5.99");
		    }
		    else System.out.println("invalid input");
            
		System.out.println("10. Ticket Booking System");
		
		 System.out.print("Enter Name: ");
	        String nam = sc.nextLine();
	        System.out.print("Enter age: ");
	        int age = sc.nextInt();
	        
	        int price=2000;
	        double disco=0;
	        if(age!=0) {
	        if(age<=12)disco=50.0/100;
	        else if(age>=65)disco=30.0/100;
	        else disco=0.0;
	        }
	        else disco=0.0;
	        
	        System.out.println("\nName: "+nam);
	     	  System.out.println("Age: "+age);
	          System.out.println("Amount: "+(price-(price*disco)));
	      System.out.println("Discount: "+disco*100+"%");
                      
				     	  
	 sc.close();
    

    }
}
