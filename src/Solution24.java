public class Solution24 {
    public static void main(String[] args) {
        int[] num = {7,4,6,5};
        Solution24 s = new Solution24();
        System.out.println(s.VerifySquenceOfBST(num));
    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        return sequence.length > 0 && isSequenceOfBST(sequence,0,sequence.length-1);
    }
    public boolean isSequenceOfBST(int[] sequence, int start, int end){
        int i = start,mid = start;
        for(;i < end;i++){
            if(sequence[i] > sequence[end])
                break;
        }
        mid = i;
        for(;i < end;i++){
            if(sequence[i] < sequence[end]){
                return false;
            }
        }
        boolean left = true,right = true;
        if (mid < end-1 ) {
            right = isSequenceOfBST(sequence, mid, end - 1);
        }
        if(mid-1 > start){
            left = isSequenceOfBST(sequence, start, mid - 1) && isSequenceOfBST(sequence, mid, end - 1);
        }
        return right&&left;
    }
}
