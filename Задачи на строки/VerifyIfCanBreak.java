import java.util.*;

public class VerifyIfCanBreak{


    static boolean checkIfCanBreak(String S1, String S2) {
        int l1=S1.length();
        int l2=S2.length();
        char[] s1 = S1.toCharArray(), s2 = S2.toCharArray();
        Arrays.sort(s1);Arrays.sort(s2);
        
        

if (l1==l2){
        int N = s1.length, len1 = 0, len2 = 0;
        for (int i = 0; i < N; i++) if (s1[i] >= s2[i]){
            len1++;
        }
        for (int i = 0; i < N; i++) {if (s1[i] <= s2[i])
            len2++;
        }
        return len1 == N || len2 == N;

    }
    else{
      
      return false;  // System.out.print( " Length of strings are not equals");
    }
    }
    public static void main(String[] args) {
        String S1,S2,S3,S4;
        S1="xya";
        S2="adc";
        S3="abe";
        S4="acd";
        System.out.println (checkIfCanBreak(S1,S2));
        System.out.println (checkIfCanBreak(S3,S4));
    }
    
}