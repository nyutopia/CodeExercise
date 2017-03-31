/*
给定一颗二叉搜索树，
请找出其中的第k大的结点。
例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，
按结点数值大小顺序第三个结点的值为4。
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
public class Test2{
    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot==null||k<=0) return null;
        TreeNode[] ret = new TreeNode[1];
        MiddleSearch(pRoot,new int[1],k,ret);
        return ret[0];
        
    }
    
    public void MiddleSearch(TreeNode pRoot,int[] count,int k,TreeNode[] ret){
 		if(pRoot==null||ret[0]!=null) return;
      
        MiddleSearch(pRoot.left,count,k,ret);
       
        
        count[0]++;
        if(count[0]==k){
            ret[0]=pRoot;
        }
        
        MiddleSearch(pRoot.right,count,k,ret);
        
        
    }
}