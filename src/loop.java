
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
public class loop {
 
    public static void main(String args[])
    {
        int i;
        
        Scanner sc=new Scanner(System.in);
      
      
      char  a[]={' ',' ',' ',' ',' '}; 
        for(i=0;i<=4;i++)
        {
            System.out.println(a);
            a[4-i]='*';
        }
            
        
        
    }
        
}
