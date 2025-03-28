import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String []arg)
    {
        List<Student>students=new ArrayList<>();

        students.add(new Student("Popescu Maria",10));
        students.add(new Student("Ionescu Andrei",7));
       students.add(new Student("Maria Iuliana",9));
        students.sort(Comparator.comparing(student->student.note));
        System.out.println("The updated list of students: "+students);

    }
}
