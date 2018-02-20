
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
public class Demo3 {
    public static void main(String args[])
    {
        int num,rem ,bin=0,count=0,base=1;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int temp=num;
       while(temp>0)
        {
            rem=temp%2;
            if(rem==1)
            {
                count++;
            }
            
            bin=bin+rem*base;
            temp=temp/2;
            base=base*10;
            
        }
   
    System.out.print(bin);
    }
    
}
