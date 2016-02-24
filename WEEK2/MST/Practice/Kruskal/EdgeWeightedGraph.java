import java.util.LinkedList;

public class EdgeWeightedGraph
{
	private final int vertices;
	LinkedList<Edge>[] adj;
	private int edges;

	public EdgeWeightedGraph(int vertices)
	{
		this.vertices = vertices;
		adj = (LinkedList<Edge>[]) new LinkedList[vertices];

		for(int v = 0; v < vertices; v++)
			adj[v] = new LinkedList<Edge>();
	}

	public void addEdge(Edge edge)
	{
		adj[edge.either()].add(edge);
		adj[edge.other(edge.either())].add(edge);
		edges++;
	}

	public Iterable<Edge> adj(int v)
	{
		return adj[v];
	}

	public int V()
	{
		return vertices;
	}

	public int E()
	{
		return edges;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%d\n",vertices));
		sb.append(String.format("%d\n",edges));
		for(int i = 0; i < vertices; i++)
		{
			sb.append(String.format("%d :",i));
			for(Edge v : adj[i])
				sb.append(v);
			sb.append(String.format("\n"));
		}
		return sb.toString();
	}

}











