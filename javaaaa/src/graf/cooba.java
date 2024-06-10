package graf;

public class cooba {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");

        myGraph.addVertex(a);
        myGraph.addVertex(b);
        myGraph.addVertex(c);
        myGraph.addVertex(d);

        myGraph.addEdge(a, b);
        myGraph.addEdge(a, d);
        myGraph.addEdge(c, a);
        myGraph.addEdge(b, d);
        myGraph.addEdge(d, c);

        // Optional: Add edges with weights
        // myGraph.addEdge(a, b, 1.0);
        // myGraph.addEdge(a, d, 2.0);
        // myGraph.addEdge(c, a, 3.0);
        // myGraph.addEdge(b, d, 4.0);
        // myGraph.addEdge(d, c, 5.0);
    }
}
