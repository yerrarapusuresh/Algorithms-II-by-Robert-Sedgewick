

public class MinPQ<Key extends Comparable<Key>>
{
	private Key[] keys;
	private int size;

	public MinPQ(int capacity)
	{
		keys = (Key[])new Comparable[capacity+1];
		size = 0;
	}

	public void insert(Key k)
	{
		keys[++size] = k;
		swim(size);
	}

	private void swim(int k)
	{
		while((k/2 > 0) && less(k, k/2)) 
		{
			swap(k, k/2);
			k = k/2;
		}
	}

	private boolean less(int a, int b)
	{
		return  keys[a].compareTo(keys[b]) < 0;
	}

	private void swap(int a, int b)
	{
		Key temp = keys[a];
		keys[a] = keys[b];
		keys[b] = temp;
	}

	public Key delMin()
	{
		Key temp = keys[1];
		swap(size, 1);
		
		keys[size--] = null;
		sink(1);
		return temp;
	}

	private void sink(int k)
	{
		while((k*2) <= size)
		{
			int j = k * 2;
			if(j < size && less(j+1, j))
				j++;
			if(less(k, j))
				break;
			swap(k, j);
			k = j;

		}
	}

	public boolean isEmpty()
	{
		return size == 0;
	}

}