import java.util.Scanner;

public class ClientKeyIndexSort
{
	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);
		char[] chars = new char[input.nextInt()];
		int[] count = new int[7];
		int i = 0;
		while(i < chars.length)
		{
			chars[i++] = input.next().charAt(0);
		}

		for(i = 0; i < chars.length; i++)
			count[chars[i]  - 'a' + 1]++;

		for(i = 0; i < count.length - 1; i++)
			count[i + 1] +=  count[i];

		char[] aux = new char[chars.length];

		for(i = 0; i < chars.length; i++)
			aux[count[chars[i] - 'a' ]++] = chars[i];

		for(i = 0; i < aux.length; i++)
				System.out.println(aux[i]);

		
		
		
	}
}