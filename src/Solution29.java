import java.util.HashMap;
import java.util.Map;

public class Solution29 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> numTimes = new HashMap<>();
        int len = array.length/2;
        for(int i = 0;i < array.length;i++){
            if(numTimes.containsKey(array[i])){
                numTimes.put(array[i],numTimes.get(array[i])+1);
            }
            else {
                numTimes.put(array[i],1);
            }
            if(numTimes.get(array[i]) > len){
                return array[i];
            }
        }
        return -1;
    }
}
