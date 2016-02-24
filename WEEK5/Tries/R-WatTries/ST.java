
public class ST<Value>{
	private static int R = 256;
	
	private static class Node{
		private Object value;
		Node[] next = new Node[R];
	}
	private Node head;

	public ST(){
		head = null;
	}

	public void put(String s, Value v){
		this.head = insert(head, s, 0, v);
	}

	public Value get(String s){
		Object t = search(head, s, 0);
		return t == null ? null : (Value)t;
	}
	private Object search(Node head, String s, int index){
		if(head == null)
			return null;
		if(s.length() == index)
			return head.value;
		char c = s.charAt(index);
		return search(head.next[c], s, ++index);
	}

	private Node insert(Node head, String s, int index, Object v){
		if(head == null)
			head = new Node();
		if(s.length() == index){
			head.value = v;
			return head;
		}
		head.next[s.charAt(index)] = insert(head.next[s.charAt(index)], s, ++index, v);
		return head;
	}
}