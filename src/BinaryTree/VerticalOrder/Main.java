package BinaryTree.VerticalOrder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=br.readLine().split(" ");
        BinaryTree bt=new BinaryTree(arr);

        bt.order();

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

    static class Qobj {
        int hd;
        Node node;
        Qobj(int hd, Node node)
        {
            this.hd = hd;
            this.node = node;
        }
    }

    Node root;

    BinaryTree(String[] arr)
    {
        Queue<Node> queue= new LinkedList<>();
        construct(arr,0,queue);
    }

    public void order()
    {
        order(this.root);
    }

    private void order(Node root) {
        if (root.data == -1)
            return;

        // Create a map and store vertical order in
        // map using function getVerticalOrder()
        TreeMap<Integer, ArrayList<Integer> > m = new TreeMap<>();
        int hd;

        // Create queue to do level order traversal.
        // Every item of queue contains node and
        // horizontal distance.
        Queue<Qobj> que = new LinkedList<>();
        que.add(new Qobj(0, root));

        while (!que.isEmpty()) {
            // pop from queue front
            Qobj temp = que.poll();
            hd = temp.hd;
            Node node = temp.node;

            // insert this node's data in array of hash
            if (m.containsKey(hd)) {
                m.get(hd).add(node.data);
            }
            else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(node.data);
                m.put(hd, al);
            }
            if (node.left.data != -1)
                que.add(new Qobj(hd - 1, node.left));
            if (node.right.data != -1)
                que.add(new Qobj(hd + 1, node.right));
        }

        // Traverse the map and print nodes at
        // every horizontal distance (hd)
        for (Map.Entry<Integer, ArrayList<Integer> > entry : m.entrySet()) {
            ArrayList<Integer> al = entry.getValue();
            for (Integer i : al)
                System.out.print(i + " ");
            System.out.println();
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