package main.infrastructure;

import main.domain.Member;
import main.domain.Tradesman;

import java.util.ArrayList;

public final class MembershipApply implements MembershipApplication {
    Member member;
    AgeValidation ageValidation;
    Boolean isValid;
    Tradesman tradesman ;
    public MembershipApply(Member member){
        this.member = member;
        ageValidation = new AgeValidation(member.getAge());
    }


    @Override
    public Boolean verifyApplication() {
        if(ageValidation.verifyApplication() == true){
            isValid = true;
        }else {
            isValid = false;
        }
        return isValid;
    }

    public void applyForMembership(){
        if(isValid == true){
            System.out.println("Your application is verified with success!");
            PaymentProcess payment = new PaymentProcess(100.0,this.member.getCard());
            payment.isAllowed();
            if(payment.PaymentAllowed()==true){
                tradesman = new Tradesman(this.member.getLastname(),this.member.getFirstname(),this.member.getAge(),this.member.getAddress());

            }
        }else{
            System.out.println("Sorry! We have problem with your application! please try again :)");
        }
    }
}
