package CodeTemplates;

public class BinaryTree_RecursiveDFS {
    // Binary tree: DFS (recursive)
    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
    
        int ans = 0;
        // do logic
        dfs(root.left);
        dfs(root.right);
        return ans;
    }
}
