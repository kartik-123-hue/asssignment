import java.util.*;
class main{
    public static void main(String args[]){
        int a[]=new int[100];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("n:");
        n=sc.nextInt();
        System.out.print("Enter the packets filler");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       
        for (int i = 0; i < n - 1; i++) {
    if (a[i] == 0) {
        int j = i + 1;
        while (j < n && a[j] == 0) {
            j++;
        }
        if (j < n) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
    System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        System.out.print("]");
    }
}
