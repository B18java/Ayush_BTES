
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Demo4 {
    public static void main(String args[])
    {
        int num,temp,rem,base=1,count=0,oct=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(temp>0)
        {
            rem=temp%8;
            if(rem!=0)
            {
                count++;
            }
            oct=oct+base*rem;
            temp=temp/8;
            base=base*10;
        }
       System.out.println(oct);
    }
}
