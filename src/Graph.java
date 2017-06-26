import java.util.List;

/**
 * Created by eduardohenrique on 26/06/17.
 */
public class Graph {

    private List<Vertex> vertexList;
    private List<Edge> edges;
    private boolean directed;

    public Graph() {
    }

    public Graph(List<Vertex> vertexList, List<Edge> edges) {
        this.vertexList = vertexList;
        this.edges = edges;
    }

    public Graph(List<Vertex> vertexList, List<Edge> edges, boolean directed) {
        this.vertexList = vertexList;
        this.edges = edges;
        this.directed = directed;
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }


    public List<Edge> getEdges() {
        return edges;
    }


    public boolean isDirected() {
        return directed;
    }

    public void setDirected(boolean directed) {
        this.directed = directed;
    }
}
