import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the turns");
        int turns= sc.nextInt();
        char ch='R';
        int x=0,y=0,distance=10;
        while(turns>0){
            switch(ch){
                case 'R':
                    x+=distance;
                    ch='U';
                    distance+=10;
                    break;
                case 'U':
                    y+=distance;
                    ch='L';
                    distance+=10;
                    break;
                case 'L':
                    x-=distance;
                    ch='D';
                    distance+=10;
                    break;
                case 'D':
                    y-=distance;
                    ch='A';
                    distance+=10;
                    break;
                case 'A':
                    x+=distance;
                    ch='R';
                    distance+=10;
                    break;
                default:
                    System.out.println("Invalid");
            }
            turns--;
        }
        System.out.println("("+x+","+y+")");
    }
}
