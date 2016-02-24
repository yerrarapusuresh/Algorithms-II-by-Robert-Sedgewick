import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClientPrims{
	public static void main(String[] args) throws IOException{

		if(args.length != 1){
			System.out.println("Usage : java ClientPrims inputFile");
			return;
		}

		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		EdgeWeightGraph graph = new EdgeWeightGraph(Integer.parseInt(br.readLine().split(" ")[0]));
		String temp;
		while((temp = br.readLine()) != null){
			String[] edge = temp.split(" ");
			graph.addEdge(new Edge(Integer.parseInt(edge[0]), Integer.parseInt(edge[1]), Double.parseDouble(edge[2])));
		}

		//System.out.println(graph);
		PrimsLazy mst = new PrimsLazy(graph);
		for(Edge e : mst.mst())
			System.out.println(e);
			

	}
		

}
