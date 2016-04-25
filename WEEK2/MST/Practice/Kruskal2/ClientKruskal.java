
import java.util.Scanner;

public class ClientKruskal{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		EdgeWeightGraph g = new EdgeWeightGraph(in.nextInt());
		int edges = in.nextInt();
		while(edges-- != 0)
			g.addEdge(new Edge(in.nextInt(), in.nextInt(), in.nextDouble()));
		//System.out.println(g);
		for(Edge e : (new Kruskal(g)).mst())
			System.out.println(e);
	}
}