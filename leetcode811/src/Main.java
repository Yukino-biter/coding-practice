//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int longestOnes(int[] nums, int k) {
        int slow = 0;
        int maxlen = 0;
        int z = 0;
        int len = nums.length;
        for (int fast = 0;fast<len;fast++){
          if(nums[fast]==0) {
              z++;
          }
            while (z>k){
                if (nums[slow]==0){
                    z--;
                }
                slow++;
            }
            maxlen = Math.max(maxlen,fast-slow+1);

    }
        return maxlen;
    }
    public int minOperations(int[] nums, int x) {
        int slow = 0;
        int len = nums.length;
        int sum = 0;
        int ret = Integer.MAX_VALUE;
        int s = 0;
        for(int xx: nums){
            s+=xx;
        }
        for (int fast = 0;fast<len;fast++){
            sum+=nums[fast];
            while (slow<=fast && sum>s-x){
                sum-=nums[slow];
                slow++;
            }
            if(sum==(s-x)){
                ret = Math.min(ret,len-(fast-slow+1));
            }
        }
        return ret==Integer.MAX_VALUE?-1:ret;
    }
}