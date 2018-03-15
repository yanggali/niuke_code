/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Solution8 {
    public static void main(String[] args) {
        int[] a = {1,0,1,1,1,1};
        System.out.println(minNumberInRotateArray(a));
    }
    public static int minNumberInRotateArray(int[] array) {
        if (array.length <= 0) {
            return 0;
        }
        int sIndex = 0, eIndex = array.length - 1, mIndex = sIndex;
        while (array[sIndex] >= array[eIndex]) {
            if (eIndex - sIndex <= 1) {
                mIndex = eIndex;
                break;
            }
            mIndex = (sIndex + eIndex) / 2;
            if(array[mIndex] == array[sIndex]&&array[mIndex] == array[eIndex]){
                return getMin(array,sIndex,eIndex);
            }
            else if (array[mIndex] >= array[sIndex]) {
                sIndex = mIndex;
            } else if(array[mIndex] <= array[sIndex]){
                eIndex = mIndex;
            }
        }
        return array[mIndex];
    }
    public static int getMin(int[] array,int start,int end){
        int minimum = array[start];
        for(int i = start;i <= end;i++){
            minimum = Math.min(minimum,array[i]);
        }
        return minimum;
    }
}
