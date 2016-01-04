import java.util.Stack;
import java.util.List;
import java.util.LinkedList;

public class DepthFirstOrder
{
	boolean[] visited;
	Stack<Integer> stack;

	public DepthFirstOrder(Digraph g)
	{
		visited = new boolean[g.V()];
		stack = new Stack<Integer>();

		for(int i = 0; i < g.V(); i++)
		{
			if(!visited[i])
				dfs(g, i);
		}
	}

	private void dfs(Digraph g, int source)
	{
		visited[source] = true;
		for(int w : g.adj(source))
			if(!visited[w])
				dfs(g, w);
		stack.push(source);
			
	}

	public  Stack<Integer> reversePostOrder()
	{
		//return stack;

		return stack;
	}
}