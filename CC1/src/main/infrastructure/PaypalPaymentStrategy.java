package main.infrastructure;

public class PaypalPaymentStrategy implements Payment{

    private String email;
    private String password;

    public PaypalPaymentStrategy(String email, String password){
        this.email=email;
        this.password=password;

    }
    @Override
    public Boolean PaymentAllowed() {
        if((this.email==null) || (this.password==null)){
            return false;
        }else {
            return true;
        }
    }
}
