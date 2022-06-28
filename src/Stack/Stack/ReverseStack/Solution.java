package Stack.Stack.ReverseStack;

import java.util.Stack;
/*
    Time Complexity: O(N ^ 2)
    Space Complexity: O(N)

    Where N is the number of elements in Stack.
*/


public class Solution {
    private static void insertAtBottom(Stack<Integer> stack, int ele) {
        if (stack.isEmpty()) {
            stack.push(ele);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, ele);
        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }
}
