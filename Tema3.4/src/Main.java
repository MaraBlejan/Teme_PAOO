public class Main {
    public static void main(String[] args) {
        // Using a simple printer
        System.out.println("--- Simple Printer ---");
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print();
        simplePrinter.printDocument("MyDocument.txt");

        // Using a multifunctional printer
        System.out.println("\n--- Multifunctional Printer ---");
        MultifunctionalPrinter multiPrinter = new MultifunctionalPrinter();
        multiPrinter.print();
        multiPrinter.printDocument("ImportantReport.pdf");
        multiPrinter.scan();
        String scannedData = multiPrinter.scanDocument();
        System.out.println("Scanned data: " + scannedData);
        multiPrinter.sendFax("123-456-7890", "Confidential.docx");
        multiPrinter.receiveFax();
    }
}

