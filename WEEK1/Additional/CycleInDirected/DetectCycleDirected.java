import java.util.Stack;

public class DetectCycleDirected{

	private boolean[] visited;
	private boolean[] onStack;
	private Stack<Integer> stack;
	private int[] edgeTo;
	private boolean isCycle;

	public DetectCycleDirected(DirectedGraph g){
		
		visited = new boolean[g.V()];
		onStack = new boolean[g.V()];
		edgeTo = new int[g.V()];
		stack = new Stack<Integer>();
		for(int i = 0; i < g.V(); i++)
			if(!visited[i])
				dfs(g, i);

	}

	private void dfs(DirectedGraph g, int source)
	{
		visited[source] = true;
		onStack[source] = true;
		for(int v : g.adj(source))
			if(isCycle)
				return;
			else if(!visited[v]){
				edgeTo[v] = source;
				dfs(g, v);
			}
			else if(onStack[v]){
				isCycle = true;
				stack.push(v);
				for(int i = source; i != v; i = edgeTo[i])
					stack.push(i);
				stack.push(v);
			}
			onStack[source] = false;
	}

	public boolean isCycle(){
		return isCycle;
	}

	public Iterable<Integer> cycle(){
		return stack;
	}
}