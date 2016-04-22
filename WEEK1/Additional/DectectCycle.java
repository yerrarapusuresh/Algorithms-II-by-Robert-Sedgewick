
public class DectectCycle{

	private boolean[] visited;
	private boolean isCycle;

	public DectectCycle(Graph g){
		visited = new boolean[g.V()];
		isCycle = false;
		for(int i = 0; i < g.V(); i++)
			if(!visited[i])
				dfs(g, i, i);

	}

	private void dfs(Graph g, int source, int parent){
		visited[source] = true;
		for(int v : g.adj(source))
			if(!visited[v])
				dfs(g, v, source);
			else if(v != parent)
				isCycle = true;

	}

	public boolean isCycle(){
		return isCycle;
	}

}