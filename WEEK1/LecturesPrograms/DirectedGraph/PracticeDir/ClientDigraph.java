import java.util.Scanner;

public class ClientDigraph
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		Digraph dg = new Digraph(in.nextInt());
		int edges = in.nextInt();

		while(edges-- != 0)
			dg.addEdge(in.nextInt(), in.nextInt());

		System.out.println(dg);
		System.out.println();
		System.out.println(dg.reverse());


		DepthFirstSearch dfs = new DepthFirstSearch(dg, 0);
		for(int i : dfs.pathTo(5))
			System.out.println(i);
	}
}
