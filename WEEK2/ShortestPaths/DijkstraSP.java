
public class DijkstraSP{

	private DirectedEdge[] edgeTo;
	private double[] distTo;
	IndexMinPQ pq;

	public DijkstraSP(EdgeWeightDigraph grpah, int source){

		edgeTo = new DirectedEdge[grpah.V()];
		distTo = new double[grpah.V()];
		pq = new IndexMinPQ(grpah.V());

		for(int i = 0; i < grpah.V(); i++)
			distTo[i] = Double.POSITIVE_INFINITY;

		distTo[source] = 0.0;
		pq.insert(source, 0.0);

		while(! pq.isEmpty()){
			int v = pq.delMin();

			for(DirectedEdge e : grpah.adj(v))
				relax(e);

		}
	}

	private void relax(DirectedEdge e){

		int v = e.from();
		int w = e.to();
		if(distTo[w] > distTo[v]+e.weight()){
			distTo[w] = distTo[v]+e.weight();
			edgeTo[w] = e;
			if(pq.contains(w))
				pq.decreaseKey(w, distTo[w]);
			else
				pq.insert(w, distTo[w]);
		}
	}

	public double[] distance(){
		return distTo;
	}
}