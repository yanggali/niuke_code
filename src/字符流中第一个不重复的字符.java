/**
 * 字符流中第一个不重复的字符
 * 题目描述：
 */
public class 字符流中第一个不重复的字符 {
    int[] count = new int[256];
    StringBuffer s = new StringBuffer();
    public void Insert(char ch)
    {
        count[ch] ++;
        s.append(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char res = '#';
        char[] chars = s.toString().toCharArray();
        for(int i = 0;i < chars.length;i++){
            if (count[chars[i]] == 1){
                res = chars[i];
                break;
            }
        }
        return res;
    }
}
