/**
 * Created by eduardohenrique on 26/06/17.
 */
public class Vertex {
    private String label;
    private String predeccessor;
    private Color color;

    public Vertex() {
    }

    public Vertex(String label) {
        this.label = label;
    }

    public Vertex(String label, String predeccessor) {
        this.label = label;
        this.predeccessor = predeccessor;
    }

    public Vertex(String label, String predeccessor, Color color) {
        this.label = label;
        this.predeccessor = predeccessor;
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPredeccessor() {
        return predeccessor;
    }

    public void setPredeccessor(String predeccessor) {
        this.predeccessor = predeccessor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
