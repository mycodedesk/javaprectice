import java.io.*;
import java.util.*;
class strrings{
    public static void reversestr(String st,int s,int l,String strnew)
    {  
        if(l<0)
        {
            System.out.println(strnew);
            return ;
        }
        if(l>=0)
        {
           strnew+= st.charAt(l);
        }
    
     
      
      reversestr(st,s,l-1,strnew);
      
    

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String stnew="";
        reversestr(st,0,st.length()-1,stnew);

        
    }
}