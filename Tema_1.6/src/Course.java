import java.util.List;

public class Course{
    private String courseName;
    private List<Teacher>teachers;
    private List<Student> students;
    public Course(String courseName,List<Teacher>teachers,List<Student>students)
    {
        this.courseName=courseName;
        this.teachers=teachers;
        this.students=students;
    }
    public  static Course createNewCourse(String courseName,List<Teacher>teachers,List<Student>students)
    {
    return new Course(courseName,teachers,students);
    }
    public void removeStudentFromCourse(String name,String courseName)
    {
        students.remove(name);
    }
    public void removeTeacherFromCourse(String name,String courseName)
    {
        students.remove(name);
    }
    public void addStudentToCourse(String name,String courseName,Address address,String id)
    {
        students.add(new Student(name,address,id));
    }
    public void addTeacherToCourse(String name,String courseName,Address address,String subject)
    {
        teachers.add(new Teacher(name,address,subject));
    }
}