package main.domain;

import main.infrastructure.CreditCardPayment;

public final class Member {
    private final String lastname;
    private final String firstname;
    private final int age;
    private final Address address;
    private CreditCardPayment card;
    public Member(String lastname, String firstname,int age, Address address){
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.address = address;
    }
    public Member(String lastname, String firstname,int age, Address address,CreditCardPayment Card){
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.address = address;
        this.card = Card;
    }

    public static Member of(String lastname, String firstname,int age, Address address){
        return new Member(lastname,firstname, age, address);
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() { return age;}

    public Address getAddress() { return address;}

    public CreditCardPayment getCard() {
        return card;
    }

    public void setCard(CreditCardPayment cardNumber) {
        this.card = cardNumber;
    }

}
