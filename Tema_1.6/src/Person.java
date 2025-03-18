public class Person {
    protected String name;
    protected String age;
    protected Address address;
    public Person(String name,String age,Address address)
    {
        this.name=name;
        this.age=age;
       this.address=address;
    }
    public Person()
    {

    }
    public String getName()
    {
        return name;
    }
    public String getAge()
    {
        return age;
    }
    public void setName()
    {
        this.name=name;
    }
    public void setAge()
    {
        this.age=age;
    }
    public void setAddress()
    {
        this.address=address;
    }
}
