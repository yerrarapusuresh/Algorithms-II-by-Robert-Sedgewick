import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstSearch
{
	private boolean[] marked;
	private int[] dist;
	private int source;
	public  BreadthFirstSearch(Digraph g, int source)
	{
		marked = new boolean[g.V()];
		dist = new int[g.V()];
		this.source = source;
		bfs(g, source);
		System.out.println("suresh");
	}

	private void bfs(Digraph g, int source)
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		marked[source] = true;
		queue.add(source);
		dist[source] = 0;
		int i = 1;
		while(queue.peek() != null)
		{
			int v = queue.remove();
			for(int w : g.adj(v))
			{
				if(!marked[w])
				{
					marked[w] = true;
					queue.add(w);
					dist[w] = i;
				}
			}
			i++;
		}
	}

	public boolean hasPathTo(int v)
	{
		return marked[v];
	}

	public int distance(int v)
	{
		
		return dist[v];
	}
}

