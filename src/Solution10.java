public class Solution10 {
    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while(flag!=0){
            if((flag & n) != 0){
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
}
