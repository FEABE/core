package hello.core.singleton;

public class CompanyTest {
    public static void main(String[] args) {
        //static method
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
    }
}
