package show.real.binarytree;

import java.util.Stack;

/**
 * @Auther: qiuyd
 * @Date: 2020/1/10 09:56
 * @Description:
 */
public class BinaryTree {
    class TreeNode{
        String val;
        TreeNode left;
        TreeNode right;
        TreeNode(String val){
            this.val=val;
        }
    }
    //                A
    //             B     C
    //          D    E      F

    public  TreeNode init(){
        TreeNode A=new TreeNode("A");
        TreeNode B=new TreeNode("B");
        TreeNode C=new TreeNode("C");
        TreeNode D=new TreeNode("D");
        TreeNode E=new TreeNode("E");
        TreeNode F=new TreeNode("F");
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.right=F;

        return A;
    }

    //                A
    //             B     C
    //          D    E      F

    //前序遍历 中-左-右  A  B  D  E  C  F
    public static void preLoad(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(" "+node.val+" ");
        preLoad(node.left);
        preLoad(node.right);
    }
    //中序遍历  左- 中-右  D   B   E   A  C  F
    public static  void midLoad(TreeNode node){
        if(node==null){
            return;
        }

        midLoad(node.left);
        System.out.print(" "+node.val+" ");
        midLoad(node.right);
    }
    //后序遍历 左- 右- 中  D   E  B  F  C  A
    public static void afterLoad(TreeNode node){
        if(node==null){
            return;
        }
        afterLoad(node.left);
        afterLoad(node.right);
        System.out.print(" "+node.val);
    }

    //                A
    //             B     C
    //          D    E      F
    //不使用递归
    //前序调用：中- 左- 右   A   B   D   E   C   F
    public static void preLoadNO(TreeNode node){

        Stack<TreeNode> stack=new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            System.out.print(" "+pop.val);

            if(pop.right!=null){
                stack.push(pop.right);
            }
            if(pop.left!=null){
                stack.push(pop.left);
            }

        }
    }

    //中序调用：左- 中-右  D  B  E  A  C  F

    public static void midLoadNO(TreeNode node){
        Stack<TreeNode> stack=new Stack<>();
        stack.push(node);

        while (node!=null&&!stack.isEmpty()){
            while (node.left!=null){
                stack.push(node.left);
                node=node.left;
            }
            TreeNode pop=stack.pop();
            System.out.println(" "+pop.val);

            if(pop.right!=null){
                node=pop.right;
                stack.push(node);
            }

        }
    }

    //后序遍历：左- 右 - 中 ： D  E  B  F  C  A

    public static void afterLoadNod(TreeNode node){
        Stack<TreeNode> stack=new Stack<>();
        stack.push(node);
        TreeNode pre=null;
        while (node!=null&&!stack.isEmpty()){
            while (node.left!=null){
                stack.push(node.left);
                node=node.left;
            }
            TreeNode peek = stack.peek();
            if(peek.right!=null&&pre!=peek&&peek.right!=pre){
                node=peek.right;
                pre=peek;
                stack.push(node);
            }else{
                stack.pop();

                System.out.println(" "+peek.val);
            }

        }
    }
    public static void main(String[] args) {

        //preLoad(new BinaryTree().init());

        afterLoadNod(new BinaryTree().init());
    }
}
