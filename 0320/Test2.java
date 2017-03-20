/*
输入一棵二叉搜索树，
将该二叉搜索树转换成一个排序的双向链表。
要求不能创建任何新的结点，
只能调整树中结点指针的指向。
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
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        if(pRootOfTree.left == null&&pRootOfTree.right==null) return pRootOfTree;
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode q = left;
        while(q!=null&&q.right!=null){
            q=q.right;
        }
        if(q!=null){
            q.right=pRootOfTree;
            pRootOfTree.left = q;
        }
         
        TreeNode right = Convert(pRootOfTree.right);
        if(right!=null){
            pRootOfTree.right=right;
            right.left = pRootOfTree;
        }
        return left==null?pRootOfTree:left;
    }
}