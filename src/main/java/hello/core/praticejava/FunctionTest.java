package hello.core.praticejava;

public class FunctionTest {
    public static int addNum(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting){
        System.out.println(greeting);
    }

    public void sayHi(String greeting){
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int total=addNum(n1,n2);
    }

}
