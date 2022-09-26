
public class QueueUsingLL<T> {

	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	T front() throws QueneEmptyException {
		if(size() == 0) {
			throw new QueneEmptyException();
		}
		return front.data;
	}
	
	void enqueue(T element) {
		Node<T> newNode = new Node<>(element);
		if(rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
	
	T dequeue() throws QueneEmptyException {
		if(size() == 0) {
			throw new QueneEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(size == 1) {
			rear = null;
		}
		
		size--;
		return temp;
	}
	
	
}
