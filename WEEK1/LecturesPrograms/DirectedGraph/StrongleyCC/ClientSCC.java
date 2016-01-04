import java.util.Scanner;

public class ClientSCC
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Digraph dg = new Digraph(in.nextInt());
		int edges = in.nextInt();

		while(edges-- != 0)
			dg.addEdge(in.nextInt(), in.nextInt());
		//System.out.println(dg);
		SCC scc = new SCC(dg);
		scc.isSCC(1, 2);
	}
}