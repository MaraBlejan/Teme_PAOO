import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        CoffeeMachine simple1 = new SimpleCoffeeMachine();
        CoffeeMachine complex1 = new ComplexCoffeeMachine();
        CoffeeMachine simple2 = new SimpleCoffeeMachine();
        CoffeeLover coffeeLover = new CoffeeLover();
        List<CoffeeMachine> machines = new ArrayList<>();
        machines.add(simple1);
        machines.add(complex1);
        machines.add(simple2);
        coffeeLover.setCoffeeMachines(machines);
        coffeeLover.makeCoffee();
    }
}
