import java.util.ArrayList;
import java.util.LinkedList;

public class EdgeWeightGraph{

	private final int V;
	private int E;
	private ArrayList<Edge> edges;
	private LinkedList<Edge>[] adj;

	public EdgeWeightGraph(int vertices){
		this.V = vertices;
		this.E = 0;
		edges = new ArrayList<Edge>();
		adj = (LinkedList<Edge>[]) new LinkedList[vertices];
		for(int i = 0; i < V; i++)
			adj[i] = new LinkedList<Edge>();
	}

	public void addEdge(Edge e){
		edges.add(e);
		int v = e.either();
		int w = e.other();
		adj[v].add(e);
		adj[w].add(e);
		E++;
	}
	public Iterable<Edge> adj(int v){
		return adj[v];
	}

	public Iterable<Edge> edges(){
		return edges;
	}
	public int V(){
		return V;
	}
	public int E(){
		return E;
	}

	public String toString(){

		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%d \n%d\n",V,E));
		for(int i = 0; i < V; i++){
			sb.append(String.format("%d : ", i));
			for(Edge e : adj(i))
				sb.append(e.toString());
			sb.append(String.format("\n"));
		}
		return sb.toString();
	}
}