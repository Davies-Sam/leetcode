import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App {
   
    public static void main(String[] args) throws Exception {
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode root = new TreeNode(1, l, r);
        System.out.println(Arrays.toString(inorderTraversal(root).toArray()));

    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) 
        {
            if(root.left!= null) 
            {
                helper(root.left, res);
            }
    
            res.add(root.val);
            if(root.right!= null)
            {
                helper(root.right, res);
            }
        }
        
    }
}

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
}

