
import java.util.Scanner;

public class  ClientDigraph
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Digraph graph = new Digraph(input.nextInt());
		while(input.hasNext())
			graph.addEdge(input.nextInt(), input.nextInt());

		System.out.println(graph.toString());
		/*DeapthFirstPaths dfs = new DeapthFirstPaths(graph, 0);
		System.out.println(dfs.hasPathTo(10));
		for(int w : dfs.pathTo(7))
			System.out.println(w);*/

			BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 7);
			System.out.println(bfs.hasPathTo(2));
			System.out.println(bfs.distance(2));
	}
}