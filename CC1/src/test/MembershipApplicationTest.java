package test;

import main.domain.Address;
import main.domain.Member;
import main.infrastructure.CreditCardPaymentStrategy;
import main.infrastructure.MembershipApply;

public class MembershipApplicationTest {

    public static void main(String[] args) {
        System.out.println("--------Test 1-------");
        Address address = Address.of(1, "ALFORTVILLE","Paris");

        Member member = Member.of("BEKKOUCHE", "Inas", 21, address);

        CreditCardPaymentStrategy card = new CreditCardPaymentStrategy("BEKKOUCHE","20/01/2022","1234567890987" );
        MembershipApply membership = new MembershipApply(member);
        membership.verifyApplication();
        member.setCard(card);
        membership.applyForMembership();

        System.out.println("----------Test 2--------");
        Address address2 = Address.of(1, "sainte-eugenie","Paris");

        Member member2 = Member.of("KECHIOUCH", "Inas", 21, address2);

        CreditCardPaymentStrategy card2 = new CreditCardPaymentStrategy("KECHIOUCH","20/01/2025","12567890987" );
        MembershipApply membership2 = new MembershipApply(member2);
        membership2.verifyApplication();
        member2.setCard(card2);
        membership2.applyForMembership();

    System.out.println("----------Test 3--------");
    Address address3 = Address.of(1, "pablo picasso","Paris");

    Member member3 = Member.of("ALZOSKY", "Inas", 17, address3);

    CreditCardPaymentStrategy card3 = new CreditCardPaymentStrategy("ALZOKSY","20/01/2022","12567890987" );
    MembershipApply membership3 = new MembershipApply(member3);
        membership3.verifyApplication();
        member3.setCard(card3);
        membership3.applyForMembership();}
}
