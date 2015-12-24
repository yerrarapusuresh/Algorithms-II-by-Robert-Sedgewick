
public class ClientStringST
{
	public static void main(String[] args)
	{
		StringST<Integer> trie = new StringST<Integer>();
		trie.put("suresh",42);
		trie.put("siva", 1);
		System.out.println(trie.get("suresh"));
		System.out.println(trie.get("siva"));
		System.out.println(trie.get("rajini"));
	}
}