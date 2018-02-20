
import java.util.Scanner;


public class Prime {
    public static void main(String args[])
    {
        int num,i;
        boolean prime_is=true;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                prime_is=false;
                break;
            }
        }
            if(prime_is==false)
            {
                System.out.println("no is not prime");
                
                
            }
            else
            {
              System.out.println("no is  prime");  
            }
            
        
        
    }
            
    
}
