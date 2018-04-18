/**
 * 从1到n整数中1出现的次数
 */
public class Solution32 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            count += getNumOfOne(i);
        }
        return count;
    }

    /**
     * 计算一个数中1出现的次数
     * @param num
     * @return
     */
    public int getNumOfOne(int num){
        int number = 0;
        while (num != 0){
            if(num%10 == 1){
                number ++;
            }
            num /= 10;
        }
        return number;
    }
}
