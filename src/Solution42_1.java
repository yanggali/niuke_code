/**
 * 左旋转字符串
 * 例如：”abcXYZdef”左旋转3位为：“XYZdefabc”
 */
public class Solution42_1 {
    public String LeftRotateString(String str,int n) {
        if(str.equals("") || str == null) return str;
        String res = str + str;
        int len = str.length();
        n %= len;
        res = res.substring(n,n+len);
        return res;
    }
}
