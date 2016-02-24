import java.util.Scanner;

public class ClientMinPQ
{
	public static void main(String[] arg)
	{
		Scanner in = new Scanner(System.in);
		int capacity = in.nextInt();
		MinPQ<Integer> pq = new MinPQ<Integer>(capacity);
		while(capacity-- != 0)
			pq.insert(in.nextInt());

		System.out.println();
		while(!pq.isEmpty())
			System.out.println(pq.delMin());
	}
}
