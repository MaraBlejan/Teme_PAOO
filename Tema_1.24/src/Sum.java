import java.io.*;
public class Sum {
    public static void main(String[] args) {
        String fileName = "src/input.txt";
        int sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\s+");
                for (String token : tokens) {
                    try {
                        int number = Integer.parseInt(token);
                        sum += number;
                    } catch (NumberFormatException ignored) {

                    }
                }
            }
            System.out.println("Suma numerelor întregi este: " + sum);
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
        }
    }
}
