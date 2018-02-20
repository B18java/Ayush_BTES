/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Demo;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Demo5 {
    public static void main(String args[])
    {
        int num ,temp,count=0,rem,dec=0,base=1;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(temp>0)
        {
         rem=temp%10;
         dec=dec+base*rem;
         temp=temp/10;
         base=base*2;
         
        }
       System.out.println(dec);
    }
}
    

