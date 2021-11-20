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
        System.out.println("You must have +18 to apply :( Check your age and repeat...");
        return false;
    }
}
