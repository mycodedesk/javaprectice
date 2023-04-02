

import java.io.*;
import java.util.*;
class str4{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st=br.readLine();
        int n=st.length();
        int temp=0;
        for(int i=0;i<n;i++)
        {
            if(st.charAt(i)>='0'&&st.charAt(i)<='9')
            {
                temp+=(int)st.charAt(i)-48;
            }
            
        }
        System.out.println(temp);
    }
}