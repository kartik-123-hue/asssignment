import java.util.*;
public class DtoB {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,rem=0;
        int b[]=new int[10];
        System.out.println("Enter the decimal number");
        n=sc.nextInt();
        int i=0;
        while(n!=0){
            rem=n%2;
            b[i]=rem;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(b[j]);
        }
    }
}
