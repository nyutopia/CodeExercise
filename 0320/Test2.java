/*
����һ�ö�����������
���ö���������ת����һ�������˫������
Ҫ���ܴ����κ��µĽ�㣬
ֻ�ܵ������н��ָ���ָ��
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