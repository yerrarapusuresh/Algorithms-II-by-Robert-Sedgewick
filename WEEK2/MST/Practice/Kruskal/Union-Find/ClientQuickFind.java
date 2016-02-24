

public class ClientQuickFind{

	public static void main(String[] args){

		WeightedQuickUnion qf = new WeightedQuickUnion(5);
		qf.union(1, 0);
		qf.union(0, 2);
		qf.union(4, 1);
		System.out.println(qf.isConnected(1, 2));
		System.out.println(qf.isConnected(4, 3));

		for(int i = 0; i < qf.array.length; i++)
			System.out.println(qf.array[i]);
	}
}