package lesson10_Animals;

public class Dog extends Animal {
    String securityGuard;

    public Dog(String food, String location, String securityGuard) {
        super(food, location);
        this.securityGuard = securityGuard;

    }

    public String getSecurityGuard() {
        return securityGuard;
    }

    public void setSecurityGuard(String securityGuard) {
        this.securityGuard = securityGuard;
    }

    public void makeNoise() {
        System.out.println("Гав");
    }

    public void eat() {
        System.out.println("Кости, мясо");
    }
}
