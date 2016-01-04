import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


public class DepthFirstSearch
{
	private boolean[] visited;
	private int[] pathTo;
	private int source;

	public DepthFirstSearch(Digraph dg, int source)
	{
		visited = new boolean[dg.V()];
		pathTo = new int[dg.V()];
		this.source = source;
		dfs(dg, source);
	}


	private void dfs(Digraph dg, int source)
	{
		visited[source] = true;
		for(int v : dg.adj(source))
			if(!visited[v])
			{
				dfs(dg,v);
				pathTo[v] = source;
			}
	}

	public boolean hasPath(int v)
	{
		return visited[v];
	}

	public Iterable<Integer> pathTo(int v)
	{
		if(!visited[v])
			return null;
		List<Integer> stack = new ArrayList<Integer>();
		for(int i = v; i != source; i = pathTo[i] )
			stack.add(i);
		stack.add(source);
		return stack ;
	}


}