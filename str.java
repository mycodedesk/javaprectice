import java.util.*;
class str{
    public static void main(String[] args) {
        String name="javatpoint";  
        char ch=name.charAt(10);//returns the char value at the 10th index  
        System.out.println(ch); 
        String s1="javatpoint";  

        String s2="python";  
        System.out.println("string length is: "+s1.length());//10 is the length of javatpoint string  
        System.out.println("string length is: "+s2.length());//6 is the length of python string  

         
       System.out.println(s1.substring(2,4));//returns va  
       System.out.println(s1.substring(2));//returns vatpoint 

       System.out.println(s1.isEmpty()); 

       String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
       System.out.println(replaceString);
       
       String s11=new String("hello");  
       String s21="hello";  
       String s31=s11.intern();//returns string from pool, now it will be same as s2  
       System.out.println(s11==s21);//false because reference variables are pointing to different instance  
       System.out.println(s21==s31);//true because reference variables are pointing to same instance 
        
       System.out.println(s1+"javatpoint");//without trim()  
       System.out.println(s1.trim()+"javatpoint");//with trim() 
       
       String s21=s1.toUpperCase();  
       System.out.println(s21);
       
       String s31=s1.toUpperCase();  
       System.out.println(s31); 

       String s41=s1.toLowerCase();  
       System.out.println(s41); 

       String str = "Javatpointtt";  
       System.out.println("Returning words:");  
        String[] arr = str.split("t", 0);  
        for (String w : arr) {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);  
    } 


    }
}