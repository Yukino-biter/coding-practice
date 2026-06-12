import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int[] arrN = new int[n+1];
        int[] arrC = new int[n+1];
        long sum = 0;
        for(int i = 1;i<n+1;i++){
            arrN[i] = sc.nextInt();
        }
        for(int i = 1;i<n+1;i++){
            arrC[i] = sc.nextInt();
        }
        for(int i = 1;i<n;i++){
            for(int j = i+1;j<n+1;j++){
                if(i%2==j%2&&arrC[i]==arrC[j]){
                    sum+=(long) (i+j)*(arrN[i]+arrN[j]);
                }
            }
        }
        System.out.println(sum%10007);
        }

}