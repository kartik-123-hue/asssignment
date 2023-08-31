import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        System.out.println("The size of the array");
        int n=sc.nextInt();
        System.out.println("The array:");
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the duplicates in the array");
        for(int i=0;i<n;i++){
            for(int j=n+1;j<n;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
