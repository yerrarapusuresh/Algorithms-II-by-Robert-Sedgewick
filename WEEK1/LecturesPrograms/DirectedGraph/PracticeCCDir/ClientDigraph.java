
import java.util.Scanner;

public class ClientDigraph
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Digraph graph = new Digraph(input.nextInt());
		while(input.hasNext())
				graph.addEdge(input.nextInt(), input.nextInt());
		//CCDirected dcc = new CCDirected(graph);

		//System.out.println(dcc.components());
			System.out.println(graph);
			System.out.println(graph.reverse());
	}

}