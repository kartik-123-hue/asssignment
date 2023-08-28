import java.util.*;
import java.io.*;
class main{
    public static void main(String args[]){
        int mul=1;
        Stack<Integer> stk=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        while(number>0){
            stk.push(number%10);
            number/=10;
        }
         int size=stk.size();
        int a[]=new int[size];
        for(int i=size-1;i>=0;i--){
            a[i]=stk.get(i);
        }
        for(int i=size-1;i>=0;i--){
            mul=mul*a[i];
        }
        System.out.print("product value :"+mul);
    }
}
