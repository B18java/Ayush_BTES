
import java.util.Scanner;


public class Employee {
    
    int emp_id;
    String emp_name; 
      
    Scanner  sc=new Scanner(System.in);

    public static void main(String args[])
    {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.emp_id=1;
        e1.emp_name="Ayush";
        
        e2.emp_id=2;
        e2.emp_name="pandu";
        e3.emp_id=3;
        e3.emp_name="piyuu";
        System.out.println("id is"+e1.emp_id+" "+"name is"+e1.emp_name);
        System.out.println("id is"+e2.emp_id+" "+"name is"+e2.emp_name);
        System.out.println("id is"+e3.emp_id+" "+"name is"+e3.emp_name);  
        Scanner s1=new Scanner(System.in);
        
        int id=s1.nextInt();
        if(id==e1.emp_id)
         e1.update(e1);
   
           System.out.println("id is"+e1.emp_id+" "+"name is"+e1.emp_name);
        System.out.println("id is"+e2.emp_id+" "+"name is"+e2.emp_name);
        System.out.println("id is"+e3.emp_id+" "+"name is"+e3.emp_name);  
    }
    void update(Employee x)
    {
      
       System.out.println("Enter the choice");
       int a=sc.nextInt();
       char choice='n';
     do  {
       switch(a)
       {
           case 1:
                   x.emp_name=sc.next();
                   System.out.println("");
                      break     ;
           case 2:
               x.emp_id=sc.nextInt();
               break;
               
           default:
               System.out.println("run the program again");
               break;
       }
       System.out.println("any more updation");
       choice=sc.next().charAt(0);
       }while(choice=='y');
      
       
        
    }
}
