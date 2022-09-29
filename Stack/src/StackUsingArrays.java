
public class StackUsingArrays {

	private int data[];
	private int top;
	
	public StackUsingArrays() {
		data = new int[10];
		top = -1;
	}
	
	public StackUsingArrays(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return top + 1; 
	}
	
	public int top() throws StackEmptyException {
		if(size() == 0) {
			//StackEmptyException
			StackEmptyException emptyException  = new StackEmptyException();
			throw emptyException;
		}
		return data[top];
	}
	
	public void push(int elem) throws FullStackException {
		if(size() == data.length) {
			//fullStackException
//			FullStackException e = new FullStackException();
//				throw e;
			
			doubleCapacity();
		}
		top++;
		data[top] = elem;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i=0; i <= top; i++) {
			data[i] = temp[i];
		}
	}

	public int pop() throws StackEmptyException {
		if(size() == 0) {
			//StackEmptyException
			StackEmptyException emptyException  = new StackEmptyException();
			throw emptyException;
		}
		int temp = data[top];
		top--;
		return temp;
	}
	
	
}
