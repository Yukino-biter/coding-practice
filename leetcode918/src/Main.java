import java.util.Stack;

public class Main {
    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char x : arr){
            if(x=='('||x=='{'||x=='['){
                stack.push(x);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                if((stack.peek()=='('&&x!=')')||(stack.peek()=='['&&x!=']')
                        ||(stack.peek()=='{'&&x!='}')) {
                return false;
                }
                else {
                    stack.pop();
                }

                }
            }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
     String s = "(]";
        System.out.println(isValid(s));
    }
}
