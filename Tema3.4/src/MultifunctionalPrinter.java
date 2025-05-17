class MultifunctionalPrinter implements Printer, Scanner, Fax {
    @Override
    public void print() {
        System.out.println("Multifunctional Printer: Printing...");
    }

    @Override
    public void printDocument(String document) {
        System.out.println("Multifunctional Printer: Printing document: " + document);
    }

    @Override
    public void scan() {
        System.out.println("Multifunctional Printer: Scanning...");
    }

    @Override
    public String scanDocument() {
        System.out.println("Multifunctional Printer: Scanning a document.");
        return "Scanned Document Data";
    }

    @Override
    public void sendFax(String phoneNumber, String document) {
        System.out.println("Multifunctional Printer: Sending fax to " + phoneNumber + " with document: " + document);
    }

    @Override
    public void receiveFax() {
        System.out.println("Multifunctional Printer: Receiving fax...");
    }
}
