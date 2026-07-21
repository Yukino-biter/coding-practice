import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int triangleNumber(int[] nums) {
     Arrays.sort(nums);
     int ret = 0;
     for(int i = nums.length-1;i>2;i--){
         int left = 0;
         int right = i-1;
         while (left<right){
             int sum = (nums[left]+nums[right])-nums[i];
             if(sum>0){
                 ret+=right-left;
                 right--;
             }
             else {
                 left++;
             }
         }
     }
     return ret;
    }
    public static void main(String[] args) {

    }
}