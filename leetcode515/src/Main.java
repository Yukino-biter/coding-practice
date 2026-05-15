import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<String> ret;
    public StringBuffer path;
    public int lc;
    public int rc;
    public List<String> generateParenthesis(int n) {
        ret = new ArrayList<>();
        path = new StringBuffer();
        dfs(n);
        return ret;
    }

    private void dfs(int n) {
        if(path.length()==2*n){
            ret.add(path.toString());
        }
        if(lc<n) {
            path.append("(");
            lc++;
            dfs(n);
            path.deleteCharAt(path.length()-1);
            lc--;
        }
        if(rc<lc) {
            path.append(")");
            rc++;
            dfs(n);
            path.deleteCharAt(path.length()-1);
            rc--;
        }
    }

    public static void main(String[] args) {

        }
    }
