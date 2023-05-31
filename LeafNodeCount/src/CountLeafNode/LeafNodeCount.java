package CountLeafNode;

/*
 * 
 * How do you count a number of leaf nodes in a given binary tree?
 * 
 * leaf nodes => number of children is zero
 * 
 */

class Node{
	//key value 
	int data;
	
	//reference of left and right
	Node left, right;
	
	//constructor
	 Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}

public class LeafNodeCount {
	
	static int count;
	
	
	public static void CountleafNodes(Node root) {
		
		//check whether the root is null or not
		if(root == null)
			return;
		
		//if root is not null
		if(root.left == null && root.right == null) {
			System.out.println(root.data+" ");
		
			count= count + 1;
		}
		CountleafNodes(root.left);
		CountleafNodes(root.right);
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(7);
		root.left.left = new Node(5);
		root.right.left = new Node(9);
		root.right.right = new Node(3);
		root.right.left.left = new Node(4);
		root.right.left.right = new Node(6);
		
		CountleafNodes(root);
		System.out.println("The number of leaf nodes in a given number is :"+count);
	}

}
