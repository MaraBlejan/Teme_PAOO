public class SimpleCoffeeMachine implements CoffeeMachine{
    @Override
    public void start() {
        System.out.println("Simple Coffee Machine: Starting to brew coffee...");
        System.out.println("Simple Coffee Machine: Grinding beans...");
        System.out.println("Simple Coffee Machine: Brewing...");
        System.out.println("Simple Coffee Machine: Coffee is ready!");
    }
}
