import java.util.Scanner;

public class sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        System.out.print("Enter the items present");
        int n=sc.nextInt();
        System.out.println("Enter the bag with indication of the risk of the items(0-2)");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //sorting
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n-1;j++){
                if(a[i]>=a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}
