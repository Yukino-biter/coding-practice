import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] dp = new int[n+1];
        for (int i = 1;i<n+1;i++){
            int a = sc.nextInt();
            dp[i] = Math.max(dp[i-1],map.getOrDefault(a^x,0));
            map.put(a,i);
        }
        while (m-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(dp[r]>=l){
                System.out.println("yes");
                continue;
            }
            else{
                System.out.println("no");
                continue;
            }
        }
    }
}