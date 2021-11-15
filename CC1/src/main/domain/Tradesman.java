package main.domain;

import main.domain.Address;

import java.util.Objects;

public final class Tradesman {
    private final String lastname;
    private final String firstname;
    private int age;
    private final Address address;

    public Tradesman(String lastname, String firstname,int age, Address address){
        this.lastname = Objects.requireNonNull(lastname);
        this.firstname = Objects.requireNonNull(firstname);
        if (age < 1) {
            throw new IllegalStateException("You must provide a valid age value.");
        }
        this.age = age;
        this.address = address;
    }
    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
