class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }
}