//determine the number of two wheeler and four wheeler
import java.util.*;
class main{
    public static void main(String args[]){
        int fw=0,tw=0;
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int w=sc.nextInt();
        if(w<=2 || w%2==0 || v<w){
            System.out.println("Invalid");
        }
        else{
            fw=(w-2*v)/2;
            System.out.println("TW"+(v-fw)+"FW"+fw);
        }
        
    }
}
