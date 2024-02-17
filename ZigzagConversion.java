import java.util.Arrays;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        int n=numRows;
        if (n == 1) 
        {
            return s;
        }
        char[] str = s.toCharArray();
        int len = s.length();
 
        String[] arr = new String[n];
        Arrays.fill(arr, "");
 

        int row = 0;
        boolean down = true; 

        for (int i = 0; i < len; ++i) 
        {

            arr[row] += (str[i]);
            if (row == n - 1) 
            {
                down = false;
            } 
            else if (row == 0) 
            {
                down = true;
            }
            if (down)
            {
                row++;
            } 
            else
            {
                row--;
            }
        }
        StringBuilder res= new StringBuilder();
        for (int i = 0; i < n; ++i) 
        {
            res.append(arr[i]);
        }
        return res.toString();
    }
}
