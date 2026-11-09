class Solution {
    // Storing elements along with structural null placeholders
    List<Integer> ans1 = new ArrayList<>();
    List<Integer> ans2 = new ArrayList<>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverse(p, ans1);
        traverse(q, ans2);
        
        // Use Java's built-in ArrayList equals comparison
        return ans1.equals(ans2);
    }

    private void traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(null); // Explicitly track empty positions
            return;
        }
        // Using a Preorder traversal here maintains structure safely
        list.add(root.val);
        traverse(root.left, list);
        traverse(root.right, list);
    }
}
