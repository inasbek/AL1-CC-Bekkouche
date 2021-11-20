package test;

import main.domain.Address;
import main.domain.Member;
import main.infrastructure.CreditCardPaymentStrategy;
import main.infrastructure.MembershipApply;
import main.infrastructure.PaypalPaymentStrategy;

public class MembershipApplicationTest {

    public static void main(String[] args) {
        System.out.println("--------Test 1 (Payment By Card)--------------");
        Address address = Address.of(1, "ALFORTVILLE","Paris");

        Member member = Member.of("BEKKOUCHE", "Inas", 21,"b_ines@live.com",address);

        CreditCardPaymentStrategy card = new CreditCardPaymentStrategy("BEKKOUCHE","20/01/2022","1234567890987" ,"123");
        MembershipApply membership = new MembershipApply(member,350.0);
        membership.verifyApplication();
        member.setCard(card);
        membership.applyForMembership(card);
        System.out.println("      ");
        System.out.println("----------Test 2 (CardNumber problem)--------");
        Address address2 = Address.of(1, "sainte-eugenie","Paris");

        Member member2 = Member.of("KECHIOUCH", "Ines", 21,"k_iness@live.com", address2);
        //PaypalPaymentStrategy paypal = new PaypalPaymentStrategy("b_imad@live.com", "jesuisfolle");
        CreditCardPaymentStrategy card2 = new CreditCardPaymentStrategy("KECHIOUCH","20/01/2025","1256789871","123" );
        MembershipApply membership2 = new MembershipApply(member2,300.0);
        membership2.verifyApplication();
        member2.setCard(card2);
        membership2.applyForMembership(card2);
        System.out.println("      ");
    System.out.println("----------Test 3 (CVV Problem)--------------------");
    Address address5 = Address.of(1, "pablo picasso","Paris");

    Member member5 = Member.of("ALZOSKY", "Inas", 35,"b_ines@live.com", address5);

    CreditCardPaymentStrategy card5 = new CreditCardPaymentStrategy("ALZOKSY","20/01/2022","1112567890987","13" );
    MembershipApply membership5 = new MembershipApply(member5,300.0);
        membership5.verifyApplication();
        //member5.setCard(card5);
        membership5.applyForMembership(card5);
        System.out.println("      ");
        System.out.println("----------Test 4 (Age Problem)--------");
        Address address3 = Address.of(1, "pablo picasso","Paris");

        Member member3 = Member.of("ALZOSKY", "Inas", 17,"a_ines@live.com", address3);

        CreditCardPaymentStrategy card3 = new CreditCardPaymentStrategy("ALZOKSY","20/01/2022","1112567890987","123" );
        MembershipApply membership3 = new MembershipApply(member3,300.0);
        membership3.verifyApplication();
        member3.setCard(card3);
        membership3.applyForMembership(card3);
        System.out.println("      ");
        System.out.println("----------Test 5 (Paypal Payment)--------------");
         Address address4 = Address.of(1, "pablo picasso","Paris");

         Member member4 = Member.of("ALZOSKY", "Imad", 22,"b_imad@live.com",address4);

         PaypalPaymentStrategy paypal2 = new PaypalPaymentStrategy("b_imad@live.com", "jesuisfolle");
         MembershipApply membership4 = new MembershipApply(member4, 150.0);
         membership4.verifyApplication();
         member4.setPaypalAccount(paypal2);
         membership4.applyForMembership(paypal2);
    }}