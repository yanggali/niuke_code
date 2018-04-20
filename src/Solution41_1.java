import java.util.ArrayList;
import java.util.Arrays;

/**
 * 和为S的两个数字
 * 题目描述：输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的
 */
public class Solution41_1 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if((array.length == 0 && sum == 0) || array.length < 2){
            return list;
        }
        int start = 0, end = array.length-1;
        while (start < end) {
            int temp = array[start]+array[end];
            if (temp == sum){
                list.add(array[start]);
                list.add(array[end]);
                break;
            }
            else if (temp > sum){
                end--;
            }
            else{
                start++;
            }
        }
        return list;
    }
}
