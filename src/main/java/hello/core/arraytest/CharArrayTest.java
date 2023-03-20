package hello.core.arraytest;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] alpa = new char[26];
        char ch = 'A';
        for (int i =0; i< alpa.length; i++){
            alpa[i]=ch++;
        }
        for(char alpha : alpa){
            System.out.println(alpha+","+(int)alpha);
        }
    }
}
