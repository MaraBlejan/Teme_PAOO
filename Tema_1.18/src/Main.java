import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[]arg) {
        Scanner scanner=new Scanner(System.in);
        List<Integer>numbers=new ArrayList<>();
        System.out.println("Introduceti numarul de elemente: ");
        int n= scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            numbers.add(scanner.nextInt());
        }
        System.out.println("Lista initiala: "+ numbers);
        Collections.sort(numbers);
        System.out.println("Lista numerelor ordonate este: " +numbers);
        scanner.close();
    }
}
