package Basic;

public class Base {
    int a = 1;//intance variable-directly inside the class
    static int a1 = 3;//static variable-directly inside the class with static keyword

    public static void main(String[] args) { 
        boolean isStudent = true;//it is predefined but we can use it without providing value 
        //it returns boolean type vale

        int b = 2;//local variable

        Base c = new Base();//object creation of a class to access instance type members
        //object-blueperint of a class

        System.out.println(c.a);
        //to print something
        //c reference variable of an object is used to call the instance variable  
        System.out.println(b);
        //or
        System.out.println("b = " + b);
        System.out.println(isStudent);
        System.out.println(Base.a1);
        System.out.println(a1);
    }
}
