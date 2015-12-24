
public class CCDirected
{
	private boolean[] marked;
	private int[] componentNumber;
	private int components;

	public CCDirected(Digraph g)
	{
		marked = new boolean[g.V()];
		componentNumber = new int[g.V()];
		components = 0;
		for(int i = 0; i < g.V(); i++)
		{
			if(!marked[i])
			{
				dfs(g, i);
				components++;
			}
		}
	}

	private void dfs(Digraph g, int source)
	{
		marked[source] = true;
		componentNumber[source] = components;
		for(int w : g.adj(source))
		{
			if(!marked[w])
				dfs(g, w);
		}
	}

	public boolean sameComponents(int v, int w)
	{
		return componentNumber[v] == componentNumber[w];
	}
	public int components()
	{
		return components;
	}
}