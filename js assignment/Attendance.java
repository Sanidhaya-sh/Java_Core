class A {
    String m1(float attendancePercentage){
        if (attendancePercentage >= 75){
            return "Allowed to sit in exam";
        }
        else{
            return "Not allowed to sit in exam";
        }
    }
}
public class Attendance {

    public static void main(String[] args) {
        A obj = new A();
        String result = obj.m1(80);
        System.out.println(result);
    }
}