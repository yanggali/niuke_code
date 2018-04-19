import java.util.*;

/**
 * 把数组排成最小的数
 */
public class Solution33 {
    public static void main(String[] args) {
        Solution33 s = new Solution33();
        int[] arr = {3,32,321};
        System.out.println(s.PrintMinNumber(arr));
    }
    public String PrintMinNumber(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < numbers.length;i++){
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String str1 = o1+""+o2;
                String str2 = o2+""+o1;
                return str1.compareTo(str2);
            }
        });
        String minNum = "";
        for (Integer integer : list) {
            minNum += integer;
        }
        return minNum;
    }
}
