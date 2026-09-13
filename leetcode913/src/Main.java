import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        int ans = 0;
        for(int x:nums){
            hash.add(x);
        }
        for(int x:hash){
            if(hash.contains(x-1))
                continue;
            int y = x+1;
            while (hash.contains(y)){
                y++;
            }
            ans = Math.max(y-x,ans);
        }
        return ans;
    }
    public static void main(String[] args) {

        }

}