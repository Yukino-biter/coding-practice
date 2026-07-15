//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int square(int n){
        int sum = 0;
        while(n>0){
            int t = n%10;
            sum+=t*t;
            n /=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
            int slow = n;
            int fast = square(n);
            while(fast!=slow){
                slow = square(slow);
                fast = square(square(fast));
            }
            return slow == 1;
    }
    public static void main(String[] args) {

        }

}