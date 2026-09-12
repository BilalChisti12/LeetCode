class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int len = q.size();
            
            for(int i = 0; i < len; i++){
                TreeNode node = q.poll();
                
                if(i == len - 1) res.add(node.val);
                
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        
        return res;
    }
}