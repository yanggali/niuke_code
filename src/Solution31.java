/**
 * 连续子数组的最大和
 * 思路：动态规划，dp[i]代表第i个数结尾的连续子数组的最大和
 * dp[i] = data[i] if dp[i] < 0
 * dp[i] = dp[i-1] + data[i] if dp[i] >= 0
 */
public class Solution31 {
    public static int FindGreatestSumOfSubArray(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for(int i = 1;i < arr.length;i++){
            if (dp[i-1] < 0){
                dp[i] = arr[i];
            }
            else{
                dp[i] = dp[i-1]+arr[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int j = 0;j < arr.length;j++){
            max = dp[j] > max ? dp[j]:max;
        }
        return max;
    }
}
