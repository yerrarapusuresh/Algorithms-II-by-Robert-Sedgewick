
public class PriorityQueue{

	private int size;
	private Edge[] item; 
	private int count;

	public PriorityQueue(int size){
		item = new Edge[size+1];
		this.size = size;
		this.count = 0;
	}

	public void insert(Edge i){
		item[++count] = i;
		swim(count);
	}

	public Edge delMin(){
		Edge temp = item[1];
		swap(1, count--);
		item[count+1] = null;
		sink(1);
		return temp;
	}

	public boolean isEmpty(){
		return count == 0;
	}

	private void sink(int k){
		while(k*2 <= count){
			int j = k * 2;
			if(j < count && less(j+1, j))
				j++;
			if(!less(j, k))
				break;
			swap(k, j);
			k = j;

		}
	}

	private boolean less(int a, int b){
		return item[a].compareTo(item[b]) < 0;
	}

	private void swim(int k){
		while(k > 1 && less(k, k/2)){
			swap(k/2, k);
			k = k/2;
		}

	}

	private void swap(int a, int b){
		Edge temp = item[a];
		item[a] = item[b];
		item[b] = temp;
	}

		

}