/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class alpha {
    public static void main(String args[])
    {
         int x,k,y;
        for(int i=1;i<=3;i++)
        {x=65;
            for(int j=3;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print((char)x);
                x++;
            }
            y=x-2;
            for(k=1;k<i;k++)
            {
                System.out.print((char)y);
                y--;
            }
            
            
            System.out.println();
        }
        
        
    }
}
    
    

