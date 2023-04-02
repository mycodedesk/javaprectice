import java.util.*;
public class butterfly{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            
            for(int j=1;j<=i+1;j++)
            {
                System.out.print("*");
            }
           
            if(i>=2)
            {
                for(int j=1;j<=2*(n-1)-2*i;j++)
                {
                    System.out.print(" ");
                }
                 }
            if(i>=2)
            {
              for(int j=1;j<=i-1;j++)
              {
                System.out.print("*");
              }
             
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            if(i>=2)
            {
                for(int j=1;j<=2*(n-1)-(i-1)*2;j++)
                {
                    System.out.print(" ");
                }
            }
            if(n>=2)
            {
                for(int j=1;j<=i-2;j++)
                {
                    System.out.print("*");
                }
            }
          System.out.println();

        }
      
}
}