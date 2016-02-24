import java.util.Scanner;

public class ClientSTTernary{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		STTernary<Integer> st = new STTernary<Integer>();
		st.put("Suresh", 1);
		st.put("1", 2);
		st.put("a", 3);
		System.out.println(st.get("Suresh"));
		System.out.println(st.get("1"));
		System.out.println(st.get("nULL"));
	}
}