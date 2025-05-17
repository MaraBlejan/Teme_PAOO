import java.util.List;
public class CoffeeLover {
    private List<CoffeeMachine> coffeeMachines;

    public CoffeeLover(List<CoffeeMachine> coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }

    public void makeCoffee() {
        System.out.println("Coffee Lover: I'm making coffee using the injected machines!");
        for (CoffeeMachine machine : coffeeMachines) {
            machine.start();
            System.out.println("---");
        }
    }
}
