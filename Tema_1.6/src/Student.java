public class Student extends Person{
    private String  ID;
    public Student(String name,Address address,String ID)
    {
        this.ID=ID;
    }
    public String getID(){return ID;}

}