package main.infrastructure;

import main.domain.Member;
import main.domain.Tradesman;

import java.util.ArrayList;

public final class MembershipApply implements MembershipApplication {
    Member member;
    AgeValidationStrategy ageValidation;
    Boolean isValid;
    Tradesman tradesman ;
    PaymentProcess payment;
    Double amount;
    EmailValidationStrategy email;
    public MembershipApply(Member member, Double amount){
        this.member = member;
        ageValidation = new AgeValidationStrategy(member.getAge());
        this.amount = amount;
        email = new EmailValidationStrategy(this.member.getEmail());
    }


    @Override
    public Boolean verifyApplication() {
        if((ageValidation.verifyApplication() == true) && (email.verifyApplication() == true)){
            isValid = true;
        }else {
            isValid = false;
        }
        return isValid;
    }

    public void applyForMembership(Payment paymentS){
        if(isValid == true){
            System.out.println("Your application is verified with success! Waiting for payment verification...");
            payment = new PaymentProcess(amount,paymentS);
            payment.isAllowed();
            if(payment.PaymentAllowed()==true){
                tradesman = new Tradesman(this.member.getLastname(),this.member.getFirstname(),this.member.getAge(),this.member.getAddress());

            }
        }else{
            System.out.println("Sorry! We have problem with your application! please try again :(");
        }


    }


}
