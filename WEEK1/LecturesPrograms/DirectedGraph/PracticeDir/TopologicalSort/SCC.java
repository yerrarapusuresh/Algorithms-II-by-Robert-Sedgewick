

public class SCC
{
	boolean[] visited;
	int[] component;
	int count;

	public SCC(Digraph dg)
	{
		visited = new boolean[dg.V()];
		component = new int[dg.V()];
		count = 0;
		TopologicalSort tps = new TopologicalSort(dg.reverse());
		for(int v : tps.reversePostOrder())
		{
			System.out.print(String.format("%d ",v));
			if(!visited[v])
			{
				dfs(dg, v);
				count++;

			}

		}
	}

	private void dfs(Digraph dg, int source)
	{
		visited[source] = true;
		component[source] = count;
		for(int v : dg.adj(source))
			if(!visited[v])
				dfs(dg, v);
	}


	public boolean isSCC(int v, int w)
	{
		System.out.println();
		for(int i = 0; i < component.length; i++)
			System.out.print(component[i]);
		System.out.println();
		return component[v] == component[w];
	}
}














