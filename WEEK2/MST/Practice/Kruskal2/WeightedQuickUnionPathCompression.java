
public class WeightedQuickUnionPathCompression{

	private int[] array;
	private int[] weights;
	private int components;

	public WeightedQuickUnionPathCompression(int N){
		array = new int[N];
		weights = new int[N];
		components = N;
		for(int i = 0; i < N; i++){
			array[i] = i;
			weights[i] = 1;
		}
	}

	private int parent(int p){
		while(p != array[p]){
			array[p] = array[array[p]];
			p = array[p];
		}
		return p;
	}

	public boolean connected(int p, int q){
		return parent(p) == parent(q);
	}

	public void union(int p, int q){
		int rootP = parent(p);
		int rootQ = parent(q);
		if(rootQ == rootP)
			return;
		components--;
		if(weights[rootP] > weights[rootQ]){
			weights[rootP] += weights[rootQ];
			array[rootQ] = rootP;
		}
		else{
			weights[rootQ] +=weights[rootP];
			array[rootP] = rootQ;
		}
	}

	public int components(){
		return components;
	}

}