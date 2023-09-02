import java.util.*;
public class factorial {
    public static void main(String args[]){
        double n,even=0,odd=0;
        double sum=0,term=0 ;
        Scanner sc=new Scanner(System.in);
        n=sc.nextDouble();
        for(double i=1;i<=n;i++){
            if(i%2==0){
                term=(-1.0*(i/fact(i)));
            }
            else{
                term=(i/fact(i));
            }
            sum+=term;
        }
        System.out.print((Math.abs(sum)));
    }
    public static double fact(double n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
