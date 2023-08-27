/ Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int colors[]=new int[100];
        int count=0,number=0;
        int n=sc.nextInt();
        System.out.print("Enter the colors elements:");
        for(int i=0;i<n;i++){
            colors[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=n;j++){
                if(colors[i]==colors[j]){
                 count++;  
                }
                }
                if(count%2==0){
                    number++;
                }
        }
        System.out.println(count);
        System.out.println("no match for"+number);
    }
}
