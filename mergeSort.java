import java.util.*;
public class mergeSort{
  
        public static void conquer(int arr[],int si,int mid,int en) {
            int merge[]=new int[ei-si+1];
            int ind1=si;
            int ind2=mid+1;
            while(ind1<=mid &&ind2<=en)
            {
                if(arr[ind1]<=arr[ind2])
                {
                    merge[x]=arr[ind1];
                    ind++;
                }
                else{
                    merge[x]=arr[ind2];
                    ind2++;
                }
                x++;
            }
        }
        public static void divide(int arr[],int en,int si) {

            int  mid=si+(en-si)/2;
            if(si>=en)
            {
                return ;
            }
            divide(arr,si,mid);
            divide(arr,mid+1,en);
            conquer(arr,si,mid,en);
        }
        public static void main(String[] args) {
            int arr[]={6,3,9,5,2,8};
            int sz=arr.length;
    }
    
}