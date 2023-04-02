import java.util.*;
import java.io.*;
class pp{
    public static void main(String[] args) {
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s,delim:",");
        String s1=st.nextToken();
        String s2=st.nextToken();
        String s3=st.nextToken();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }
}