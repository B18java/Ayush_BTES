
import java.util.Scanner;
public class Demo6 {
    public static void main(String args[])
    {
        int num,temp,rem,base=1,dec=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(temp>0)
        {
            rem=temp%10;
            dec=dec+base*rem;
            temp=temp/10;
            base=base*8;
            
            
        }
        System.out.println(dec);
    }
    
}
