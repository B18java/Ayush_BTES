
import java.util.Scanner;


public class Hexa {
    public static void main(String args)
    {
        int num,temp,hexa=0,rem,base=1;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(temp>0)
        {
            rem=temp%16;
            hexa=hexa+rem*base;
            temp=temp/16;
            base=base*10;
            
            
        }
       System.out.println(hexa); 
    }
    
}
