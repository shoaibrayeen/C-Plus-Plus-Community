import java.util.Queue;
import java.util.LinkedList;
class MinInTree
{
	static class Node
	{
		int data;
		Node left;
		Node right;

		Node(int d)
		{
			data = d;
			left = right = null;
		}
	}
public static int levelOrder(Node root)
	{
		if(root == null)
			return 0;

		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int min = Integer.MAX_VALUE;

		while(!q.isEmpty())
		{
			Node curr = q.peek();
			if(curr.data< min)
				min = curr.data;
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
			q.remove();
		}
		return min;
	}
	public static void main(String[] args)
	 {
	 	Node root = new Node(12);
	 	root.left = new Node(2);
	 	root.right = new Node(3);
	 	root.right.right = new Node(1);
	 	
		System.out.print(levelOrder(root));
	}
}
