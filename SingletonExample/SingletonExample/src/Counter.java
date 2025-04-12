class Counter {
    private static Counter counter = null;
    private int count;

    private Counter() {
        count = 0;
    }

    public static Counter getCounter() {
        if (counter == null) {
            counter = new Counter();
        }
        return counter;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
