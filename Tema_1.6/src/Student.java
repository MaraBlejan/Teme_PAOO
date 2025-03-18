public class Student extends Person {
    private int ID;
    public Student (String name,String age,Address address,int ID)
    {
        super(name,age,address);
        this.ID=ID;
    }
   public int getID(){
        return ID;
   }
}
