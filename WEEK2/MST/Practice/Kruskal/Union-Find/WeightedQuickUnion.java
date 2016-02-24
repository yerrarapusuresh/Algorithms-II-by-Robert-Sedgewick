
public class WeightedQuickUnion
{
	int[] array;
	int[] weight;

	public WeightedQuickUnion(int size){
		array = new int[size];
		weight = new int[size];

		for(int i = 0; i < size; i++)
		{
			array[i] = i;
			weight[i] = 1;
		}
	}

	public void union(int a, int b)
	{
		if(isConnected(a, b))
			return;
		if(weight[find(a)] > weight[find(b)])
		{
			weight[a] += weight[b];
			array[find(b)] = find(a);
		}
		else
		{
			weight[find(b)] += weight[find(a)];
			array[find(a)] = find(b);
		}
	}

	public boolean isConnected(int a, int b){
		return find(a) == find(b);
	}

	public int find(int a)
	{
		while(a != array[a])
			a = array[array[a]];
		return a;
	}

}













