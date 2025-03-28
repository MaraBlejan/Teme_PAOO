import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        Integer x = null;
        Integer y = null;
        try {
            System.out.println("First number: ");
            String input1 = scanner.nextLine();
            if (input1.isEmpty()) throw new NullPointerException("The first number is NULL!");
            x = Integer.parseInt(input1);
            System.out.println("Second number: ");
            String input2 = scanner.nextLine();
            if (input2.isEmpty()) throw new NullPointerException("The second number is NULL!");
            y = Integer.parseInt(input2);
            int s = x + y;
            System.out.println("The sum is: " + s);

        } catch (NumberFormatException e) {
            System.out.println("Error: invalid tipe !");
        } catch (NullPointerException e) {
            System.out.println("Error:"+ e.getMessage());

        }finally {
            scanner.close();
            System.out.println("Finish program!");

        }
    }

}

