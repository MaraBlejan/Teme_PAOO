public class Person {

    protected  String name;
    protected Address address;

    public Person (String name,Address adress)
    {
        this.name=name;
        this.address=address;
    }
    public Person(){}

    public String getName(){return name;}
}
