package PemrogramanMahir.Final;

public class FinalGraph {
    private String[] vertices;
    private int[][] edges;

    public FinalGraph(int n) {
        this.vertices = new String[n];
        this.edges = new int[n][n];
    }

    public void setVertice(int index, String value) {
        this.vertices[index] = value;
    }

    public String getVertice(int index) {
        return this.vertices[index];
    }

    public void setEdge(int fromIndex, int toIndex, int value) {
        this.edges[fromIndex][toIndex] = value;
        this.edges[toIndex][fromIndex] = value;
    }

    public int getEdge(int fromIndex, int toIndex) {
        return this.edges[fromIndex][toIndex];
    }

    public void dijkstra(int from) {

        // Persiapkan koleksi
        int[] distanceTo = new int[this.vertices.length];
        int[] previousVertice = new int[this.vertices.length];
        boolean[] visited = new boolean[this.vertices.length];
        int visitedCount = 0;

        // Reset
        for (int i = 0; i < distanceTo.length; i++) {
            distanceTo[i] = Integer.MAX_VALUE;
            previousVertice[i] = -1;
        }
        // Tentukan nilai awal
        distanceTo[from] = 0;
        previousVertice[from] = from;
        visited[from] = true;
        visitedCount++;

        // Ulangi sampai semua vertice dikunjungi
        int current = from;
        while (visitedCount < visited.length){

            // periksa semua vertice yang belum dikunjungi dan ada koneksi
            for (int i = 0; i < this.edges[current].length; i++) {
                if (!visited[i] && this.getEdge(current, i) !=0){

                    // Update
                    if (distanceTo[i] == Integer.MAX_VALUE){
                        distanceTo[i] = distanceTo[current] + getEdge(current, i);
                        previousVertice[i] = current;
                    }else if (distanceTo[i] > distanceTo[current] + getEdge(current, i)){
                        distanceTo[i] = distanceTo[current] + getEdge(current, i);
                        previousVertice[i] = current;
                    }
                }
            }

            // Cari rute terpendek
            int minId = -1;
            for (int i = 0; i < visited.length; i++) {
                if (!visited[i]){
                    if (minId < 0){
                        minId = i;
                    } else if(distanceTo[i] < distanceTo[minId]) {
                        minId = i;

                    }
                }
            }

            // Tandai sebagai visited
            visited[minId] = true;
            visitedCount++;

            // Cek Vertice berikutnya
            current = minId;


        }

        // Tampilkan hasil dijkstra
        for (int i = 0; i < distanceTo.length; i++) {
            System.out.printf("Dari %s ke %s ==> %d via %s\n",
                    this.vertices[from],
                    this.vertices[i],
                    distanceTo[i],
                    this.vertices[previousVertice[i]]);
        }
    }
}
