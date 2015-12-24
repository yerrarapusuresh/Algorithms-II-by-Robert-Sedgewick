

public class Digraph
{
	private final int vertices;
	private int edges;
	private final Bag<Integer>[] adj;

	public Digraph(int N)
	{
		this.vertices = N;
		adj = (Bag<Integer>[])new Bag[N];
		for(int i = 0 ; i < adj.length; i++)
			adj[i]  = new Bag<Integer>();
	}

	public void addEdge(int v, int w)
	{
		adj[v].add(w);
	}

	public Iterable<Integer> adj(int v)
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

	public Digraph reverse()
	{
		return null;
	}
	public String toString()
	{
		StringBuilder str = new StringBuilder();

		for(int i = 0; i < vertices; i++)
		{
			str.append(String.format("%d : ",i));
			for(int w : adj(i))
				str.append(String.format("%2d",w));
			str.append(String.format("\n"));
		}

		return str.toString();
	}
}













