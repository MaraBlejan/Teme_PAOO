public class Address{
    private String street;
    private String town;
    public Address(String street,String town) {
        this.street=street;
        this.town=town;
    }
    public void setAddress(String street,String town)
    {
        this.street=street;
        this.town=town;
    }
    public String getAddress(String street,String town)
    {
        return "The adreess is: "+street+ " ,"+town+"\n";
    }

}