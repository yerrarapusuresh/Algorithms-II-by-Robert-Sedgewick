
public class ClientMinPQ
{
	public static void main(String[] args)
	{
		MinPQ<String> pq = new MinPQ<String>(4);
		pq.insert("suresh");
		pq.insert("sumit");
		pq.insert("abc");
		pq.insert("nidhi");
		while(!pq.isEmpty())
			System.out.println(pq.delMin());
	}
}