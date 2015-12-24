public class StringST<Value> 
{
	private static final int R = 256;
	private Node root;

	public StringST()
	{
		root = new Node();
	}	

	public void put(String key, Value value)
	{
		root = put(root, key, value, 0);
	}

	private Node put(Node root, String key, Value val, int d)
	{
		if(root == null)
			root = new Node();
		if(d == key.length())
		{
			root.value = val;
			return root;
		}
		char c = key.charAt(d);
		root.next[c] = put(root.next[c], key, val, d+1);
		return root;

	}

	public Value get(String key)
	{

		return get(root, key, 0);
	}

	private Value get(Node x, String key, int d)
	{
		if(x == null)
			return null;
		if(d == key.length())
			return x.value;
		char c = key.charAt(d);
		return get(x.next[c], key, d+1);

	}

	private static class Node 
	{
		private Object value;
		Node[] next = new Node[R];
	}
}