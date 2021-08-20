public class Solution {

    public int getNodes(TreeNode root,int max) {
        if(root == null){
            return 0;
        }

        int current = 0;

        if(root.val >= max){
            current++;
            max = root.val;
        }

        int left = getNodes(root.left, max);
        int right = getNodes(root.right, max);

        return current + left + right;
    }

    public int goodNodes(TreeNode root) {
        return getNodes(root, root.val);
    }
}
