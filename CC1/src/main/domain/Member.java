package main.domain;

import main.infrastructure.CreditCardPaymentStrategy;
import main.infrastructure.EmailValidationStrategy;
import main.infrastructure.PaypalPaymentStrategy;

public final class Member {
    private final String lastname;
    private final String firstname;
    private final int age;
    private final Address address;
    private final String email;
    private CreditCardPaymentStrategy card;
    private PaypalPaymentStrategy paypalAccount;
    private boolean paymentStrategy;

    public Member(String lastname, String firstname,int age, String email, Address address){
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.address = address;
        this.email = email;
    }
    public Member(String lastname, String firstname,int age, String email, Address address,CreditCardPaymentStrategy Card){
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.address = address;
        this.card = Card;
        this.email = email;
    }

    public Member(String lastname, String firstname,int age, String email, Address address,PaypalPaymentStrategy paypal){
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.address = address;
        this.paypalAccount = paypal;
        this.email= email;
    }
    public static Member of(String lastname, String firstname,int age, String email, Address address){
        return new Member(lastname,firstname, age, email, address);
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() { return age;}

    public String getEmail() {
        return email;
    }

    public Address getAddress() { return address;}

    public CreditCardPaymentStrategy getCard() {
        return card;
    }

    public void setCard(CreditCardPaymentStrategy cardNumber) {
        this.card = cardNumber;
        this.paymentStrategy = false;
    }

    public PaypalPaymentStrategy getPaypalAccount() {
        return paypalAccount;
    }

    public void setPaypalAccount(PaypalPaymentStrategy paypalAccount) {
        this.paypalAccount = paypalAccount;
        this.paymentStrategy = true;
    }
}
