public class Student extends Person{
    protected Integer  ID;
    public Student(String name,Address address,Integer ID)
    {
        super(name,address);
        this.ID=ID;
    }
    public Integer  getID(){return ID;}

    public void setID(Integer ID) {
        this.ID = ID;
    }
    @Override
    public String toString()
    {
        return ID+","+name+","+address.getStreet()+","+address.getTown();
    }
}