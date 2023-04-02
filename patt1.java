import java.util.*;
class patt1
{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
    if(i>=2){
        for(int j=n-2;j>0;j--)
        {
            if(j<=n-i)
            {
                System.out.print("");
            }
            else
            {
                System.out.print("*");
            }
        }
        System.out.println();
    }

   }
   for(int i=n;i>0;i--)
   {
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
   }    
     
    }
}