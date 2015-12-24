import java.util.Scanner;

public class ClientTopologicalSort
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Digraph graph = new Digraph(input.nextInt());
		while(input.hasNext())
			graph.addEdge(input.nextInt(), input.nextInt());

		TopologicalSort	 topo = new  TopologicalSort(graph);
		for(int w : topo.reversePost())
			System.out.println(w);
	}
}