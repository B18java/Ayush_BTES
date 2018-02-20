
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
public class Phone {
    public static void main(String args[])
    {
     int i,j;
     long num;
     Scanner sc=new Scanner(System.in);
     num=sc.nextLong();
     
     String s1=String.valueOf(num);
     String s2="";
     int count;
     
     for(i=0;i<s1.length();i++)
     {
       
         count = 1;
         if((s2.indexOf(s1.charAt(i))==-1))
         {
             for(j=i+1;j<s1.length();j++)
             {
                 if(s1.charAt(i)==s1.charAt(j))
                 {
                     count++;
                     
                 }
                
             }
              System.out.println(s1.charAt(i)+"occurs"+" "+count+" "+" times");
               s2=s2+s1.charAt(i);
     }
        
    }  
}
    }
    