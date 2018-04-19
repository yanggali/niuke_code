/**
 * 找一个数在排序数组中出现的次数
 */
public class Solution38 {
    public static void main(String[] args) {
        Solution38 s = new Solution38();
        int[] a = {1,1,1, 2, 3, 3, 3, 3, 4,4, 5};
        System.out.println(s.GetNumberOfK(a,6));
    }
    public int GetNumberOfK(int [] array , int k) {
        int s = 0, e = array.length-1;
        int end = getLastK(array,k,s,e);
        int start = getFirstK(array,k,s,e);
        int number = 0;
        if(start > -1 && end > -1){
            number = end-start+1;
        }
        return number;
    }

    /**
     * 二分法找第一个k
     * @param array
     * @param k
     * @param start
     * @param end
     * @return
     */
    public int getFirstK(int[] array,int k,int start,int end){
        if(end < start){
            return -1;
        }
        int midIndex = (end+start)/2;
        int mid = array[midIndex];
        if(mid == k){
            if(midIndex-1 >= 0&& array[midIndex-1] < mid || midIndex == 0){
                return midIndex;
            }
            else{
                end = midIndex-1;
            }
        }
        else if(mid < k){
            start = midIndex+1;
        }
        else{
            end = midIndex - 1;
        }
        return getFirstK(array, k,start,end);
    }
    public int getLastK(int[] array,int k,int start,int end){
        if(end < start){
            return -1;
        }
        int midIndex = (end+start)/2;
        int mid = array[midIndex];
        if(mid == k){
            if(midIndex < end && array[midIndex+1] > mid || midIndex == end){
                return midIndex;
            }
            else{
                start = midIndex+1;
            }
        }
        else if(mid < k){
            start = midIndex+1;
        }
        else{
            end = midIndex - 1;
        }
        return getLastK(array, k,start,end);
    }
}
