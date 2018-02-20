/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class place {
   public static void main(String args[])
   {
       String s1="my name is";
       String a[]=s1.split(" ");
       String s2="";
       int i;
       for(i=a.length-1;i>=0;i--)
       {
          s2=s2+a[i]+" "; 
       }
         System.out.print(s2)  ;
   }
}
