import java.util.ArrayList;

public class PrimsLazy{

	ArrayList<Edge> mst;
	PriorityQueue<Edge> pq;
	boolean[] visit;

	public PrimsLazy(EdgeWeightGraph g){
		visit = new boolean[g.V()];
		mst = new ArrayList<Edge>();
		pq = new PriorityQueue<Edge>(g.E());
		visit(g, 0);
		while(!pq.isEmpty() && mst.size()<g.V()-1){
			Edge e = pq.delMax();
			int v = e.either();
			int w = e.other(v);
			if(visit[v]&&visit[w])
				continue;
			mst.add(e);
			if(!visit[v])
				visit(g, v);
			if(!visit[w])
				visit(g, w);
		}

	}

	private void visit(EdgeWeightGraph g, int v){
		visit[v] = true;
		for(Edge e : g.adj(v)){
			if(!visit[e.other(v)])
				pq.insert(e);

		}
	}

	public Iterable<Edge> mst(){
		return mst;
	}
}