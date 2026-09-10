//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];
        for (int x:nums) {
            if(sum>=0) {
                sum += x;
            }
            else {
                sum = x;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
    public static void main(String[] args) {
            int[] nums =  new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        }
    }
