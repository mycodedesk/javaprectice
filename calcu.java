import java.util.*;
import java.util.Scanner;
public class calcu{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  first value to perform operation ");
        int n1=sc.nextInt();
        System.out.println("enter  second value to perform operation ");
        int n2=sc.nextInt();
        System.out.print("enter + ,-,*,/, which operation u want perform");
        char n=sc.nextChar();
        switch(n)
        {
            case '+':System.out.print(n1+n2);
            break;
            case '-':System.out.print(n1-n2);
            break;
            case '*':System.out.print(n1*n2);
            break;
            case '/':System.out.print(n1/n2);
            break;
            default:System.out.print("wrong");
        }

       

      
    }
}