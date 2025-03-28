public class Teacher extends Person
{
    private String subject;
    public Teacher(String Name,Address address,String subject)
    {
        this.subject=subject;
    }
    public String getSubject(){return subject;}

}