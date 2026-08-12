import java.util.*;
import java.util.logging.Handler;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int totalFruit(int[] fruits) {
        int len = fruits.length;
        HashMap<Integer,Integer> hash = new HashMap<>();
        int maxlen = 0;
        int left = 0;
        for (int right = 0;right<len;right++){
            hash.put(fruits[right],hash.getOrDefault(fruits[right],0)+1);
            while ( hash.size()>2){
                hash.put(fruits[left],hash.get(fruits[left])-1);
                if(hash.get(fruits[left])==0)
                    hash.remove(fruits[left]);
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
    public List<Integer> findAnagrams(String s, String p) {
     int left = 0;
     List<Integer> ret = new ArrayList<>();
     int[] count = new int[26];
     int sn = s.length();
     int pn = p.length();
     if (sn<pn)
         return ret;
     for(char x: p.toCharArray()){
         count[x-'a']++;
     }
     for (int right = 0;right<sn;right++){
         count[s.charAt(right)-'a']--;
         while (count[s.charAt(right)-'a']<0){
             count[s.charAt(left)-'a']++;
                left++;
         }
         if(right-left+1==pn) ret.add(left);
     }
     return ret;
    }
    public static void main(String[] args) {

        }
    }
