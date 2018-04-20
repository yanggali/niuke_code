public class Solution42 {
    public static void main(String[] args) {
        Solution42 s = new Solution42();
        System.out.println(s.ReverseSentence("I am a student."));
    }
    public String ReverseSentence(String str) {
        String[] strs = str.split(" ");
        if (strs.length <= 0) return str;
        StringBuffer sb = new StringBuffer();
        for (int i = strs.length - 1; i >= 0; i--) {
            if(i == 0){
                sb.append(strs[i]);
            }
            else sb.append(strs[i]+" ");
        }
        return sb.toString();
    }
}
