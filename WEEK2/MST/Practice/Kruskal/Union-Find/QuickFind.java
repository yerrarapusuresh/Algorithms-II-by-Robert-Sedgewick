
public class QuickFind
{
	int[] array;

	public QuickFind(int size){
		array = new int[size];

		for(int i = 0; i < size; i++)
			array[i] = i;
	}

	public void union(int a, int b){
		if(isConnected(a, b))
			return;
		int toChange = find(b);
		for(int i = 0; i < array.length; i++)
			if(array[i] == toChange)
				array[i] = find(a);

	}

	public boolean isConnected(int a, int b){
		return array[a] == array[b];
	}

	public int find(int a){
		return array[a];
	}


}