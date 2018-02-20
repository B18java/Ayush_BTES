
import java.util.Scanner;


public class prime_pattren {
    public static void main(String args[])
    {
        int num,i,j,k,count=0,sum=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
    for(i=1;i<=num;i++)
    { 
       int flag=0;
        for(j=2;j<i;j++)
        {
          if(i%j==0)
          {
              flag=1;
              break;
    }
        }
       
    
    if(flag==0)
       {
           count++;
           if(count<num)
           {
               sum=sum+i;
             System.out.print(i);  
           }
           
       }
     System.out.println();  
    }
    
    System.out.println(sum);
    }
    
    }

        
    
    

    
    
