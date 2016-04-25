import java.util.ArrayList;

public class Kruskal{
	ArrayList<Edge> list;
	PriorityQueue<Edge> pq;
	WeightedQuickUnionPathCompression uf;

	public Kruskal(EdgeWeightGraph g){
		list = new ArrayList<Edge>();
		pq = new PriorityQueue<Edge>(g.E());
		uf = new WeightedQuickUnionPathCompression(g.V());
		for(Edge e : g.edges())
			pq.insert(e);
		while(list.size() < g.V()-1 && !pq.isEmpty()){
			Edge e = pq.delMax();
			int v = e.either();
			int w = e.other();
			if(!uf.connected(v, w))
			{
				list.add(e);
				uf.union(v, w);
			}
		}
	}

	public Iterable<Edge> mst(){
		return list;
	}
}