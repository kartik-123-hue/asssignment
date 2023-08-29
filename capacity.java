import java.util.*;
class main{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("n:");
        n=sc.nextInt();
        if(n==0){
            System.out.print("Time Estimate is :00");
            System.exit(0);
        }
        if(n>0 && n<=2000){
            System.out.print("Time Estimate is :25");
        }
        else if(n>2000 && n<=4000){
            System.out.print("Time Estimate is :35");
        }
        else if(n>4000 && n<=7000){
            System.out.print("Time Estimate is :45");
        }
        else{
           
            if(n<0){
                System.out.print("Invalid input");
            }
            else{
                 System.out.printf("Overloaded");
            }
        }
    }
}
