package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderServiceimpl;
import hello.core.order.OrderSrvice;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceimpl(new MemoryMemberRepository());
    }

    public OrderSrvice orderSrvice(){
        return new OrderServiceimpl(new MemoryMemberRepository(),new FixDiscountPolicy());
    }

}


