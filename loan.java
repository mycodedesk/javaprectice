import java.io.*;
import java.util.*;
 abstract class loan{
   abstract void carloan();
   public void cloan()
   {

   }
 
   
}
abstract class xloan extends loan
{
   
  void loan()
  {
    System.out.println("ading");
  }   
void carloan()
  {
    System.out.println("hhh");
  }

      
    
}
class newclass extends xloan
{
    public static void main(String[] args) {
        newclass lx=new newclass();
        loan l;
        l=lx;
        l.carloan();
    }
}