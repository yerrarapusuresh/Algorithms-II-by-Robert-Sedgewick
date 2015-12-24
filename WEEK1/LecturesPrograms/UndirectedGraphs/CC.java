

public class CC
{
	private boolean[] marked;
	private int[] components;
	private int comCount;

	public CC(Graph g)
	{
		marked = new boolean[g.V()];
		components = new int[g.V()];
		int count = 0;
		for(int i = 0; i < g.V(); i++)
		{
			if(!marked[i])
			{
				dfs(g, i, count);
				count++;
			}
		}
		this.comCount = count;
	}

	private void dfs(Graph g, int source, int component)
	{
		marked[source] = true;
		components[source] = component;
		for(int w : g.adj(source))
			if(!marked[w])
				dfs(g, w, component);
	}

	public int components()
	{
		return comCount;
	}

	public boolean sameComponent(int v, int w)
	{
		for(int i = 0; i < components.length; i++)
			System.out.println(components[i]);
		return components[v] == components[w];

	}

}