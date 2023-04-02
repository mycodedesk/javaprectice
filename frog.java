import java.io.*;
import java.util.Scanner;
public class frog{
    public static int stairs(int n)
    {
        if(n==1||n==0)
        return 1;
        if(n==2)
        return 2;
        if(n==3)
        return 4;

        return (stairs(n-1)+stairs(n-2)+stairs(n-3));
    }
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=stairs(num);
        
        System.out.println(" no of step required to reach the top "+n);
    }
}