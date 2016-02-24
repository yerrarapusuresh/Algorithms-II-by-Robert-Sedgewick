
public class QuickUnion
{
	int[] array;

	public QuickUnion(int size)
	{
		array = new int[size];

		for(int i = 0; i < size; i++)
			array[i] = i;
	}

	public void union(int a, int b)
	{
		if(isConnected(a, b))
			return;
		array[find(b)] = array[find(a)];

	}

	public boolean isConnected(int a, int b)
	{
		return find(a) == find(b);
	}

	public int find(int a){
		while(a != array[a])
			a = array[a];
		return a;
	}
}