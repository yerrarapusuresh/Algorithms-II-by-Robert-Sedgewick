import java.util.ArrayList;

public class PrimsLazy{

	private boolean[] visit;
	private PriorityQueue pq;
	private ArrayList<Edge> mst;

	public PrimsLazy(EdgeWeightGraph graph){

		visit = new boolean[graph.V()];
		pq = new PriorityQueue(graph.E()*2);
		mst = new ArrayList<Edge>();
	

		visited(graph, 0);
		while(!pq.isEmpty() && mst.size() < graph.V()-1){

			Edge e = pq.delMin();
			int v = e.other(); int w = e.either();
			if(visit[v] && visit[w])
				continue;
			mst.add(e);
			if(!visit[v])
				visited(graph, v);
			if(!visit[w])
				visited(graph, w);
		}
	}


	private void visited(EdgeWeightGraph graph, int v){
		visit[v] = true;
		for(Edge e : graph.adj(v)){
			if(!visit[e.other()]||!visit[e.either()])
				pq.insert(e);
		}

	}

	public Iterable<Edge> mst(){
		return mst;
	}
		

}