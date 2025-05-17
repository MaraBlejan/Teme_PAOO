import java.util.List;
import java.util.ArrayList;
    public class CoffeeLover {
        private List<CoffeeMachine> coffeeMachines;

        public CoffeeLover() {
            this.coffeeMachines = new ArrayList<>(); // Initialize the list
        }

        // Setter method for injecting CoffeeMachines
        public void setCoffeeMachines(List<CoffeeMachine> coffeeMachines) {
            this.coffeeMachines = coffeeMachines;
        }

        // Method to add a single CoffeeMachine
        public void addCoffeeMachine(CoffeeMachine coffeeMachine) {
            this.coffeeMachines.add(coffeeMachine);
        }

        public void makeCoffee() {
            System.out.println("Coffee Lover: I'm making coffee using the injected machines!");
            for (CoffeeMachine machine : coffeeMachines) {
                machine.start();
                System.out.println("---"); // Separator for each machine's output
            }
        }
}
