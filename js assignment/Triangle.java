class A {
    String m1(int a, int b, int c) {
        if (a==b && b==c){
            return "Equilateral Triangle";
        }
        else if (a==b || b==c || c==a){
            return "Isosceles Triangle";
        }
        else {
            return "Scalene Triangle";
        }
}
}
public class Triangle {

    public static void main(String[] args) {
        A obj = new A();
        String result = obj.m1(5,5,5);
        System.out.println("The triangle is: " + result);
    }
}