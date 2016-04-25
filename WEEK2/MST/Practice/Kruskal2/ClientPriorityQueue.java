import java.util.Scanner;

public class ClientPriorityQueue{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		PriorityQueue<String> pq = new PriorityQueue<String>(in.nextInt());
		while(in.hasNext())
			pq.insert(in.next());
		while(!pq.isEmpty()){
			System.out.println(pq.delMax());
		}

	}
}