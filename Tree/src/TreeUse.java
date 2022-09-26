import java.util.Scanner;

public class TreeUse {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		TreeNode<Integer> root = takeInput(sc);
		TreeNode<Integer> root = takeInputLevelWise();
		print(root);
		System.out.println(largest(root));
		System.out.println(numNodes(root));
		printAtK(root, 2);
		preorder(root);
		System.out.println();
		
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(5);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(6);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(8);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(10);
//		
//		root.childrens.add(node1);
//		root.childrens.add(node2);
//		root.childrens.add(node3);
//		node3.childrens.add(node4);
//		
//		System.out.println(root);
	}

	public static void preorder(TreeNode<Integer> root) {
		if( root == null) {
			return;
		}
		System.out.println(root.data);
		for(int i=0; i<root.childrens.size(); i++) {
			preorder(root.childrens.get(i));
		}
		
	}
	
		// find number of nodes
	public static int numNodes(TreeNode<Integer> root) {
		int count = 1;
		for(int i = 0; i<root.childrens.size(); i++) {
			count+= numNodes(root.childrens.get(i));
		}
		return count;
	}
	
	public static void printAtK(TreeNode<Integer> root, int k) {
		if(k<0) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		for(int i = 0; i < root.childrens.size(); i++) {
			printAtK(root.childrens.get(i), k-1);
		}
	}
	
	public static int largest(TreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int ans = root.data;
		for(int i = 0; i < root.childrens.size(); i++) {
			int childLargest = largest(root.childrens.get(i));
			if(childLargest>ans) {
				ans = childLargest;
			}
		}
		return ans;
	}
	
	public static TreeNode<Integer> takeInput(Scanner sc) {
		
		int n;
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter next node data");
		n = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of childrens for: " + n);
		int childCount = sc.nextInt();
		for(int i=0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(sc);
			root.childrens.add(child);
		}
		return root;
	}
	
	public static TreeNode<Integer> takeInputLevelWise(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data:");
		int rootData = sc.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter num of childrens of:" + frontNode.data);
				int numChildren = sc.nextInt();
				for(int i = 0; i< numChildren; i++) {
					System.out.println("Enter " + (i + 1) + " th child of " + frontNode.data);
					int child = sc.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.childrens.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueneEmptyException e) {
				return null;
			}
		}
		return root;
	}
	
 	public static void print(TreeNode<Integer> root) {
		
		String s = root.data + ":";
		for(int i=0; i<root.childrens.size(); i++) {
			s = s + root.childrens.get(i).data + ",";
		}
		System.out.println(s);
		for(int i=0; i<root.childrens.size(); i++) {
			print(root.childrens.get(i)); 
		}
	}
	
	
}
