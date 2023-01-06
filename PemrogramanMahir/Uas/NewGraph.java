package PemrogramanMahir.Uas;


// Bagian 1 (RIDHO)

public class NewGraph {

    private String[] vertices;
    // karena edgenya tidak menggunakan arah, maka
    private boolean[][] edges;

    // Kita buat Methodenya
    public NewGraph(int n){ // Jumlah data yang akan kita gunakan sebanyak n
        // Selanjutnya kita deklarasikan vertices dan edges nya
        this.vertices = new String[n];
        this.edges = new boolean[n][n];
    }

    // Tidak semua vertices
    public void setVertice(int index, String values) {
        this.vertices[index] = values;
    }

    public String getVertice(int index) {
        return this.vertices[index];

    }

    // Selanjutnya kita buat set edge nya, tidak untuk semua edges
    public void setEdge(int fromIndex, int toIndex, boolean value) {
        this.edges[fromIndex][toIndex] = value;
        // kita undirected kan
        this.edges[toIndex][fromIndex] = value;
    }

    public boolean getEdge(int fromIndex, int toIndex) {
        return this.edges[fromIndex][toIndex];
    }


    //Gunakan Stack untuk algoritma DFS

    // Bagian 3 (WAN SOFIYAH)
    public void printDfs(int fromIndex){
        // Menggunakan algoritma DFS
        // Koleksi
        StackGraph koleksi = new StackGraph(this.vertices.length);
        boolean[] visited = new boolean[this.vertices.length];

        //inisialisasi vertice awal
        koleksi.push(fromIndex);

        while (!koleksi.isEmpty()){
            int idVertice = koleksi.pop();
            System.out.println(this.vertices[idVertice]);
            visited[idVertice] = true;

            for (int i = 0; i < this.vertices.length ; i++) {
                if (this.getEdge(idVertice, i) && !visited[i]){
                    koleksi.push(i);
                    visited[i] = true;
                }
            }
        }
    }
}