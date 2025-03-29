public class Teacher extends Person
{
    protected String subject;
    protected Integer ID;
    public Teacher(String name,Address address,String subject,Integer ID)
    {
        super(name,address);
        this.subject=subject;
        this.ID=ID;
    }
    public String getSubject(){return subject;}
    public Integer getID(){return ID;}

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    @Override
    public String toString()
    {
        return ID+","+name+","+address.getStreet()+","+address.getTown();
    }
}