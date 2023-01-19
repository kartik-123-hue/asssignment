import java.util.*;
public class lastword
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter the the string");
        str=sc.nextLine();
        String[] strarr=str.split("\\s");
        int length =strarr[strarr.length-1].length();
        System.out.println("\nlenght of last word"+strarr[strarr.length-1]+"is :-\n"+length);


    }
}
