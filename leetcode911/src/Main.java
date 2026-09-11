import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(p,q)->p[0]-q[0]);
        List<int[]> ans = new ArrayList<>();
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int i = 0;i< intervals.length;i++) {
            left = Math.min(left,intervals[i][0]);
            right = Math.max(right,intervals[i][1]);
            if(i == intervals.length-1||intervals[i+1][0]>right) {
                ans.add(new int[]{left,right});
                left = Integer.MAX_VALUE;
                right = Integer.MIN_VALUE;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {

        }
    }
}