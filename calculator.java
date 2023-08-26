import java.util.*;
class main{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        double a,b,result=0.0;
        String operator;
        System.out.print("Enter the expression : ");
        a=sc.nextDouble();
        operator=sc.next();
        b=sc.nextDouble();
        System.out.print("the result is:");
        switch(operator){
            case "+":result=a+b;
                System.out.print(result);
            break;
            case "-":result=a+b;
                System.out.print(result);
            break;
            case "*":result=a*b;
                System.out.print(result);
            break;
            case "/":if(b==0){
                System.out.print("Logic Error");
                System.exit(0);
            }
            else{
                result=a/b;
                System.out.print(result);
            }
            default:
            System.out.print("invalid");
        }
    }
}
