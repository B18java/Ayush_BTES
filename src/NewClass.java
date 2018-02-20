
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
public class NewClass {
    public static void main(String args[])
    {
        
    
    int i,j,temp;
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    for(i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt(); 
       for(j=0;j<a.length;j++)
        {
           if(a[i]>a[j])
           {
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
           }
        }
    }
    for(i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }
      
    }
   
    } 

