class A {
    float m1(int serviceYears) {
        if (serviceYears >= 5) {
            return 10f;
        } else {
            return 2.5f;
        }
    }
}
public class Bonus {

    public static void main(String[] args) {
        A obj = new A();
        float result = obj.m1(6);
        System.out.println("The bonus percentage is: " + result + "%");
    }
}