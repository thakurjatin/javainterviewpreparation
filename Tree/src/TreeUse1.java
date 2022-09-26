import java.awt.RenderingHints.Key;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		TreeNode<Integer> rooTreeNode  = takeInput(sc);
		TreeNode<Integer> rooTreeNode = takeIputLevelwise();
		print(rooTreeNode);
		System.out.println(numNodes(rooTreeNode));
		printAtK(rooTreeNode, 2);

		
//		TreeNode<Integer> rooTreeNode = new TreeNode<Integer>(3);
//		TreeNode<Integer> n1 = new TreeNode<Integer>(4);
//		TreeNode<Integer> n2 = new TreeNode<Integer>(7);
//		TreeNode<Integer> n4 = new TreeNode<Integer>(1);
//		TreeNode<Integer> n5 = new TreeNode<Integer>(6);
//		
//		rooTreeNode.childrens.add(n1);
//		rooTreeNode.childrens.add(n2);
//		rooTreeNode.childrens.add(n4);
//		n4.childrens.add(n5);`
		
		
		
		
	//	System.out.println(rooTreeNode.childrens.size());
  	}
	
	private static void printAtK(TreeNode<Integer> rooTreeNode, int i) {

		if(i<0) {
			return;
		}
		if(i == 0) {
			System.out.println(rooTreeNode.data);
			return ;
		}
		for(int k=0; k<rooTreeNode.childrens.size(); k++) {
			printAtK(rooTreeNode.childrens.get(k), i-1);
		}
		
	}

	// take input level wise
	
	public static TreeNode<Integer> takeIputLevelwise(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root data :");
		int data = sc.nextInt();
		Queue<TreeNode<Integer>> treeQueue = new LinkedList<TreeNode<Integer>>();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		treeQueue.add(root);
		
		while(!treeQueue.isEmpty()) {
			
			TreeNode<Integer> front = treeQueue.poll();
			System.out.println("Enter number of childrens of " + front.data);
			int numChild = sc.nextInt();
			for(int i=0; i<numChild; i++) {
				System.out.println("Enter the" + (i+1) +"th children of " + front.data);
				int child = sc.nextInt();
				TreeNode<Integer> child1 = new TreeNode<Integer>(child);
				front.childrens.add(child1);
				treeQueue.add(child1);
				
			}
			
		}
		
		return root;
		
		
	}
	
	// take input 
	private static TreeNode<Integer> takeInput(Scanner sc) {

		System.out.println("Enter the root data :");
		int rootData = sc.nextInt();
		if(rootData == -1) {
			return null;
		}
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		System.out.println("Enter number of childrens of " + rootData);
		int children = sc.nextInt();
		for(int i=0; i<children; i++) {
			TreeNode<Integer> child = takeInput(sc);
			root.childrens.add(child);
		}
		return root;
		
	}

	// print tree
	public static void print(TreeNode<Integer> rooTreeNode) {
		if(rooTreeNode == null) {
			return ;
		}
		
		String s = rooTreeNode.data + ":";
		for(int i=0; i<rooTreeNode.childrens.size(); i++) {
			s = s + rooTreeNode.childrens.get(i).data + ",";
		}
		
		System.out.println(s);
		for(int i=0; i<rooTreeNode.childrens.size(); i++) {
			print(rooTreeNode.childrens.get(i));
		}
	}
	
	//number of nodes
	public static int numNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int ans = 1;
		for(int i=0; i< root.childrens.size(); i++) {
			ans += numNodes(root.childrens.get(i));
		}
		return ans;
	}
}
