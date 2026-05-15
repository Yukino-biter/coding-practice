import java.util.*;

public class leet {
    Set<List<Integer>> ret;
    List<Integer> path;
    boolean[] check;
    public List<List<Integer>> combine(int n, int k) {
        ret = new HashSet<>();
        path = new ArrayList<>();
        check = new boolean[n+1];
        dfs(n,k);

        return new ArrayList<>(ret);
    }

    private void dfs(int n,int k) {
        if(path.size()==k){
            List<Integer> temp = new ArrayList<>(path);
            Collections.sort(temp);
            ret.add(temp);
            return;
        }
        for(int i = 1;i<=n;i++){
            if(check[i]==false){
                path.add(i);
                check[i]=true;
                dfs(n,k);
                check[i] = false;
                path.remove(path.size() - 1);
                check[i] = false;
            }
        }
    }
}
