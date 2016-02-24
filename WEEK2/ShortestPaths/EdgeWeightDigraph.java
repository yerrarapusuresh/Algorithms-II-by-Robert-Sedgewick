import java.util.LinkedList;


public class EdgeWeightDigraph{

	private final int v;
	private LinkedList<DirectedEdge>[] adj;
	private  int e;

	public EdgeWeightDigraph(int v){

		this.v = v;
		this.e = 0;
		adj =  (LinkedList<DirectedEdge>[])  new LinkedList<?>[v];

		for(int i = 0; i < v; i++)
			adj[i] = new LinkedList<DirectedEdge>();
	}

	public int V(){
		return v;
	}

	public int E(){
		return e;
	}
	public void addEdge(DirectedEdge e){
		adj[e.from()].add(e);
		this.e++;
	}

	public Iterable<DirectedEdge> adj(int i){
		return adj[i];
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%d\n", v));
		sb.append(String.format("%d\n", e));
		for(int i = 0; i < v; i++){
			sb.append(String.format("%d : ", i));
			for(DirectedEdge e : adj[i])
				sb.append(e);
			sb.append(String.format("\n"));
		}
		return sb.toString();
	}


}










