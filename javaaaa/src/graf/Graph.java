package graf;

public class Graph {
    private int numVertices;
    private int numEdges;
    private Vertex[] vertices;
    private Edge[] edges;

    public Graph() {
        this.vertices = new Vertex[10]; // Initial size can be changed
        this.edges = new Edge[20]; // Initial size can be changed
        this.numVertices = 0;
        this.numEdges = 0;
    }

    private boolean isVertexExist(Vertex vertex) {
        for (int i = 0; i < numVertices; i++) {
            if (vertices[i].getLabel().contentEquals(vertex.getLabel())) {
                return true;
            }
        }
        return false;
    }

    private int getVertexIndex(Vertex vertex) {
        for (int i = 0; i < numVertices; i++) {
            if (vertices[i].getLabel().contentEquals(vertex.getLabel())) {
                return i;
            }
        }
        return -1;
    }

    public void addVertex(Vertex vertex) {
        if (isVertexExist(vertex)) {
            System.out.println("Vertex already exists");
            return;
        }
        if (numVertices >= vertices.length) {
            System.out.println("Vertex array is full");
            return;
        }
        vertices[numVertices] = vertex;
        ++numVertices;
    }

    public void addEdge(Vertex fromVertex, Vertex toVertex) {
        if (!isVertexExist(fromVertex)) {
            System.out.println("From vertex does not exist");
            return;
        }
        if (!isVertexExist(toVertex)) {
            System.out.println("To vertex does not exist");
            return;
        }
        if (numEdges >= edges.length) {
            System.out.println("Edge array is full");
            return;
        }
        edges[numEdges] = new Edge("e" + numEdges, fromVertex, toVertex);
        ++numEdges;
    }

    public void addEdge(Vertex fromVertex, Vertex toVertex, Double weight) {
        if (!isVertexExist(fromVertex)) {
            System.out.println("From vertex does not exist");
            return;
        }
        if (!isVertexExist(toVertex)) {
            System.out.println("To vertex does not exist");
            return;
        }
        if (numEdges >= edges.length) {
            System.out.println("Edge array is full");
            return;
        }
        edges[numEdges] = new Edge("e" + numEdges, fromVertex, toVertex, weight);
        ++numEdges;
    }
}

// Vertex class for the graph
class Vertex {
    private String label;

    public Vertex(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

// Edge class for the graph
class Edge {
    private String label;
    private boolean wasVisited;
    private Vertex fromVertex;
    private Vertex toVertex;
    private Double weight;

    public Edge(String label, Vertex fromVertex, Vertex toVertex) {
        this.label = label;
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
        this.weight = 0.0;
        this.wasVisited = false;
    }

    public Edge(String label, Vertex fromVertex, Vertex toVertex, Double weight) {
        this.label = label;
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
        this.weight = weight;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
