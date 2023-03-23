package hello.core.inheritancetest;

public class VIPCustomer {
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;
    double salesRatio;
    String agentID;

    public VIPCustomer(){
        customerGrade="VIP";
        bonusRatio=0.05;
        salesRatio= 0.1;
    }

}
