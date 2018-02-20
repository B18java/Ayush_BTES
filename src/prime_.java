/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class prime_ {
    public static void main(String args[])
    {
         int i,j,k,count;
       
        for(i=1;i<=6;i++)
        {count=1;
        for(k=1;k<=i*2;k++)
        {
            
            boolean isPrime=true;
                for(j=2;j<k;j++)
                {
                    if(k%j==0)
                    {
                    isPrime=false;
                   
                    break;
                    }
                }
                
        if((isPrime==true)&& count<=i)
        {
            System.out.print(k);
            count++;
        }
        }
        System.out.println();
        }
    }
    
}
