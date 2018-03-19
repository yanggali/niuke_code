/**
 * 青蛙变态跳问题
 * f(n) = 2^(n-1)
 */
public class Solution9_2 {
    public int JumpFloorII(int target) {
//        if(target == 0) return 1;
//        else if(target == 1) return 1;
//        else{
//            return 2*JumpFloorII(target-1);
//        }
        //变态代码
        return 1<<--target;
    }
}
