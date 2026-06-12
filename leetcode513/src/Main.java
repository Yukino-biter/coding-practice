import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<String> ret;
    public StringBuffer path;
    public int lc = 1;
    public int rc;
    public List<String> generateParenthesis(int n) {
        ret = new ArrayList<>();
        path = new StringBuffer("(");
        int len = 2*n;
        dfs(len);
        return ret;
    }

    private void dfs(int len) {
        if(path.length()==len) {
            ret.add(path.toString());
            return;
        }
        if(lc<=rc){
            path.append("(");
            lc++;
            dfs(len);
        }
        else {
            path.append("(");
            lc++;
            dfs(len);
            path.deleteCharAt(path.length()-1);
            path.append(")");
            rc++;
        }
        path.deleteCharAt(path.length()-1);
    }

    public static void main(String[] args) {

        }
    }
}