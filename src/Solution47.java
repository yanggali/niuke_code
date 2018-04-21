/**
 * 不用加减乘除做加法
 * 题目描述：写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Solution47 {
    public int Add(int num1, int num2) {
        int sum = 0,carry = 0;
        do {
            //不考虑进位的加法
            sum = num1 ^ num2;
            //进位
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }while (num2 != 0);
        return num1;
    }
}
