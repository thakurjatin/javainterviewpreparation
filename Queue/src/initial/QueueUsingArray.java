package initial;

public class QueueUsingArray {

	// Rear Insertion and from front deletion
	private int data[];
	private int front; //index at which front element is stored
	private int rear; // index at which rear element is stored
	private int size;
	
	public QueueUsingArray() {
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public QueueUsingArray(int Capacity) {
		data = new int[Capacity];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	int front() throws QueneEmptyException {

		if(size == 0) {
			throw new QueneEmptyException();
		}
		return data[front];
	}
	
	void enqueue(int element) throws QueueFullException {
		
		if(size() == data.length) {
//			throw new QueueFullException();
			doubleCapacity();
		}
		
		if(size() == 0) {
			front = 0;
		}
		size++;
		rear++;
		if(rear == data.length) {
			rear = 0;
		}
		data[rear] = element;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		int index = 0;
		for(int i = front; i<temp.length; i++) {
			data[index] = temp[i];
			index++;
		}
		for(int i=0; i<= front -1 ; i++) {
			data[index] = temp[i];
			index++;
		}
		front = 0;
		rear = temp.length - 1;
	}

	int dequeue() throws QueneEmptyException {
		
		if(size() == 0) {
			throw new QueneEmptyException();
		}
		
		int temp = data[front];
		front++;
		if(front == data.length) {
			front = 0;
		}
		size--;
		if(size() == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}
}
