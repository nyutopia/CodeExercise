/*
��ʵ��һ��������
�����ж�һ�Ŷ������ǲ��ǶԳƵġ�
ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
*/

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
//�ⷨ1
public class Test4{
    boolean isSymmetrical(TreeNode pRoot){
        TreeNode mirror = getMirror(pRoot);
        return isSym(mirror,pRoot);
    }
    public boolean isSym(TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null) return true;
        if(node1==null||node2==null) return false;
        if(node1.val==node2.val) 
            return isSym(node1.left,node2.left)&&isSym(node1.right,node2.right);
        return false;
    }
   
    public TreeNode getMirror(TreeNode pRoot){
        if (pRoot == null) {
            return null;
        }
        TreeNode root = new TreeNode(pRoot.val);
        root.right = getMirror(pRoot.left);
        root.left = getMirror(pRoot.right);
        return root;
    }
    
}

//�ⷨ2
public class Solution {
    boolean isSymmetrical(TreeNode pRoot){
        if(pRoot==null) return true;
        return isSym(pRoot.left,pRoot.right);
    }
    public boolean isSym(TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null) return true;
        if(node1==null||node2==null) return false;
        if(node1.val==node2.val) 
            return isSym(node1.left,node2.right)&&isSym(node1.right,node2.left);
        return false;
    }
}