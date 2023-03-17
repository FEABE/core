package hello.core.oopchamjo;

public class Subway {
    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }
    public void take(int money){
        this.money += money;
        passengerCount++;
    }
    public void ShowSubwayInfo(){
        System.out.println(subwayNumber+"번의 승객수는"+passengerCount+"명이고 수입은"+money+"원 입니다");
    }

    int subwayNumber;
    int passengerCount;
    int money;



}
