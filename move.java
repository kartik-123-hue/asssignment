import java.util.*;

class Main {
    public static void main(String args[]) {
        String s1;
        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        char ch[] = s1.toCharArray();
        char ch1[] = new char[s1.length()];
        int index = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (ch[i] == '-') {
                ch1[index] = ch[i];
                index++;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            if (ch[i] != '-') {
                ch1[index] = ch[i];
                index++;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(ch1[i]);
            }
        }
        
    }
