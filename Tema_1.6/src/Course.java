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
    public void   removeStudentFromCourse(Student student)
    {
      students.remove(student);
    }
    public void removeTeacherFromCourse(Teacher teacher)
    {
     teachers.remove(teacher);
    }
    public void addStudentToCourse(Student student)
    {
        students.add(student);
    }
    public void addTeacherToCourse(Teacher teacher)
    {
        teachers.add(teacher);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;

    }


}