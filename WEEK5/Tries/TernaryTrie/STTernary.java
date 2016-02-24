
public class STTernary<Value>{

	private static class Node{
		private Object value;
		private char c;
		Node left, middle, right;
	}

	private Node head;

	public STTernary(){
		head = null;
	}

	public void put(String s, Value value){
		head = insert(head, s, 0, value);
	}

	public Value get(String s){
		Object value =  search(head, s, 0);
		return value == null ? null : (Value)value;
	}

	private Object search(Node head, String s, int index){
		if(head == null)
			return null;
		char c = s.charAt(index);
		if(c < head.c)
			return search(head.left, s, index);
		else if(c > head.c)
			return search(head.right, s, index	);
		else if(index < s.length()-1)
			return search(head.middle, s, ++index);
		return head.value;
	}
	
	private Node insert(Node head, String s, int index, Object value){
		char c = s.charAt(index);
		if(head == null){
			head = new Node();
			head.c = c;
		}
		if(c < head.c)
			 head.left = insert(head.left, s, index, value);
		else if (c > head.c) 
			 head.right = insert(head.right, s, index, value);
		else if(index < s.length()-1 ) 
			head.middle = insert(head.middle, s, ++index, value);
		else
			 head.value = value;
		return head	;
		
	}
}