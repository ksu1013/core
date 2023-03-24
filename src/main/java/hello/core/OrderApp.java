package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import hello.core.order.Order;
import hello.core.order.OrderServiceimpl;
import hello.core.order.OrderSrvice;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig= new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderSrvice orderSrvice =appConfig.orderSrvice();

       // MemberService memberService = new MemberServiceimpl(null);
       // OrderSrvice orderSrvice =new OrderServiceimpl(null,null);

        Long memberId= 1l;
        Member member=new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);
        Order order =orderSrvice.createOrder(memberId,"itemA",10000);
        System.out.println("order = "+order);



    }

}
