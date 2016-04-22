import java.util.LinkedList;


public class DirectedGraph{

	private int V;
	private int E;
	LinkedList<Integer>[] adj;
	private String toString;

	public DirectedGraph(int V){
		this.V = V;
		adj = (LinkedList<Integer>[]) new LinkedList[V];

		for(int i = 0; i < V; i++)
			adj[i] = new LinkedList<Integer>();
	}

	public void addEdge(int v, int w){
		adj[v].add(w);

		E++;
	}

	public Iterable<Integer> adj(int v){
		return adj[v];
	}
	public int V(){
		return this.V;
	}
	public int E(){
		return this.E;
	}
	public String toString(){
		if(toString != null)
			return toString;
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%d \n ", V));
		sb.append(String.format("%d\n", E));
		for(int i = 0; i < V; i++){
			sb.append(String.format("%d : ", i));
			for(int j : adj[i])
				sb.append(String.format("%d ",j));
			sb.append(String.format("\n"));
		}
		toString = sb.toString();
		return toString;
	}
		

}