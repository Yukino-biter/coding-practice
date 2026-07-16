//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int maxArea(int[] height) {
        int len = height.length-1;
        int left = 0;
        int right = len;
        int max = 0;
        while (left<right){
            int h = Math.min(height[left],height[right]);
            max = Math.max(max,h*(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }
    return max;
    }
    public static void main(String[] args) {

    }
}