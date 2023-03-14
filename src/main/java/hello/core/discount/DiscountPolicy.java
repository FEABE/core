package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * 
     * @param member member 객체를 받아오는 파라미터
     * @param price 입력받은 가격을 받아오는 파라미터
     * @return 할인 대상 금액
     */
    int discount(Member member,int price);
}
