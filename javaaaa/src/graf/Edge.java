package graf;

public class Edge {
    private String label;
    private boolean wasVisited;

    public Edge(String label) {
        this.label = label;
        this.wasVisited = false;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}

public class Vertex {
    private String label;
    private Vertex fromVertex;
    private Vertex toVertex;
    private Double weight;

    public Vertex(String label) {
        this.label = label;
        this.fromVertex = null;
        this.toVertex = null;
        this.weight = 0.0;
    }

    public Vertex(String label, Vertex fromVertex, Vertex toVertex) {
        this.label = label;
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
        this.weight = 0.0;
    }

    public Vertex(String label, Vertex fromVertex, Vertex toVertex, Double weight) {
        this.label = label;
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }
}
