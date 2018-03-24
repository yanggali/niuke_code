public class Solution {
    public void reOrderArray(int [] array) {
        if(array.length == 0) return;
        int s = 0, e;
        while(s < array.length){
            while(s < array.length && (array[s] & 0x1) == 1){
                s++;
            }
            //此时s是第一个偶数的位置
            e = s+1;
            while(e < array.length && (array[e] & 0x1) != 1){
                e++;
            }
            //此时e是第一个奇数的位置
            if(e < array.length){
                //下面将s~e-1位置的数整体后移
                int temp = array[e];
                for(int i = e-1;i >= s ;i--){
                    array[i+1] = array[i];
                }
                array[s++] = temp;
            }
            else{
                break;
            }
        }
    }
}