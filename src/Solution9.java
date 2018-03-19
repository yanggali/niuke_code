public class Solution9 {
    public int Fibonacci(int n) {
        int[] result = {0,1};
        if(n < 2){
            return result[n];
        }
        int first = 1;
        int second = 0;
        int third = 0;
        for(int i = 2;i <= n;i++){
            third = first+second;
            second = first;
            first = third;
        }
        return third;
    }
}
