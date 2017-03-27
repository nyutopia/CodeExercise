/*
Given a binary tree,
 find its minimum depth.
 The minimum depth is the number of nodes
 along the shortest path from the root node down to the nearest leaf node.
*/
����Ҫע����С����������ȵ�����
���������ȣ�����Ҫ���ǵ�ǰ�����Ƿ�Ϊ����������һ���������Ϊ0���������
��������һֱ�����������������ֵ��
������С��ȣ���Ҫ���ǵ�ǰ�����Ƿ�Ϊ�������������
����˫������
����С���Ϊ������������Сֵ�����ڵ�����������С���Ϊ������ȵ����ֵ����Ϊ��һ�������Ϊ0����
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
public class Test4{
    public int run(TreeNode root) {
        return getShortestDepth(root);
    }
    public int getShortestDepth(TreeNode root){
        if(root == null) return 0;
        if(root.right==null) return getShortestDepth(root.left)+1;
        if(root.left == null) return getShortestDepth(root.right)+1;
        return Math.min(getShortestDepth(root.left),getShortestDepth(root.right))+1;
        
    }
}


/*
��Ŀ����
����һ�ö����������������ȡ�
�Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·����
�·���ĳ���Ϊ������ȡ�
*/

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/      
public class Test2{
    public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        
        return (left>right)?left+1:right+1;
    }
}