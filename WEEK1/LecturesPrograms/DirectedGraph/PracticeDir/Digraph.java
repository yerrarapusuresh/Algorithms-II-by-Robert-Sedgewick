import java.util.LinkedList;

public class Digraph
{
	private final int vertices;
	private int edges;
	LinkedList<Integer>[] adj;

	public Digraph(int n)
	{
		adj = (LinkedList<Integer>[]) new LinkedList<?>[n];
		vertices = n;

		for(int i = 0; i < n; i++)
			adj[i] = new LinkedList<Integer>();
	}

	public void addEdge(int v, int w)
	{
		adj[v].add(w);
		edges++;
	}

	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}

	public Digraph reverse()
	{
		Digraph rev = new Digraph(vertices);

		for(int i = 0; i < vertices; i++)
		{
			for(int v : adj[i])
				rev.addEdge(v, i);
		}
		return rev;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%d  ",  vertices));
		sb.append(String.format("%d\n", edges));
		for(int i = 0; i < vertices; i++)
		{
			sb.append(String.format("%d : ", i));
			for(int v : adj[i])
				sb.append(String.format("%d ", v));
			sb.append(String.format("\n"));
		}
		return sb.toString();
	}

	public int V()
	{
		return vertices;
	}

	public int E()
	{
		return edges;
	}
}