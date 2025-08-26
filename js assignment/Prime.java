class A {
    int m1(int n) {
        int factors = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                factors++ ;
            }
        }
        if (factors == 2)
            return n;
        else
            return 0;
      }
}
public class Prime {

    public static void main(String[] args) {
        A obj = new A();
        int result = obj.m1(7);
        if (result != 0)
            System.out.println(result+" is a prime number: ");
        else
            System.out.println(result+" is not a prime number: ");

    }
}