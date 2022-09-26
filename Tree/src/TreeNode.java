import java.util.ArrayList;

public class TreeNode<T> {

	T data;
	ArrayList<TreeNode<T>> childrens;
	
	public TreeNode(T data) {
		this.data = data;
		childrens = new ArrayList<>();
	}
}
