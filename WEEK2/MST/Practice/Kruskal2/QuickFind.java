
public class QuickFind{
	
	private int[] array;
	private int components;


	public QuickFind(int N){
		array = new int[N];
		this.components = N;

		for(int i = 0; i < N; i++)
			array[i] = i;
	}

	public boolean connected(int p, int q){
		return array[p] == array[q];
	}

	public void union(int p, int q){
		if(connected(p, q))
			return;
		components--;
		int parent = array[p];
		int toChange = array[q];
		for(int i = 0; i < array.length; i++)
			if(array[i] == toChange)
				array[i] = parent;
	}

	public int components(){
		return components;
	}

}