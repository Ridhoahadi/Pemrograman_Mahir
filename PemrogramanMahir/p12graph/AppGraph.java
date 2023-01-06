package PemrogramanMahir.p12graph;

public class AppGraph {
    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.setVertices(0, "Jakarta");
        graph.setVertices(1, "Riau");

        graph.setEdges(0,2,3);
    }
}
