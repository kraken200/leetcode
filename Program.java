import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Program {
public String longestPalindrome(String s) {
        int max=1;
        int start=0;
        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i]=true;
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                start=i;
                max=2;
            }
        }
        for(int k=3;k<s.length();k++){
            for(int i=0;i<s.length()-k+1;i++){
                int j=i+k-1;
                if(dp[i+1][j-1] && s.charAt(i)==s.charAt(j)){
                    if(k>max){
                        start=i;
                        max=k;
                    }
                }
            }
        }
        return s.substring(start,start+max);
    }
    public static void main(String[] args) {
        
        Program p=new Program();
        p.longestPalindrome("ccc");
    }
}