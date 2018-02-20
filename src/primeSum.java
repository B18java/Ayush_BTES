
import java.util.Scanner;


public class primeSum {
    public static void main(String args[])
    {
        int num,count=0,i,j,sum=0;
    
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
for(i=1;i<=num;i++)

  {
     if(prime(i)||count<=num)
     {
         count++;
       sum=sum+i;
       
}
System.out.println();
}

System.out.println(i+" "+sum);

}
    static boolean prime(int k)
    {
        int j,p;
        boolean prime=true;
        for(j=2;j<=k/2;j++)
        {
         if(k%j==0)
         {
          prime=false;   
     }

         
}
        return prime;
    }
}