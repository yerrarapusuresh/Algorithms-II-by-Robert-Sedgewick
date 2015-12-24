
import java.util.LinkedList;

public class Digraph
{
	private LinkedList<Integer>[] adj ;
	private final int vertices;

	public Digraph(int N)
	{
		vertices = N;
		adj = (LinkedList<Integer>[])new LinkedList[N];
		
		for(int i = 0; i < N; i++)
			adj[i] = new LinkedList<Integer>();
	}

	public void addEdge(int v, int w)
	{
		adj[v].add(w);

	}

	public Digraph reverse()
	{
		Digraph reverse = new Digraph(V());
		for(int i = 0; i < adj.length; i++)
		{
			for(int w : adj[i])
				reverse.addEdge(w, i);
		}

		return reverse;

	}
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < vertices; i++)
		{
			str.append(String.format(i+" : "));
			for(int w : adj(i))
			{
				str.append(String.format("%2d",w));
				
			}
			str.append(String.format("\n"));

		}
		return str.toString();
	}
	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}

	public int V()
	{
		return vertices;
	}
}