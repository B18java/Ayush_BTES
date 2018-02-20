/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class chandigarh {
    public static void main(String args[])
    {
        int i,j=0,k;
        String s1=" i am ayush";
        String a="";
        String b="";
        int l=s1.length();
        for(i=0;i<l;i++)
        {
         if((s1.charAt(i)==' ')||(s1.charAt(i)==l-1)) 
         {
            if(i==l-1) 
            
               a= s1.substring(j,i+1);
            
                else
                
                    a=s1.substring(j,i);
                    for(k=a.length()-1;k>=0;k--)
                    {
                        b=b+a.charAt(k);
                    }
                        b=" "+b;
                       System.out.println(b);
                       j=i+1;
                   }
         
        }
    }
       
}

