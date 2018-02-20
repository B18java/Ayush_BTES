/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ayush_khanna;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ayush {
    public static void main(String args[])
    {
        long num=998826,temp;
        int i,count=0,j,k=0;
       
        temp=num;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        String s1=String.valueOf(num);
        int l=s1.length();
        for(i=0;i<=count;i++)        
             {
                       for(j=0;j<=l-1;j++)    
                       {
                           if(i==s1.charAt(j))
                           {
                               k++;
                           }
                           
                       }
                           
               System.out.println("value of"+i+"occurs"+k);            
  
           
        }
        
        
    }
}
