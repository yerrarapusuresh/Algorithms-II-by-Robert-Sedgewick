import java.util.Scanner;

public class ClientBFS
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Digraph dg = new Digraph(in.nextInt());
		int edges = in.nextInt();

		while(edges-- != 0)
			dg.addEdge(in.nextInt(), in.nextInt());
		BreadthFirstSearch bfs = new BreadthFirstSearch(dg, 11);
		bfs.distance(3);
	}
}
