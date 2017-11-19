package lesson15.foodTask;

public class FoodTest {
    public static void main(String[] args) {
        Food eda = new Food();
        eda.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Inside of instance anonymous class");
            }
        });
    }
}
