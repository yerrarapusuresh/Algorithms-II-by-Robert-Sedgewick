import java.util.LinkedList;

public class EdgeWeightGraph{

	private LinkedList<Edge>[] adj;
	private int v;
	private int e;

	public EdgeWeightGraph(int v){
		this.v = v;
		adj =  (LinkedList<Edge>[]) new LinkedList<?>[v];

		for(int i = 0; i < v; i++)
			adj[i] = new LinkedList<Edge>();
	}

	public Iterable<Edge> adj(int v){
		return adj[v];
	}

	public void addEdge(Edge e){
		int v = e.either();
		int w = e.other();
		adj[v].add(e);
		adj[w].add(e);
		this.e++;
	}

	public int V(){
		return v;
	}

	public int E(){
		return e;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%d\n", v));
		sb.append(String.format("%d\n", e));
		for(int i = 0; i < V(); i++){
			sb.append(String.format("%d : ", i));
			for(Edge e : adj(i))
				sb.append(e);
			sb.append(String.format("\n"));
		}

	return sb.toString();
	}

}
