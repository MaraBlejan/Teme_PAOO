public class Student {
    public String name;
    public Integer note;
   public Student (String name,Integer note)
   {
       this.name=name;
       this.note=note;
   }
   @Override
    public String toString()
   {
       return "The student: "+ name + " - "+note ;
   }
}
