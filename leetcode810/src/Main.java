import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int minSubArrayLen(int target, int[] nums) {
            int minlen = Integer.MAX_VALUE;
          int slow = 0;
          int len = nums.length;
          int sum = 0;
          for(int first = 0;first<len;first++){
              sum+=nums[first];
              while (sum>=target){
                  minlen = Math.min(minlen,first-slow+1);
                  sum-=nums[slow];
                  slow++;
              }
          }
          return minlen==Integer.MAX_VALUE? 0:minlen;
    }
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> hashmap = new HashMap<>();
        int slow = 0;
        int len = 0;
        char[] arr = s.toCharArray();
        for(int first =0;first<arr.length;first++){

            if(hashmap.containsKey(arr[first])){
                slow = Math.max(hashmap.get(arr[first]),slow);
            }
            hashmap.put(arr[first],first+1);
            len = Math.max(len,first-slow+1);
        }
        return len;
    }
    public static void main(String[] args) {

    }
}