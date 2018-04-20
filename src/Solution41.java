import java.util.ArrayList;

/**
 * 和为S的连续正数序列
 * 题目描述：给定一个正数n，求所有和为给定值的连续正数序列(至少包括两个数)
 */
public class Solution41 {
    public static void main(String[] args) {
        Solution41 s = new Solution41();
        System.out.println(1);
        ArrayList<ArrayList<Integer>> l = s.FindContinuousSequence(9);
        System.out.println(l.size());
    }
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (sum <= 2) return list;
        int s = 1,e = 2;
        int mid = (sum + 1) / 2;
        int curSum = s+e;
        while (s < mid){
            if (curSum == sum){
                list.add(consList(s,e));
                curSum = curSum - s + e+1;
                s++;
                e++;
            }
            else if(curSum < sum){
                curSum += e+1;
                e++;
            }
            else {
                curSum -= s;
                s++;
            }
        }
        return list;
    }
    public ArrayList<Integer> consList(int s,int e){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = s;i <= e;i++){
            res.add(i);
        }
        return res;
    }
}
