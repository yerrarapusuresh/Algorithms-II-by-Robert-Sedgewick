
import java.util.Stack;

public class DeapthFirstPaths
{
	private boolean[] marked;
	private int[] edgeTo;
	private int source;
	public DeapthFirstPaths(Digraph g, int source)
	{
		marked = new boolean[g.V()];
		edgeTo = new int[g.V()];
		this.source = source;
		dfs(g, source);
	}

	private void dfs(Digraph g, int source)
	{
		marked[source] = true;
		for(int w : g.adj(source))
		{
			if(!marked[w])
			{
				dfs(g, w);
				edgeTo[w] = source;
			}
		}
	}

	public boolean hasPathTo(int v)
	{
		return marked[v];
	}

	public Iterable<Integer> pathTo(int v)
	{
		if(!hasPathTo(v))
			return null;
		Stack<Integer> stack = new Stack<Integer>();
		for(int x = v; x != source ; x = edgeTo[x])
			stack.push(x);
		stack.push(source);
		return stack;
	}

}