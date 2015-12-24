import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class KruskalMST
{
	LinkedList<Edge> queue = new LinkedList<Edge>();
	private double weight;
	public KruskalMST(EdgeWeightGraph g)
	{
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		for(Edge e : g.edges())
			pq.add(e);
		UF uf = new UF(g.V());

		while(pq.size ()!= 0 && queue.size() < g.V() -1)
		{
				Edge e = pq.poll();
				int v = e.either(); int w = e.other(v);
				if(!uf.connected(v, w))
				{
					uf.union(v, w);
					queue.add(e);
					weight += e.weight();
				}

		}
	}

	public Iterable<Edge> edges()
	{
		return queue;
	}

	public double weight()
	{
		return this.weight;
	}
}