package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderSrvice orderSrvice;

    @BeforeEach
    public  void beforEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderSrvice =appConfig.orderSrvice();
    }
    @Test
    void createOrder(){
        Long memberId=1l;
        Member member= new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order =orderSrvice.createOrder(memberId,"itemA",10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}
