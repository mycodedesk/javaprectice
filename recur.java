import java.io.*;
import java.util.*;
public class recur{
public static void towerofhanaoi(int n,String A,String B,String C)
{
  if(n==1)
  {
    System.out.println("transfer      "+n+"    from    "+A+"    to     "+C);
    return ;
   }
   towerofhanaoi(n-1,A,C,B);
   System.out.println("transfer     "+n+"      from     "+A+"     to     "+C);
   towerofhanaoi(n-1,B,A,C);
 }
 public static void main(String args[])
 { int n=3;
    towerofhanaoi(n,"s","h","d");
 }
 
    
}