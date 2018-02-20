
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
public class Demo2 {
    public static void main(String args[] )
    {
        int i=0,j;
        int a=0;
        long num ;
        Scanner sc=new  Scanner(System.in);
        num=sc.nextLong();
         long temp=num;
      while(temp>0)
      {
          temp=temp/10;
          i++;
          
      }
      System.out.println(i);
      String s=String.valueOf(num);
     for(j=0;j<=s.length()-1;j++)
         
     {
         if (s.charAt(j)==1)
         {
             
              a++;
             
         }
         
     }
      
      
        
    }
    
}
