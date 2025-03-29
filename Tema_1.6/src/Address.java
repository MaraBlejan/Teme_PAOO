public class Address{
    private String street;
    private String town;
    public Address(String street,String town) {
        this.street=street;
        this.town=town;
    }

  public static void  changeTeacherAddress(Teacher teacher,String newStreet,String newTown)
  {
      teacher.setAddress(new Address ( newStreet,newTown));
  }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void  changeStudentAddress(Student student , String newStreet, String newTown)
    {
        student.setAddress(new Address(newStreet,newTown));

    }
}