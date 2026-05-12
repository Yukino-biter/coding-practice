import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<String> ret;
    public StringBuilder sb;
    public String[] hash = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv" ,
            "wxyz"};
    public List<String> letterCombinations(String digits) {
        ret = new ArrayList<>();
        sb = new StringBuilder();
        dfs(digits,0);
        return ret;
    }

    private void dfs(String dighits, int pos) {
        if(pos==dighits.length()) {
            ret.add(sb.toString());
            return;
        }
        String cur = hash[dighits.charAt(pos)-'0'];
        for(int i = 0;i<cur.length();i++) {
            sb.append(cur.charAt(i));
            dfs(dighits,pos+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }

    public static void main(String[] args) {

        }
    }
}