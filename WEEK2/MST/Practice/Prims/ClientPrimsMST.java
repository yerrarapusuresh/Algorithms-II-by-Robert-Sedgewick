import java.util.Scanner;

public class ClientPrimsMST
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		EdgeWeightedGraph g = new EdgeWeightedGraph(in.nextInt());
		int edges = in.nextInt();
		while(edges-- != 0)
			g.addEdge(new Edge(in.nextInt(), in.nextInt(), in.nextDouble()));
		System.out.println(g);
		for(Edge e : (new PrimsMST(g)).mst())
			System.out.println(e);
			
	/*	MinPQ<Edge> pq = new MinPQ<Edge>(g.E()*2);
		System.out.println(g.E());
		for(Edge e : g.edges())
			pq.insert(e);
		int i = 0;
		while(!pq.isEmpty())
		{
			if(i++ % 2 == 0)
			System.out.println(pq.delMin());
			else
			pq.delMin();
		}*/
	}
}