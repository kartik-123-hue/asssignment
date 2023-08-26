import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the x and y coordinate");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>=0 && y>=0){
            System.out.print("it is in the first  quadrant");
        }
        else if(x>=0 && y<=0){
            System.out.print("it is in the second  quadrant");
        }
        else if(x<=0 && y<=0){
            System.out.print("it is in the third  quadrant");
        }
        else{
            System.out.print("it is in the fourth  quadrant");
        }
    }
}
