package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService= appConfig.memberService();
       // MemberService memberService = new MemberServiceimpl();
        Member member= new Member(1l,"meberA", Grade.VIP);
        memberService.join(member);

        Member findMember= memberService.findMember(1l);
        System.out.println("findMember ="+findMember.getName());
        System.out.println("new member = " + member.getName());


    }
}
