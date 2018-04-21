import java.util.Arrays;

/**
 * 扑克牌的顺子
 * 从扑克牌中随机抽五个数，判断这五个数是否为顺子，其中大小王都看成0
 */
public class Solution44 {
    public static void main(String[] args) {
        Solution44 s = new Solution44();
        int[] t = {1,3,2,5,4};
        System.out.println(s.isContinuous(t));
    }
    public boolean isContinuous(int [] numbers) {
        int len = numbers.length;
        if (len < 5) return false;
        //先对这五个数排序
        Arrays.sort(numbers);
        //计算0的个数
        int zeroNum = 0;
        for(int i = 0;i < len;i++){
            if (numbers[i] == 0) {
                zeroNum++;
            }
        }
        //计算非零数中间间隔了多少数
        //并查看是否存在对数
        int interNum = 0;
        for (int j = 0;j < len-1;j++) {
            if(numbers[j] != 0){
                if(numbers[j] == numbers[j+1]){
                    return false;
                }
                interNum += numbers[j + 1] - numbers[j] - 1;
            }
        }
        if(interNum <= zeroNum){
            return true;
        }
        return false;
    }
}
