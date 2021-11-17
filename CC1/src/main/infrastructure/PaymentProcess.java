package main.infrastructure;

public class PaymentProcess implements Payment{
    CreditCardPaymentStrategy paymentByCard;
    Double amount;

    public PaymentProcess(Double Amount,CreditCardPaymentStrategy card){
        this.paymentByCard = card;
        this.amount = Amount;
    }
    @Override
    public Boolean PaymentAllowed() {
        if(paymentByCard.PaymentAllowed() == true){
            return true;
        }else{
            return false;
    }
    }

    public void isAllowed(){
        if(this.PaymentAllowed() == true){
        System.out.println("The payment of "+this.amount+"$ is Allowed! Congratulations you are a new tradesman ");

        } else {
            System.out.println("The payment is failed! Please try again! ");
        }
    }
}
