package InOrderTree;

/*
 * 
 * Write code to print InOrder traversal of a tree?


 */
class Node{
	//key value 
	int key;
	
	//reference of left and right
	Node left, right;
	
	//constructor
	Node(int key){
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

//InOrder transverse tree
// left, root, right

public class InOrderTree {
	
	public static void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.key);
		inOrder(root.right);
		
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		inOrder(root);
	}
}
