package main.infrastructure;

public class AgeValidationStrategy implements MembershipApplication{
    int age;
    public AgeValidationStrategy(int age){
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
