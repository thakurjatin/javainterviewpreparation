
public class StackUse {

	public static void main(String[] args) throws FullStackException {

		StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
		
		
//		StackUsingArrays stack = new StackUsingArrays(3);
		for(int i=1; i<=5; i++) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// Never reached here	
			}
		}
		
	}

}
