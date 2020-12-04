import java.util.*;
public class TreeNode {
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
      
      public List<Integer> inorderTraversal(TreeNode root) {
          if( root == null){
              return new ArrayList<>();
          }
          Stack <TreeNode> stack = new Stack<>();
          List<Integer> list = new ArrayList<>();
          
          while(true){
              if(root!= null){
                  stack.push(root);
                  root = root.left;
              }
              else{
                  if(stack.isEmpty()){
                      break;
                  }
                  root = stack.pop();
                  list.add(root.val);
                  root = root.right;
              }
          }
          return list;
    }
}
