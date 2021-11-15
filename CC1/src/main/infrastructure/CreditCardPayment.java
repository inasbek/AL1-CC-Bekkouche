package main.infrastructure;


public class CreditCardPayment implements Payment{
    String cardName,expirationDate,cardNumber;
    Double amount;

    public CreditCardPayment(Double amount,String cardName,String expirationDate, String cardNumber){
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.amount = amount;
    }

    public CreditCardPayment(String cardName,String expirationDate, String cardNumber){
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;

    }


    public Double getAmount() {
        return amount;
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

    @Override
    public Boolean PaymentAllowed() {
        if(cardNumber.length() != 13){
            return false;
        }else{
            return true;
        }
    }
}
