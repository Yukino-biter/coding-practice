import java.util.Scanner;

public class Main {
   static int n;
   static int x;
   static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        x = scanner.nextInt()*2;
        arr  = new int[n];
        int count = 0;
        for(int i = 1;i<n;i++){
            int t = scanner.nextInt();
            count+=t;
            arr[i] = t;
        }
        if(count<x){
            System.out.println(n);
            return;
        }
        int left = 0;
        int right = n-1;
        int ans = n;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(checks(mid)){
                right = mid-1;
                Math.min(ans,mid);
            }
            else{
                left = mid+1;
            }
        }
        System.out.println(ans);
    }

    private static boolean checks(int mid) {

    }
}