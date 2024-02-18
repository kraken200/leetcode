import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ls= new ArrayList<>();
        ls.add("()");
        for(int i=1;i<n;i++){
            List<String> tl= new ArrayList<>();
            for(String s: ls){
                StringBuilder temp= new StringBuilder(s);
                temp.insert(0,"(");
                temp.append(")");
                tl.add(temp.toString());
                temp.deleteCharAt(0);
                temp.insert(temp.length()-1,"(");
                tl.add(temp.toString());
                temp.deleteCharAt(temp.length()-1);
                temp.deleteCharAt(temp.length()-1);
                temp.insert(0,"()");
                tl.add(temp.toString());
            }
            tl.remove(tl.size()-1);
            ls.clear();
            ls.addAll(tl);
        }
        return ls;
    }
}
