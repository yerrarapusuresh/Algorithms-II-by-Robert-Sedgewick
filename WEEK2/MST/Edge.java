

public class Edge implements Comparable<Edge>
{

	private final int v;
	private final int w;
	private final double weight;

	public Edge(int v, int w, double weight)
	{
		this.v = v;;
		this.w = w;
		this.weight = weight;
	}

	public int either()
	{
		return v;
	}

	public int other(int v)
	{
		if(this.v == v)
			return w;
		return v;
	}
	public double weight()
	{
		return weight;
	}

	public int compareTo(Edge that)
	{
		if(this.weight < that.weight)
			return -1;
		else if(this.weight > that.weight)
			return 1;
		else
			return 0;
	}

	public String toString()
	{
		return String.format("%d-%d ", v, w)+""+weight;
	}
}