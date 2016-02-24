import java.util.Scanner;

public class ClientEdgeWeightedGraph
{
	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		EdgeWeightedGraph ewg = new EdgeWeightedGraph(in.nextInt());
		int edges = in.nextInt();

		while(edges-- != 0)
			ewg.addEdge(new Edge(in.nextInt(), in.nextInt(), in.nextInt()));

		System.out.println(ewg);
	}
}
