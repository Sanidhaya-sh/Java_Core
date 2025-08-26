class A {
    String m1(double n) {
        if (n <= 20) {
            return "Cold";
        } else if (n > 20 && n <= 50) {
            return "Warm";
        } else if (n > 50 && n <= 75) {
            return "Hot";
        } else {
            return "Very Hot";
        }
       }

    }

    public class Temperature {
        public static void main(String[] args) {
            A obj = new A();
            String result = obj.m1(55);
            System.out.println("The temperature is: " + result);
        }
    }
