import java.util.Queue;
import java.util.LinkedList;
public class BreadthFirstSearch
{
	private boolean[] visited;
	private int[] dist;
	private int[] paths;
	private boolean[] hasPath;
	private int source;
	public BreadthFirstSearch(Digraph g, int source)
	{
		visited = new boolean[g.V()];
		dist = new int[g.V()];
		paths = new int[g.V()];
		hasPath = new boolean[g.V()];
		this.source = source;
		bfs(g, source);
	}

	private void bfs(Digraph g, int source)
	{
		visited[source] = true;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(source);
		dist[source] = 0;
		Integer i;
		while((i = queue.poll()) != null)
		{
			for(int v : g.adj(i))
			{
				if(!visited[v])
				{
					queue.add(v);
					visited[v] = true;
					paths[v] = i;
					dist[v] = dist[i] + 1;
				}
			}
		}

	}

	public int distance(int v)
	{
		System.out.println();
		for(int i = 0; i < dist.length; i++)
			System.out.print(i+"-"+dist[i]+" ");
		System.out.println();

		if(visited[v])
			return dist[v];
		return 0;
	}

	public boolean isConnected(int v)
	{
		return visited[v];
	}
}






