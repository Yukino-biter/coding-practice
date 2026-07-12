//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void moveZeroes2(int[] nums) {
        int len = nums.length;
        for(int i = 0;i<len;i++){
            if(nums[i]==0){
                int j = i+1;
                while(j<len){
                    if(nums[j]!=0){
                        int tem = nums[j];
                        nums[j] = nums[i];
                        nums[i] = tem;
                        break;
                    }
                    j++;
                }
            }
        }
    }
    public void moveZeroes(int[] nums) {
    int len = nums.length;
    int left = 0;
    for(int right = 0;right<len;right++){
        if(nums[right]!=0){
            int tem = nums[left];
            nums[left] = nums[right];
            nums[right] = tem;
            left++;
        }
    }
    }
    public static void main(String[] args) {

        }
    }