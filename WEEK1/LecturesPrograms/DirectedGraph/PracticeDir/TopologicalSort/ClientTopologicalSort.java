import java.util.Scanner;

public class ClientTopologicalSort
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Digraph  dg = new Digraph(in.nextInt());
		int edges = in.nextInt();

		while(edges-- != 0)
			dg.addEdge(in.nextInt(), in.nextInt());
		SCC scc = new SCC(dg);
		//TopologicalSort tps = new TopologicalSort(dg.reverse());
		//KosarajuSharirSCC tps = new KosarajuSharirSCC(dg);
		//for(int v : tps.reversePostOrder())
		//	System.out.println(v);
		System.out.println(scc.isSCC(1,2));
		
	}
}