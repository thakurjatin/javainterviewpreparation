package initial;

public class QueueUsingLL<T> {

	 // Rear Insertion and front deletion
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		
		front = null;
		rear = null;
		size = 0;
	}
	
	// size, isempty, front, enqueue, dequeue
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	T front() throws QueueEmptyException {
		if(size() == 0) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	void enqueue(T element) {
		
		Node<T> newNode = new Node<T>(element);
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}else {
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
