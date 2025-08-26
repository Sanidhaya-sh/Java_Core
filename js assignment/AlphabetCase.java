class A {
    String m1(char a){
    if (a >= 'A' && a <= 'Z'){
        return a + " is an Uppercase alphabet.";
    }
    else if (a >= 'a' && a <= 'z'){
        return a + " is a Lowercase alphabet.";
    }
    else{ 
        return a + " is not an alphabet";
    }
}

}
public class AlphabetCase {

    public static void main(String[] args) {
        A obj = new A();
        String result = obj.m1('G');
        System.out.println(result);
    }
}