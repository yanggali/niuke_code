public class Solution2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello world");
        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        int len = str.length();
        for(int i = 0;i < len;i++){
            if(str.charAt(i) == ' '){
                sb.append("%20");
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
