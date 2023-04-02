import java.util.*;
public class patt3{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
              if(i==1||i==n||i==2||i==n-1)
              {
                System.out.print("-");
              }
              else if(j==1||j==n||j==2||j==n-1){
                System.out.print("|");

              }
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }
     
        
    }
}