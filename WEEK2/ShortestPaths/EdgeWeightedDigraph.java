
import java.util.LinkedList;

public class EdgeWeightedDigraph
{
	private final int v;
	private final LinkedList<DirectedEdge>[] adj;

	public EdgeWeightedDigraph(int v)
	{
		this.v = v;
		adj = (LinkedList<DirectedEdge>[]) new LinkedList[v];

		for(int i = 0; i < adj.length; i++)
			adj[i] = new LinkedList<DirectedEdge>();
	}

	public int V()
	{
		return v;
	}

	public Iterable<DirectedEdge> adj(int v)
	{
		return adj[v];
	}
	public void addEdge(DirectedEdge e)
	{
		adj[e.from()].add(e);
	}
}