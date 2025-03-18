public class Student {
    private String name;
    private String first_name;
    private int ID;
   public Student(String name,String first_name,int ID )
   {
       this.name=name;
       this.first_name=first_name;
       this.ID=ID;
   }
   @Override
   public String toString()
    {
        return "The name of the student is: " + name+"\n"+
                "The first name of tha student is: "+first_name+"\n"+
                "The ID is: "+ID;
    }

}
