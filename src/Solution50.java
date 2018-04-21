/**
 * 把字符串转换成整数
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 */
public class Solution50 {
    public static void main(String[] args) {
        Solution50 s = new Solution50();
        System.out.println(s.StrToInt("123"));
    }
    public int StrToInt(String str) {
        if(str.equals("") || str.equals("0")) return 0;
        char[] chars = str.toCharArray();
        int num = 0,flag = 1;
        for(int i = 0;i < chars.length;i++){
            if (chars[i] < '0' || chars[i] > '9'){
                if((chars[i] == '+') && i == 0){
                    continue;
                }
                else if((chars[i] == '-') && i == 0) {
                    flag = -1;
                }
                else {
                    return 0;
                }
            }
            else {
                num = num * 10 + (chars[i] - '0');
            }
        }
        return flag * num;
    }
}
