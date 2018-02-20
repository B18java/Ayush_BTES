
public class Zero {
    public static void  main(String args[])
    {
        int i,j;
        int n=5;
        for(i=0;i<5;i++)
        {
            for(j=0;j<i;j++)
            {
                if((i+j)%2==0)
                {
                   System.out.print("0"); 
                }
                else
                {
                   System.out.print("1");  
                }
          
            }
             System.out.println();
        }
    }
    
    
}
