import java.util.Scanner;

public class ClientDirectedGraph{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		DirectedGraph dg = new DirectedGraph(in.nextInt());
		int temp = in.nextInt();
		while(temp-- != 0)
			dg.addEdge(in.nextInt(), in.nextInt());
		System.out.println(dg);
		DetectCycleDirected dcd = new DetectCycleDirected(dg);
		System.out.println(dcd.isCycle());
		for(int i : dcd.cycle())
			System.out.println(i);
	}
}