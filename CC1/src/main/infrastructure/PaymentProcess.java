package main.infrastructure;

public class PaymentProcess implements Payment{
    CreditCardPaymentStrategy paymentByCard;
    Double amount;
    PaypalPaymentStrategy paymentByPaypal;
    Payment paymentS;


    public PaymentProcess(Double Amount,Payment payment){
        this.paymentS = payment;
        this.amount = Amount;
    }

    @Override
    public Boolean PaymentAllowed() {
        if((paymentS.PaymentAllowed()==true)){
            return true;
        }
        return false;

    }

    public void isAllowed(){
        if(this.PaymentAllowed() == true){
            System.out.println("The payment of "+this.amount+"$ is Allowed! Congratulations you are a new tradesman :D ");

        } else {
            System.out.println("The payment is failed! Please try again! ");
        }
    }
}
