import java.util.Stack;
public class SCC
{
	private boolean[] visited;
	private int[] id;
	private int count;

	public SCC(Digraph g)
	{
		visited = new boolean[g.V()];
		id = new int[g.V()];
		DepthFirstOrder df = new DepthFirstOrder(g.reverse());
		Stack<Integer> stack = df.reversePostOrder();
		while(!stack.empty())
		{
			int v = stack.pop();
			if(!visited[v])
			{
				dfs(g, v);
				count++;
			}
		}

	}

	private void dfs(Digraph g, int v)
	{	
		visited[v] = true;
		id[v] = count;
		for(int w : g.adj(v))
			if(!visited[w])
				dfs(g, w);

	}

	public void isSCC(int v, int w)
	{
		System.out.println();
		for(int i = 0; i < id.length; i++)
			System.out.print(id[i]);
		System.out.println();
	}

}