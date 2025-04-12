public class Example {
    public static void main(String[] args) {
        Counter counter1 = Counter.getCounter();
        Counter counter2 = Counter.getCounter();

        counter1.increment();
        counter1.increment();

        System.out.println("Counter 1: " + counter1.getCount());
        System.out.println("Counter 2: " + counter2.getCount());
        if(counter1 == counter2)
        {
            System.out.println("true");
        }
        if(counter1.hashCode() == counter2.hashCode())
        {
            System.out.println("1");
        }
    }
}
