/**
 * 数组中重复的数字
 * 题目要求：在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 */
public class 数组中重复的数字 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length <= 0){
            duplication[0] = -1;
            return false;
        }
        int[] count = new int[length];
        for (int i = 0;i < length;i++){
            count[i] = -1;
        }
        boolean flag = false;
        for(int j = 0;j < length;j++){
            count[numbers[j]]++;
            if(count[numbers[j]] > 0){
                duplication[0] = numbers[j];
                flag = true;
                break;
            }
        }
        return flag;
    }
}
