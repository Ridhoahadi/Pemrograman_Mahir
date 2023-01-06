package PemrogramanMahir.p12graph;

public class Graph {
    private String[] vertices;

    private int [][] edges;

    public Graph(int n){
        vertices = new String[n];
        edges = new int[n][2];

    }
    public void setVertices (int index, String value){
        if (index < this.vertices.length){
            this.vertices[index] = value;
        }else {
            System.out.println("Maaf ... diluar dari range");
        }
    }
    public void setEdges(int id, int from, int to){
        this.edges[0][0] = from;
        this.edges[0][1] = to;
    }
    public boolean isAdjecent(int from, int to) {
        boolean hasil = false;
        for (int i = 0; i < this.edges.length; i++) {
            if (this.edges[i][0] == from & this.edges[i][1] == to){
                hasil = true;
                break;
            }
        }
        return hasil;
    }
    public int [] neighbors (int from){
        int n = 0;
        int [] hasil = new int[this.edges.length];
        for (int i = 0; i < this.edges.length; i++) {
            if (this.edges[i][0] == from){
                hasil [n] = this.edges[i][0];
                n++;
            }
        }
        return hasil;
    }
}
