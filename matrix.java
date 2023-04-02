import java.util.*;
class matrix{
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int [][]arr1={{1,2,3},{4,5,6},{7,8,9}};
        int   [][]arr2={{0,0,0},{0,0,0},{0,0,0}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr2[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.out.print( "    "+arr2[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr2[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.out.print("   "+ arr2[i][j]);
            }
            System.out.println();
        }
        
        
    }
}