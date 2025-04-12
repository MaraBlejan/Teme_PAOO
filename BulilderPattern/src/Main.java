public class Main {
    public static void  main(String []args)
    {
        Burger burger = new Burger.Builder()

                .addLettuce()
                .build();
        System.out.println(burger);
    }
}
