import java.util.Scanner;

public class ClientQuickFind{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		QuickFind qf = new QuickFind(in.nextInt());
		boolean flag = false;
		while(in.hasNext()){
			int p = in.nextInt();
			int q = in.nextInt();
			if(!qf.connected(p, q))
				qf.union(p, q);
			else
				flag = true;
		}
			if(!flag && qf.components() == 1)
				System.out.println("It is connected and acyclic");
			else 
				System.out.println("It is not tree");


		
	}
}
