class A {
    int m1(int hours) {
        if (hours <= 2) {
            return 20;
        } else if (hours > 2 && hours <= 5) {
            return 50;
        } else if (hours > 5 && hours <= 10) {
            return 100;
        } else {
            return 200;
        }
    }
}
    public class ParkingFee {

        public static void main(String[] args) {
            A obj = new A();
            int result = obj.m1(6);
            System.out.println("The parking fee is: " + result + " rupees");
        }
    }
