public class Edge implements Comparable<Edge>{
	private final int either;
	private final int other;
	private final double weight;

	public Edge(int either, int other, double weight){
		this.either= either;
		this.other = other;
		this.weight = weight;
	}

	public int either(){
		return this.either;
	}

	public int other(){
		return this.other;
	}

	public double weight(){
		return this.weight;
	}

	public int compareTo(Edge that){
		if(this.weight < that.weight)
			return -1;
		else if(this.weight > that.weight)
			return 1;
		return 0;
	}

	public String toString(){
		return " |"+either+"--"+other+" "+weight+"| ";
	}
}