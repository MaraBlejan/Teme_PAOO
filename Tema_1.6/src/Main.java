import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args)
    {
        Address addressStud1=new Address("Str. 1 Mai","Bucuresti");
        Student student1=new Student("Popescu Maria",addressStud1,325364);

        Address addressStud2= new Address("Str. Mihai Viteazu","Bucuresti");
        Student student2= new Student("Mihai Nicolae",addressStud2,534647);

        Address addressTeacher1=new Address("Str. Florilor","Craiova");
        Teacher teacher1= new Teacher("Popescu Maria",addressTeacher1,"Matematici Speciale",646348);

        Address addressTeacher2= new Address("Str. Sf. Maria","Craiova");
        Teacher teacher2=new Teacher("Ionescu Marian",addressTeacher2,"Algebra Liniara",645628);

        List<Teacher> teachersList=new ArrayList<>();

        List<Student>studentsList=new ArrayList<>();

        Course course= new Course("Metode Numerice",teachersList,studentsList);

        System.out.println("Add students to "+course.getCourseName());

        course.addStudentToCourse(student1);
        course.addStudentToCourse(student2);

        System.out.println("The list of students is: ");
        studentsList.forEach(student ->
        {
            System.out.println(student);
        });

        System.out.println("The list of students after the remove is: ");
        course.removeStudentFromCourse(student1);
        studentsList.forEach(student ->
        {
            System.out.println(student);
        });

        System.out.println("Add a teacher to : "+ course.getCourseName());
        course.addTeacherToCourse(teacher1);
        course.addTeacherToCourse(teacher2);

        teachersList.forEach(teacher->
        {
            System.out.println(teacher);
        });
        
        System.out.println("The list of teacher after the remove is: ");
        course.removeTeacherFromCourse(teacher1);
        teachersList.forEach(teacher->
        {
            System.out.println(teacher);
        });
    }
}