
/**
 * 判断一个数是否为丑数
 */
public class Solution34 {
    public static void main(String[] args) {
        Solution34 s = new Solution34();
        System.out.println(s.GetUglyNumber_Solution_fast(7));
    }
    public int GetUglyNumber_Solution_fast(int index) {
        if(index < 7) return index;
        int[] res = new int[index];
        res[0] = 1;
        int i = 1,t2 = 0, t3 = 0, t5 = 0;
        while (i < index){
            res[i] = min(res[t2] * 2,res[t3]*3,res[t5] * 5);
            if (res[i] == res[t2] * 2) t2++;
            if(res[i] == res[t3]*3) t3++;
            if(res[i] == res[t5]*5) t5++;
            i++;
        }
        return res[i-1];
    }
    public int min(int a, int b, int c){
        return Math.min(a,Math.min(b,c));
    }
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0) return 0;
        int count = 1,num = 2;
        while (count < index){
            if(isUglyNum(num++)){
                count++;
            }
        }
        return count;
    }
    public boolean isUglyNum(int num){
        while (num%2 == 0){
            num /= 2;
        }
        while (num%3 == 0){
            num/=3;
        }
        while (num %5 == 0){
            num /= 5;
        }
        return num == 1;
    }

}
