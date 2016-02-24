import java.util.LinkedList;

public class KruskalMST{

	LinkedList<Edge> queue ;
	MinPQ<Edge> pq;
	WeightedQuickUnion uf;
	public KruskalMST(EdgeWeightedGraph graph){
		queue = new LinkedList<Edge>();
		pq = new MinPQ<Edge>(graph.E()*2);
		uf = new WeightedQuickUnion(graph.E());


		for(int i = 0; i < graph.V(); i++)
			for(Edge e : graph.adj(i))
				pq.insert(e);


		while(!pq.isEmpty() &&(queue.size() < graph.V() - 1)){

			Edge edge = pq.delMin();
			int v = edge.either();
			int w = edge.other(v);
			if(!uf.isConnected(v, w))
			{
				queue.add(edge);
				uf.union(v, w);
			}

		}



		
	}

	public Iterable<Edge> mst()
	{
		return queue;
	}
}