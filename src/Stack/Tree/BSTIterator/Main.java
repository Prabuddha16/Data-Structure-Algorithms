package Stack.Tree.BSTIterator;

import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class Main {
    class BSTIterator {
        Stack<TreeNode> stack;

        public BSTIterator(TreeNode root) {
            stack = new Stack() ;
            pushLeftArmToStack(root) ;
        }

        public int next() {
            TreeNode node = stack.pop() ;
            pushLeftArmToStack(node.right) ;
            return node.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty() ;
        }

        private void pushLeftArmToStack(TreeNode node) {
            while(node != null) {
                stack.push(node) ;
                node = node.left;
            }
        }
    }
}
