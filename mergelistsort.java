import java.util.*;
public class mergelistsort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] list1=new int[10];
        int[] list2=new int[10];
        int[] list3=new int[10];
        System.out.println("enter the no. of elements in list1");
        int n=sc.nextInt();
        System.out.println("enter the no. of elements in list2");
        int m=sc.nextInt();
        System.out.println("enter the  elements in list1");
        for(int i=0;i<n;i++)
        {
            list1[i]=sc.nextInt();
        }
        System.out.println("enter the  elements in list1");
        for(int j=0;j<m;j++)
        {
            list2[j]=sc.nextInt();
        }
       int o=n+m;
       System.arraycopy(list1,0,list3,0,n);
       System.arraycopy(list2,0,list3,n,o);
        for(int k=0;k<o;k++)
        {
       System.out.print(list3[k]);
        }
        for (int i = 1; i < n; ++i) {
            int key = list3[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && list3[j] > key) {
                list3[j + 1] = list3[j];
                j = j - 1;
            }
            list3[j + 1] = key;
        }
        System.out.println("Sort the list");
        for(int j=0;j<o;j++)
        {
            System.out.println(list3[j]);
        }

    }
}
