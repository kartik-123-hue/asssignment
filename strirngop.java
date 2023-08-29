import java.util.*;
class main{
    public static void main(String args[]){
        String s1;
        char ch1[]=new char[100];
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        char ch[]=s1.toCharArray();
        ch1[0]=ch[0];
        int index=1;
        for(int i=1;i<s1.length();i++){
            if(ch[i]!=ch[i-1]){
                ch1[index]=ch[i];
                index++;
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(ch1[i]);
        }
        System.out.println("Encrypted");
        for(int i=0;i<index;i++){
            System.out.print((char)((int)ch1[i]+2));
        }
    }
}
