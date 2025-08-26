class A {
    String m1(int a,int b)
    {
        if (a > b) {
            return a + " is greater than " + b;
        } else if (a < b) {
            return a + " is less than " + b;
        } else if (a == b) {
            return a + " is equal to " + b;
        } else {
            return "invalid input";
        }
    }
}
public class TwoNumbers {

    public static void main(String[] args) {
        A obj = new A();
        String result = obj.m1(10, 20);
        System.out.println(result);
    }
}