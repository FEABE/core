package hello.core.oopmethod;

import java.util.Date;

public class Order {
    int receiveOrderNumber;
    String phoneNumber;
    String address;
    String orderDate;
    int price;
    String Time;
    int orderNumber;

    public Order(int receiveOrderNumber,String phoneNumber,String address,String orderDate,String Time,int price,int orderNumber){
        this.orderDate =orderDate;
        this.receiveOrderNumber=receiveOrderNumber;
        this.orderNumber=orderNumber;
        this.address=address;
        this.Time=Time;
        this.price=price;
    }

    public String showOrderInfo (){

        return "주문접수번호는:"+receiveOrderNumber+"주문 핸드폰 번호:"+phoneNumber+"주문 집 주소:"+address+"주문 날짜:"+orderDate+"주문시간:"+Time+"주문가격:"+price+"메뉴번호:"+orderNumber;
    }

}
