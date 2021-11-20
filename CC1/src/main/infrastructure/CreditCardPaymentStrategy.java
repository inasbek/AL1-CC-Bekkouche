package main.infrastructure;


public class CreditCardPaymentStrategy implements Payment{
    String cardName,expirationDate,cardNumber, cvv;

    public CreditCardPaymentStrategy(String cardName,String expirationDate, String cardNumber, String CVV){
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = CVV;
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    @Override
    public Boolean PaymentAllowed() {
        if(cardNumber.length() != 13){
            System.out.println("Please check your CVV!");
            return false;
        }
        if(cvv.length() !=3) {
            System.out.println("Please check your card number!");
            return false;
        }

        return true;

    }
}
