
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
public class NewClass1 {
    public static void main(String args[])
    {
        int start,end,i,j;
        boolean prime_is=true;
        Scanner sc=new Scanner(System.in);
       start=sc.nextInt();
        end=sc.nextInt();
        
        for(i=start;i<=end;i++)
        {
            int num=0;
          for(j=2;j<=i;j++) 
          {
              if(i%j!=0)
              {
               
               System.out.println(i) ;
              }
             num++; 
          }
          
          
           
           
        }
          
          
        }
        
      
 
    }

