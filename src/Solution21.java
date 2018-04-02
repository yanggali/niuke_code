import java.util.Stack;

/**
 * 实现一个数据结构能够使得min,push和pop的时间复杂度都为O(1)
 */
public class Solution21 {
    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        if(minStack.isEmpty()){
            minStack.push(node);
        }
        else {
            int curMin = minStack.peek();
            if(node < curMin){
                minStack.push(node);
            }
            else {
                minStack.push(curMin);
            }
        }
        data.push(node);
    }

    public void pop() {
        data.pop();
        minStack.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
