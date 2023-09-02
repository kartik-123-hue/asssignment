import java.util.Scanner;

public class consonant {
    public static void main(String aargs[]){
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        char ch[]=str.toCharArray();
        char temp;
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(!isVowel(ch[i]) && !isVowel(ch[j])){
                temp=ch[j];
                ch[j]=ch[i];
                ch[i]=temp;
                i++;
                j--;
            }
            else if(isVowel(ch[i]) && !isVowel(ch[j])){
                i++;
            }
            else{
                j--;
            }
        }
        
        for(int k=0;k<str.length();k++){
            System.out.print(ch[k]);
        }
    }
    public static boolean isVowel(char c){
        return c=='a'||c=='e' || c=='i' || c=='o' || c=='u';
    }
}
