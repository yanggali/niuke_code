//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果

/**
 * 数组中只出现一次的数字
 * 题目描述：一个整型数组里除了“两个数字”之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 要求时间复杂度为O（n）,空间复杂度为O（1）
 * 思路：将两个不同的数划分到不同的数组，对这两个数组分别进行异或操作
 */
public class Solution40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        //diff是两个不同的数异或的结果
        int diff = 0;
        for (int i = 0; i < array.length; i++) {
            diff ^= array[i];
        }
        //找到这两个数二进制形式第一个不同的位置（即diff二进制形式第一位1的位置）
        int index = firstIndexOfOne(diff);
        num1[0] = 0;
        num2[0] = 0;
        //然后分成两个数组，一个是index位置与diff一样，一个是不一样。保证了两个不同数在不一样的数组，然后分别用异或
        for(int j = 0;j < array.length;j++){
            if(getBit(array[j],index)){
                num1[0] ^= array[j];
            }
            else{
                num2[0] ^= array[j];
            }
        }
    }
    public boolean getBit(int num,int index){
        num >>= index;
        return (num & 1) == 1;
    }
    public int firstIndexOfOne(int num) {
        int count = 0;
        while (((num & 0x1) == 0)&& (count < Integer.SIZE)){
            num >>= 1;
            count++;
        }
        return count;
    }
}
