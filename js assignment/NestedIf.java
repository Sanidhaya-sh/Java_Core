class A {
    String m1(int num) {
        if (num >= 1 && num <= 100) {
            if (num % 7 == 0) {
                return num + "Divisible by 7";
            } else {
                return num + "Not Divisible by 7 but in range(1-100)";
            }
        } else {
            return num + "Not in range(1-100)";
        }
    }
} 
public class NestedIf {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.m1(49));  // Divisible by 7
        System.out.println(obj.m1(50));  // Not Divisible by 7 but in range(1-100)
        System.out.println(obj.m1(150)); // Not in range(1-100)
    }
}