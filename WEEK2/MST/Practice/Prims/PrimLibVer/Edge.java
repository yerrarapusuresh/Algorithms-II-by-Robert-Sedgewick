
public class Edge implements Comparable<Edge>{
	private int v;
	private int w;
	private double dist;

	public Edge(int v, int w, double dist){
		this.v = v;
		this.w = w;
		this.dist = dist;
	}

	public int either(){
		return v;
	}

	public int other(){
		return w;
	}

	public double distance(){
		return dist;
	}
	public int compareTo(Edge that){
		if(this.dist < that.dist)
			return -1;
		else if(this.dist > that.dist)
			return 1;
		return 0;
	}
	public String toString(){
		return "|"+v+"-->"+w+"  "+dist+"| ";
	}
}