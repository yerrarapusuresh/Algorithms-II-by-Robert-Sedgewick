
public class PriorityQueue< Key extends Comparable<Key>>{

	private Key[] keys;
	private int size;

	public PriorityQueue(int N){
		keys = (Key[]) new Comparable[N+1];
		this.size = 0;
	}

	public void insert(Key k){
		keys[++size] = k;
		swim(size);
	}

	public Key delMax(){
		Key temp = keys[1];
		swap(1, size--);
		sink(1);
		keys[size+1] = null;
		return temp;

	}


	public boolean isEmpty(){
		return size == 0;
	}

	private void sink(int k){
		while(k*2 <= size){
			int j = k * 2; 
			if(j < size && less(j+1, j))
				j++;
			if(less(k, j))
				break;
			swap(j, k);
			k = j;
		}
	}

	private void swim(int k){
		while(k != 1 && less(k, k/2))
		{
			swap(k/2, k);
			k = k/2;
		}
	}

	private boolean less(int a, int b){
		return keys[a].compareTo(keys[b]) < 0;
	}

	private void swap(int a, int b){
		Key temp = keys[a];
		keys[a] = keys[b];
		keys[b] = temp;
	}
}