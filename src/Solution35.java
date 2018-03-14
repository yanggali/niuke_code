import java.util.*;

public class Solution35 {
    public int FirstNotRepeatingChar(String str) {
        char[] charArray = str.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();
        for(int i = 0;i < charArray.length;i++){
            if(!charMap.containsKey(charArray[i])){
                charMap.put(charArray[i],1);
            }
            else{
                charMap.put(charArray[i],charMap.get(charArray[i])+1);
            }
        }
        for(int i = 0;i < str.length();i++){
            if(charMap.get(charArray[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}
