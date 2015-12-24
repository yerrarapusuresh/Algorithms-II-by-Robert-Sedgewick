
import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstPaths
{
	private boolean[] marked;
	private int[] edgeTo;
	private int source;

	public BreadthFirstPaths(Graph g, int source)
	{
		marked = new boolean[g.V()];
		edgeTo = new int[g.V()];
		this.source = source;
		bfs(g, source);
	}

	private void bfs(Graph g, int source)
	{
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(source);
		marked[source] = true;

		while(queue.size() != 0)
		{
			int v = queue.remove();
			for(int w : g.adj(v))
			{
				if(!marked[w])
				{
					queue.add(w);
					marked[w] = true;
					edgeTo[w] = v;
				}
			}
		}
	}


	public boolean hasPathTo(int v)
	{
		return marked[v];
	}

	public Iterable<Integer> pathTo(int v)
	{
		if(!marked[v])
			return null;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int x = v ; x != source ; x = edgeTo[x])
			list.add(x);
		list.add(source);
		return list;

	}
}