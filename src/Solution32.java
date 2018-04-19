/**
 * 从1到n整数中1出现的次数
 */
public class Solution32 {
    public static void main(String[] args) {
        Solution32 s = new Solution32();
        System.out.println(s.NumberOf1Between1AndN_Solution_fast(10));
    }
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

    /**
     * O(logn)
     * @param n
     * @return
     */
    public int NumberOf1Between1AndN_Solution_fast(int n) {
        if(n == 1) return 1;
        int number = 0;
        for(int i = 1;i <= n;i*=10){
            int a=n/i,b=n%i;
            if(a % 10 > 1){
                number += (a/10+1)*i;
            }
            else if(a % 10 == 1){
                number += a/10*i+b+1;
            }
            else {
                number += (a/10)*i;
            }
        }
        return number;
    }
}
