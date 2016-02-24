import java.util.Scanner;

public class ClientST{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		ST<Integer> st = new ST<Integer>();
		st.put("Suresh", 1);
		st.put("", 2);
		st.put("a", 3);
		System.out.println(st.get("Suresh"));
		System.out.println(st.get(""));
		System.out.println(st.get("nULL"));
	}
}