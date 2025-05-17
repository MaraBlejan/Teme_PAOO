public class CoffeeLover {
    private SimpleCoffeeMachine simpleMachine;
    private ComplexCoffeeMachine complexMachine;

    public CoffeeLover() {
        this.simpleMachine = new SimpleCoffeeMachine();
        this.complexMachine = new ComplexCoffeeMachine();
    }

    public void makeCoffee() {
        System.out.println("Coffee Lover: I'm making coffee!");
        System.out.println("Coffee Lover: First, let's use the simple machine:");
        simpleMachine.start();
        System.out.println("\nCoffee Lover: Now, let's make a more elaborate one with the complex machine:");
        complexMachine.start();
    }

    public void makeSimpleCoffee() {
        System.out.println("Coffee Lover: I'm making a simple coffee!");
        simpleMachine.start();
    }

    public void makeComplexCoffee(){
        System.out.println("Coffee Lover: I'm making a complex coffee!");
        complexMachine.start();
    }
}