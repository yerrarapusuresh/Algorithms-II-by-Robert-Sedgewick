public class Graph
{
	Bag<Integer>[] adj;
	private final int vertices;
	private int edges;

	public Graph(int n)
	{
		adj = (Bag<Integer>[])new Bag[n];
		this.vertices = n;
		for(int i = 0; i < n; i++)
			adj[i] = new Bag<Integer>();
	} 

	public void addEdge(int v, int w)
	{
		adj[v].add(w);
		adj[w].add(v);
		edges++;
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
		return 0;
	}
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < vertices; i++)
		{
			s.append(String.format("%d : ",i));
			for(int w : adj[i])
				s.append(String.format("%2d",w));
			s.append("\n");
		}
		return s.toString();
	}
	public static int degree(Graph g, int v)
	{
		int degree = 0;
		for(int w : g.adj(v))
				degree++;
		return degree;
	}
	public static int maxDegree(Graph g)
	{
		int max = 0;
		for(int i = 0; i < g.V(); i++)
			if(degree(g, i) > max)
				max = degree(g, i);
		return max;
	}

	public static double averageDegree(Graph g)
	{
		return 2.0 * g.E() / g.V();
	}
	public static int numberOfSelfLoops(Graph g)
	{
		int count = 0;
		for(int i = 0; i < g.V(); i++)
			for(int w : g.adj(i))
				if(w == i)
					count++;
		return count / 2;

	}

}





