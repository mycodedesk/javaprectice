import java.util.*;
class arr1{
    public static void main(String[] args) {
        int arr[]={10,60,30,24,50};
        for(int i=0;i<4;i++)
        {
            int mid=i;
            for(int j=i+1;j<5;j++)
            {
                if(arr[j]<arr[mid])
                {
                    mid=j;
                    int temp=arr[mid];
                    arr[mid]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
      
    
       
        
    }
}