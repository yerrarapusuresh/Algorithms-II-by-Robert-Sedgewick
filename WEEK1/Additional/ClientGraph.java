import java.util.Scanner;

public class ClientGraph{

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);	
		Graph g  = new Graph(in.nextInt());
		int temp = in.nextInt();
		while(temp-- != 0)
			g.addEdge(in.nextInt(), in.nextInt());

		//System.out.println(g);
		DectectCycle dc = new DectectCycle(g);
		System.out.println(dc.isCycle());
	}
}