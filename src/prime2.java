
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
public class prime2 {
    public static void main(String args[])
    {
        int i,j,beg,end;
        boolean is_prime=true;
        Scanner sc=new Scanner(System.in);
        ///beg=sc.nextInt();
        end=sc.nextInt();
        for(i=2;i<=end;i++)
        {
          for(j=2;j<=i;j++) 
          {
              if(i%j==0)
              {
                  is_prime=false;
                  break;
              }
          }
        }
         for(i=2;i<=end;++i)
         {
             if(is_prime==true)
             {
                 System.out.println(i);
             }
         
         }   
         
         
    }
}