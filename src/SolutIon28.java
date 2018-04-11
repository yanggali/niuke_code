import java.util.ArrayList;
import java.util.Collections;

public class SolutIon28 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str != null && str.length() > 0) {
            allPermutation(str.toCharArray(),0,list);
        }
        return list;
    }
    public void allPermutation(char[] array,int start,ArrayList<String> list){
        if(start == array.length-1){
            list.add(String.valueOf(array));
        }
        else{
            for(int i = start;i < array.length;i++){
                if( i == start || array[i] != array[start]){
                    char t1 = array[start];
                    array[start] = array[i];
                    array[i] = t1;
                    allPermutation(array,start+1,list);
                    char t2 = array[start];
                    array[start] = array[i];
                    array[i] = t2;
                }
            }
        }
    }
}
