import java.util.Scanner;

public class ClientKruskalMST
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		EdgeWeightedGraph graph = new EdgeWeightedGraph(in.nextInt());
		int edges = in.nextInt();

		while(edges-- != 0)
			graph.addEdge(new Edge(in.nextInt(), in.nextInt(), in.nextDouble()));
		KruskalMST mst = new KruskalMST(graph);
		for(Edge e : mst.mst())
			System.out.println(e);

	}
}