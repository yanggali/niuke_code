public class Solution9_1 {
    public int JumpFloor(int target) {
//        if(target == 0) return 0;
//        else if(target == 1) return 1;
//        else if(target == 2) return 2;
//        else{
//            return JumpFloor(target-1)+JumpFloor(target-2);
//        }
        int[] result = {0,1,2};
        if(target < 3) return result[target];
        int first = 2,second = 1,third = 0;
        for(int i =3;i <= target;i++){
            third = first+second;
            second = first;
            first = third;
        }
        return third;
    }
}
