import java.util.ArrayList;

/**
 * 圆圈中剩下最后的数字
 */
public class Solution45 {
    public static void main(String[] args) {
        int n = 5;
        Solution45 s = new Solution45();
        System.out.println(s.LastRemaining_Solution(5,2));
    }
    public int LastRemaining_Solution(int n, int m) {
        if(m == 0 || n == 0) return -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            list.add(i);
        }
        int num = 0,index = m-1;
        while (list.size() > 1){
            if(index < list.size()){
                list.remove(index);
            }
            else{
                while (index >= list.size()){
                    index -= list.size();
                }
                list.remove(index);
            }
            index = index + m - 1;

        }
        return list.get(0);
    }
}
