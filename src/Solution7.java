import java.util.Stack;

public class Solution7 {
    //stack1用于入队操作
    Stack<Integer> stack1 = new Stack<Integer>();
    //stack2用于出队操作
    Stack<Integer> stack2 = new Stack<Integer>();
    //入队直接将元素加入stack1
    public void push(int node) {
        stack1.push(node);
    }
    //stack2的栈顶永远是最先进去的那个
    public int pop() {
        if(stack2.size() <= 0){
            while(stack1.size() > 0){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.size() <= 0){
            return -1;
        }
        return stack2.pop();
    }
}