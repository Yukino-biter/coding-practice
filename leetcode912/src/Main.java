//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            while (nums[i]>=1&&nums[i]<=n&&nums[i] != nums[nums[i]-1]){
                int tem = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tem;
            }
        }
        for (int i = 0;i<n;i++){
            if(nums[i]-1!=i){
                return i+1;
            }
        }
        return n+1;
    }
    public static void main(String[] args) {

        }
    }
