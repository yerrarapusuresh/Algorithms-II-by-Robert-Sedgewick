import java.util.Scanner;

public class ClientGraph
{
	public static void main(String[] args) 
	{
		Graph g = new Graph(11);
		Scanner input = new  Scanner(System.in);
		while(input.hasNext())
		{
			//int in = ;
			g.addEdge(input.nextInt(), input.nextInt());

		}
	/*	System.out.println(g.toString());
		DeapthFirstPaths dfs = new DeapthFirstPaths(g, 6);
		System.out.println(dfs.hasPathTo(0));
		for(int w : dfs.pathTo(5))
			System.out.println(w);
			*/
			BreadthFirstPaths bfs = new BreadthFirstPaths(g, 7);
			//System.out.println(bfs.hasPathTo(5));
			for(int w : bfs.pathTo(2))
				System.out.println(w);


	}
}