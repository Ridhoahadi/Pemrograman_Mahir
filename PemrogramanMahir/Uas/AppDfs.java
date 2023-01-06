package PemrogramanMahir.Uas;


// Bagian Terakhir (SILVIA)
public class AppDfs {
    public static void main(String[] args) {


        NewGraph graph = new NewGraph(7);
        graph.setVertice(0, "A");
        graph.setVertice(1, "B");
        graph.setVertice(2, "C");
        graph.setVertice(3, "D");
        graph.setVertice(4, "E");
        graph.setVertice(5, "F");
        graph.setVertice(6, "G");

        graph.setEdge(0, 1, true); // A ke B
        graph.setEdge(0, 2, true); // A ke C
        graph.setEdge(0, 3, true); // A ke D
        graph.setEdge(1, 2, true); // B ke C
        graph.setEdge(1, 4, true); // B ke E
        graph.setEdge(1, 5, true); // B ke F
        graph.setEdge(2, 3, true); // C ke D
        graph.setEdge(2, 5, true); // C ke F
        graph.setEdge(3, 5, true); // D ke F
        graph.setEdge(3, 6, true); // D ke G
        graph.setEdge(4, 5, true); // E ke F
        graph.setEdge(5, 6, true); // F ke G


        graph.printDfs(0);

    }
}
