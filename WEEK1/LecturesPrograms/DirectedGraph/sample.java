
import java.util.LinkedList;

public class sample
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(0);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		for(int w : list)
			System.out.println(w);
	}
}