
import java.util.Stack;

public class TopologicalSort
{
	public boolean[] marked;
	private Stack<Integer> stack;

	public TopologicalSort(Digraph g)
	{
		marked = new boolean[g.V()];
		stack = new Stack<Integer>();
		for(int i = 0; i < g.V(); i++)
			if(!marked[i])
				dfs(g, i);
	}

	private void dfs(Digraph g, int source)
	{
		marked[source] = true;
		for( int w : g.adj(source))
			if(!marked[w])
				dfs(g, w);
		stack.push(source);

	}

	public Iterable<Integer> reversePost()
	{
		return stack;
	}

}

