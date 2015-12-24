

public class KeyIndexSort
{

	//private final String radix;
	private final int count[];

	public KeyIndexSort(int radix)
	{
		
		count = new int[radix ];
	}

	public int[] frequencyCount(char[] array)
	{
		for(int i = 0; i < array.length; i++)
			count[array[i] - 'a']++;
		return count;
	}



}