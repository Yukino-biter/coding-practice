//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int[] twoSum(int[] price, int target) {
        int left = 0;
        int right = price.length-1;
        while (left<right){
            int sum = price[left]+price[right];
            if(sum==target){
                return new int[]{price[left],price[right]};
            }
            else if(sum>target){
                right--;
            } else if (sum<target) {
                left++;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {

    }
}