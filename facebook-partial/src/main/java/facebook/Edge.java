package facebook;

/**
 * Object representation of a
 * bidirectional edge from node 1 to node 2.
 * @author srollins
 *
 */
public class Edge {

	private int node1;
	private int node2;
	
	public Edge(int node1, int node2) {
		super();
		this.node1 = node1;
		this.node2 = node2;
	}
	
	public int getNode1() {
		return node1;
	}
	
	public int getNode2() {
		return node2;
	}
	
	
	
}