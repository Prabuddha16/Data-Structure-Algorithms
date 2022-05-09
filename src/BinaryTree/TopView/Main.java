package BinaryTree.TopView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=br.readLine().split(" ");
        BinaryTree bt=new BinaryTree(arr);

        bt.topview();

    }
}

class BinaryTree
{
    private static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
        }
    }

    Node root;

    BinaryTree(String[] arr)
    {
        Queue<Node> queue= new LinkedList<>();
        construct(arr,0,queue);
    }

    public void topview()
    {
        verticalTraversalTop(this.root);
    }

    private void verticalTraversalTop(Node root) {
        class QueueObj{
            final Node node;
            final int hd;

            QueueObj(Node node, int hd)
            {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> q = new LinkedList<>();
        Map<Integer, Node> topViewMap
                = new TreeMap<>();

        if (root.data == -1) {
            return;
        }
        else {
            q.add(new QueueObj(root, 0));
        }
        while (!q.isEmpty()) {
            QueueObj tmpNode = q.poll();
            if (!topViewMap.containsKey(tmpNode.hd)) {
                topViewMap.put(tmpNode.hd, tmpNode.node);
            }

            if (tmpNode.node.left.data != -1) {
                q.add(new QueueObj(tmpNode.node.left,
                        tmpNode.hd - 1));
            }
            if (tmpNode.node.right.data != -1) {
                q.add(new QueueObj(tmpNode.node.right,
                        tmpNode.hd + 1));
            }
        }
        for (Map.Entry<Integer, Node> entry :
                topViewMap.entrySet()) {
            System.out.print(entry.getValue().data+" ");
        }
    }


    private void construct(String[] arr,int ind,Queue<Node> queue)
    {
        if(ind>=arr.length)
            return;
        if(queue.size()==0)
        {
            Node nn= new Node(Integer.parseInt(arr[ind]));
            this.root=nn;
            queue.add(nn);
        }
        else
        {
            Node parent=queue.peek();
            if(parent.data!=-1){
                if(parent.left==null)
                {
                    parent.left= new Node(Integer.parseInt(arr[ind]));
                    queue.add(parent.left);
                }
                else
                {
                    if(parent.right==null)
                    {
                        parent.right= new Node(Integer.parseInt(arr[ind]));
                        queue.add(parent.right);
                        queue.poll();
                    }
                }
            }
            else
            {
                queue.poll();
                ind--;
            }
        }
        construct(arr,ind+1,queue);
    }

    public void display()
    {
        display_tree(this.root);
    }

    private void display_tree(Node root)
    {
        if(root==null)
            return;
        String str=root.data+"";
        if(root.left!=null)
        {
            str=root.left.data+" <= "+str;
        }
        else
        {
            str="END <= "+str;
        }

        if(root.right!=null)
        {
            str=str+" => "+root.right.data;
        }
        else
        {
            str=str+" => END";
        }
        System.out.println(str);
        display_tree(root.left);
        display_tree(root.right);

    }


}
