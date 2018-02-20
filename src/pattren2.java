/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class pattren2 {
    public static void main(String args[])
    {
      int i,j,k;
      for(i=1;i<=4;i++)
      {
          for(j=1;j<=4-i;j++)
          {
              System.out.print(" ");
          }
      for(k=1;k<=i;k++)
      {
          System.out.print("*");
      }
     System.out.println();   
    }
    
}
}