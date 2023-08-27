import java.util.*;
class main{
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the array of colors for the socks");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        System.out.print("The pairs found"+count);
        System.out.println("The pairs which dont match"+(n-count));
    }
}
