public class Main {
    public static void main(String[] args) {
        CoffeeLover coffeeLover = new CoffeeLover();
        coffeeLover.makeCoffee();

        System.out.println("\n--- Coffee Lover makes simple coffee ---");
        coffeeLover.makeSimpleCoffee();

        System.out.println("\n--- Coffee Lover makes complex coffee ---");
        coffeeLover.makeComplexCoffee();
    }
}
