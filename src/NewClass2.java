
abstract class NewClass2 {
    public void sum()
    {
        System.out.println("ayush");
        
    }
   abstract void cal();
         
     
    
    
}
class c extends NewClass2
{
    public void cal()
    {
        System.out.println("shivi");
    }
}
 
class a
{
    public static void main(String args[])
    {
        NewClass2 obj=new c();
        obj.cal();
        obj.sum();
    }
    
}