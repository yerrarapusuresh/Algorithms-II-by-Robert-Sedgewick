import java.util.Scanner;

public class ClientEdgeWeightDigraph{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- != 0){

			EdgeWeightDigraph graph = new EdgeWeightDigraph(in.nextInt());
			int e = in.nextInt();

			while(e-- != 0){
				int v = in.nextInt()-1;
				int w = in.nextInt()-1;
				double d = in.nextDouble();
				graph.addEdge(new DirectedEdge(v, w, d));
				graph.addEdge(new DirectedEdge(w, v, d));
			}
			int source = in.nextInt()-1;
			DijkstraSP sp = new DijkstraSP(graph, source);
			double[] d = sp.distance();
			for(int i = 0; i < d.length; i++)
				if(i != source)
					System.out.print((int)d[i]+" ");
		}
	}
}