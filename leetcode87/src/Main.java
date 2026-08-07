import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length-1;
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0;i<=len;i++){
            if(nums[i]>0){
                break;
            }
            int left = i+1;
            int right = len;
            int t = -nums[i];
            while (left<right){
                int sum = nums[left]+nums[right];
                if(sum>t){
                    right--;
                }
                else if(sum<t){
                    left++;
                }
                else {
                    ret.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right && nums[left] == nums[left+1]) left++;
                    while (left<right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return ret;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        int len = nums.length;
        for (int a = 0;a<len-3;a++){
            if(a>0&&nums[a]==nums[a-1])
                continue;
            for (int b = a+1;b<len-2;b++){
                if(b>a+1&&nums[b]==nums[b-1])
                    continue;
                int left = b+1;
                int right = len-1;
                while (left<right){
                    long t = (long) target-nums[a]-nums[b];
                    long sum = (long) nums[left]+nums[right];
                    if(sum>t){
                        right--;
                    }
                    else if(sum<t){
                        left++;
                    }
                    else{
                        ret.add(Arrays.asList(nums[a],nums[b],nums[left],nums[right]));
                        while (left<right&&nums[left] ==nums[left+1]) left++;
                        while (left<right&&nums[right] == nums[right-1]) right--;
                        right--;
                        left++;
                    }
                }
            }
        }
        return ret;
    }}
}