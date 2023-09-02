import java.util.Scanner;

public class vowel {
    public static void main(String argss[]){
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        char ch[]=str.toCharArray();
        char temp;
        //only for lower case values it can be modified for upper case also
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length()-1;j++)
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'){
                temp=ch[j];
                ch[j]=ch[i];
                ch[i]=temp;
                }
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }

    }
}
