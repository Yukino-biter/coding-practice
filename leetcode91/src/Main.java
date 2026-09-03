import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        Map<Character,Integer> map = new HashMap<>();
       char[] tarr = t.toCharArray();
       char[] sarr = t.toCharArray();
       for (char x:tarr){
           map.put(x, map.getOrDefault(x,0)+1);
       }
       int left = 0;
       int count = 0;
       for (int right = 0;right<sarr.length;right++){
           char sa = sarr[right];
           int before = map.get(sa);
           map.put(sa, map.getOrDefault(sarr[right],0)-1);
            if(before>0){
                count++;
            }
            while (count>=t.length())
       }
    }
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ret = new ArrayList<>();
        if(s==null||s.length()==0||words==null||words.length==0)
            return ret;

        Map<String,Integer> map = new HashMap<>();
        int one_word = words[0].length();
        int len  = words.length;
        int all_len = len*one_word;
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for (int i = 0;i<one_word;i++){
            int left = i,right = i;
            int count = 0;
            Map<String,Integer> tem_map = new HashMap<>();
            while (right+one_word<=s.length()){
                String sub = s.substring(right,right+one_word);
                tem_map.put(sub, tem_map.getOrDefault(sub,0)+1);
                right+=one_word;
                count++;
                while (tem_map.get(sub)>map.getOrDefault(sub,0)){
                    String sub_left = s.substring(left,left+one_word);
                    tem_map.put(sub_left,tem_map.getOrDefault(sub_left,0)-1);
                    count--;
                    left+=one_word;
                }
                if (count==len){
                    ret.add(left);
                }
            }
        }
        return ret;
    }
}