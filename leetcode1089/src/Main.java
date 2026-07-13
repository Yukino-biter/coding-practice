//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void duplicateZeros(int[] arr) {
   int len = arr.length;
   int i = 0;
   int j = 0;
   while (j<len){
       if(arr[i]==0) {
           j++;
       }
       i++; j++;
   }
   i--; j--;
   while (i>=0){
        if(j<len) arr[j] = arr[i];
        if(arr[i]==0&&--j>0){
            arr[j] = 0;
        }
        i--;j--;
   }
    }
    public static void main(String[] args) {

        }
    }
