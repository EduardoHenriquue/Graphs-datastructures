/**
 * Created by eduardohenrique on 26/06/17.
 */
public class Edge {
    private int weight;
    private Vertex v;
    private Vertex u;

    public Edge() {
    }

    public Edge(int weight, Vertex v, Vertex u) {
        this.weight = weight;
        this.v = v;
        this.u = u;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
