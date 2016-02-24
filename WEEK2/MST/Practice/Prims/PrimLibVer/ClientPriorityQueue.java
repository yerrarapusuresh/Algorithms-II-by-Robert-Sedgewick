import java.util.Scanner;

public class ClientPriorityQueue
{
	public static void main(String[] args){
		Integer[] array = {3,2,1,5,43,2,4,5,7,9,6,5,5,67,-2};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(array.length);
		for(Integer i: array)
			pq.insert(i);
		while(!pq.isEmpty())
			System.out.println(pq.delMin());
		

	}
}