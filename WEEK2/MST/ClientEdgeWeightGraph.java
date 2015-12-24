import java.util.Scanner;

public class ClientEdgeWeightGraph
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		EdgeWeightGraph g = new EdgeWeightGraph(input.nextInt());
		while(input.hasNext())
		{
			g.addEdge((new Edge(input.nextInt(),input.nextInt(), input.nextDouble())));
		}
		//System.out.println(g.toString());
		//for(Edge e : g.edges())
		//	System.out.println(e);
		KruskalMST mst = new KruskalMST(g);
		for(Edge e : mst.edges())
			System.out.println(e);
		System.out.println(mst.weight());

	}
}