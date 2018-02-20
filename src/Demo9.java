
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
public class Demo9 {
    public static void main(String args[])
    {
        int num,rem,base=1,temp,hexa=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            rem=temp%16;
            hexa=hexa+base*rem;
            num=num/16;
            base=base*2;
        }
        System.out.println(hexa);
    }
    
}
