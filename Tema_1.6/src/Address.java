public class Address {
    private String street;
    private String town;
    public Address(String street,String town)
    {
        this.street=street;
        this.town=town;
    }
    public String getStreet()
    {
        return street;
    }

    public String getTown() {
        return town;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public void setTown(String town)
    {
        this.town=town;
    }
}
