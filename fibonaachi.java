import java.io.*;
public class fibonaachi{
  
        public static int fib(int n)
        {
            if(n==0)
            return 0;
            if(n==1)
            return 1;
            int r=(fib(n-1)+fib(n-2));
            return r;
        }
        public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            int num =sc.nextInt();
            int n=fib(num);
            System.out.println("value at position num\t"+num+"is \t"+n);
        }
    
}