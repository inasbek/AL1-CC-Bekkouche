package main.infrastructure;

public class AgeValidation implements MembershipApplication{
    int age;
    public AgeValidation(int age){
        this.age = age;
    }
    @Override
    public Boolean verifyApplication() {
        if(this.age >= 18) {
            return true;
        }
        return false;
    }
}
