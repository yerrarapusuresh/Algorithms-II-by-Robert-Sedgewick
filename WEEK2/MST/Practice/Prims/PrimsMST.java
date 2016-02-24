import java.util.LinkedList;

public class PrimsMST
{
	MinPQ<Edge> pq;
	boolean[] visited;
	LinkedList<Edge> queue;

	public PrimsMST(EdgeWeightedGraph g)
	{
		pq = new MinPQ<Edge>(g.V());
		visited = new boolean[g.V()];
		queue = new LinkedList<Edge>();
		visit(g, 0);

		while(!pq.isEmpty() )
		{
			Edge edge = pq.delMin();
			int e = edge.either();
			int o = edge.other(e);
			if(visited[e] && visited[o])
				continue;
			queue.add(edge);
			if(!visited[e]) visit(g, e);

			 if(!visited[o]) visit(g, o);
		}
	}

	private void visit(EdgeWeightedGraph g, int source)
	{
		visited[source] = true;
		for(Edge e : g.adj(source))
			if(!visited[e.other(source)])
			pq.insert(e);
	}

	public Iterable<Edge> mst()
	{
		return queue;
	}


}