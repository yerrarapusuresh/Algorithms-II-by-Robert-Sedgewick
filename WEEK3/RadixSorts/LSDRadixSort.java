import java.util.Scanner;
import java.io.*;

public class LSDRadixSort
{
	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		String[] array = new String[input.nextInt()];
		for(int i = 0; i < array.length; i++)
			array[i] =  input.next();
		sort(array, 3);
		for( int i = 0; i < array.length ; i++)
			System.out.println(array[i]); 
	}


	public static void sort(String[] array, int w)
	{
		
		
		int N = array.length;
		String[] aux = new String[array.length];

		for(int d = w -1; d >= 0; d--)
		{
			int[] count = new int[256 + 1];
			for(int i = 0; i < N; i++)
				count[array[i].charAt(d) + 1]++;

			for(int i = 0; i < count.length -1; i++)
				count[i+1] += count[i];

			for(int i = 0; i < array.length; i++)
				aux[count[array[i].charAt(d)]++] = array[i];

			for(int i = 0; i < array.length; i++)
				array[i] = aux[i];
		}

	

	}
	



}













