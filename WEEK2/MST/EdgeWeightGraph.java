
import java.util.LinkedList;
import java.util.Queue;

public class EdgeWeightGraph
{
	private final LinkedList<Edge>[] adj ;
	private final int v;
	private int e;

	public EdgeWeightGraph(int v)
	{
		this.v = v;
		adj = (LinkedList<Edge>[])new LinkedList[v];

		for(int i = 0; i < adj.length; i++)
			adj[i] = new LinkedList<Edge>();
	}

	public void addEdge(Edge e)
	{
		adj[e.either()].add(e);
		adj[e.other(e.either())].add(e);
	}
	public Iterable<Edge> edges()
	{
		Queue<Edge> queue = new LinkedList<Edge>();
		for(int i = 0; i < V(); i++)
			for(Edge e : adj(i))
				queue.add(e);
		return queue;
	}

	public int V()
	{
		return v;
	}

	public int E()
	{
		return e;
	}

	public Iterable<Edge> adj(int v)
	{
		return adj[v];
	}
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < V(); i++)
		{
			str.append(String.format("%d : ",i));
			for(Edge e : adj(i))
			{
				str.append("[");
				str.append(e);
				str.append("]");
			}
			str.append(String.format("\n"));
		}
		return str.toString();
	}

}