/*
ÐòÁÐ»¯¶þ²æÊ÷
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
public class Test1{
    String Serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder sb = new StringBuilder();
        Serialize(root,sb);
        return sb.toString();
    }
    public void Serialize(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("#,");
            return;
        }
        sb.append(root.val);
        sb.append(",");
        Serialize(root.left,sb);
        Serialize(root.right,sb);
        
    }
    int index = -1;
    TreeNode Deserialize(String str) {
        if(str.length()==0) return null;
        String[] s = str.split(",");
        return Deserialize(s);
    }
    TreeNode Deserialize(String[] s){
        index++;
        if(!s[index].equals("#")){
            TreeNode tree = new TreeNode(0);
            tree.val = Integer.valueOf(s[index]);
            tree.left=Deserialize(s);
            tree.right=Deserialize(s);
            return tree;
        }
        return null;
    }
}