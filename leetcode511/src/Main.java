import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

    public  int sum;
    public  int pass;
    public List<List<Integer>> ret;
    public List<Integer> path;
    public boolean[] check;
     public List<List<Integer>> permuteUnique(int[] nums) {
        ret = new ArrayList<>();
        path = new ArrayList<>();
         Arrays.sort(nums);
         check = new boolean[nums.length];
        dfs1(nums,0);
        return ret;
     }

    private void dfs1(int[] nums, int pos) {
        if(pos == nums.length){
            ret.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(check[i]==true||(i!=0&&nums[i-1]==nums[i]&&check[i-1]==false)){
                continue;
            }
            else{
                check[i] = true;
                path.add(nums[i]);
                dfs1(nums,pos+1);
                path.remove(path.size()-1);
                check[i] = false;
            }
        }
    }

    public int subsetXORSum(int[] nums) {
     dfs(nums,0);
     return sum;
     }

     private void dfs(int[] nums, int pos) {
         sum+=pass;
         for(int i = pos;i<nums.length;i++){
            pass^=nums[pos];
            dfs(nums,i+1);
         }
     }

     public static void main(String[] args) {



    }
}