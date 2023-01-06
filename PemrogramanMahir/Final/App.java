package PemrogramanMahir.Final;

public class App {
    public static void main(String[] args) {

        FinalGraph graph = new FinalGraph(7);
        graph.setVertice(0, "A");
        graph.setVertice(1, "B");
        graph.setVertice(2, "C");
        graph.setVertice(3, "D");
        graph.setVertice(4, "E");
        graph.setVertice(5, "F");
        graph.setVertice(6, "G");

        graph.setEdge(0, 1, 25 ); // A ke B
        graph.setEdge(0, 2, 35 ); // A ke C
        graph.setEdge(0, 3, 25 ); // A ke D
        graph.setEdge(1, 2, 40 ); // B ke C
        graph.setEdge(1, 4, 55 ); // B ke E
        graph.setEdge(1, 5, 70 ); // B ke F
        graph.setEdge(2, 3, 45 ); // C ke D
        graph.setEdge(3, 5, 15 ); // D ke F
        graph.setEdge(3, 6, 10 ); // D ke G
        graph.setEdge(4, 5, 70 ); // E ke F
        graph.setEdge(5, 6, 25 ); // F ke G


        graph.dijkstra(4);
    }
}
