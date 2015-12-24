import java.util.Scanner;

public class ClientCC
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Graph graph = new Graph(input.nextInt());
		while(input.hasNext())
			graph.addEdge(input.nextInt(), input.nextInt());
		CC cc = new CC(graph);
		System.out.println(cc.components());
		System.out.println(cc.sameComponent(1,13));
	}
}