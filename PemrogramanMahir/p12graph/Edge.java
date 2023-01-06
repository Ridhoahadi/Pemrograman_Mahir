package PemrogramanMahir.p12graph;

public class Edge {

    /**

        //Ulang sampai semua di kunjungi
        while (visitedCount < visited.length){

            int current = from;

            //Lakukan pemeriksaan terhadap vertice yang telah dikunjungi
            for (int i = 0; i < this.edges[current].length; i++) {
                if (!visited[i] && getEdge(current, i) !=0){

                    //Update
                    if (distanceTo[i] == Integer.MAX_VALUE){
                        distanceTo[i] = distanceTo[current] + getEdge(current, i);
                    }else if (distanceTo[i] > distanceTo[current] + getEdge(current, i )){
                        distanceTo[i] = distanceTo[current] + getEdge(current, i);
                        previousVertice[i] = current;
                    }
                }
            }
            // cari jarak terpendek

            int minId = -1;
            for (int i = 0; i < visited.length; i++) {
                if (!visited[i]){
                    if (minId < 0){
                        minId = i;
                    }else if (distanceTo[i] < distanceTo[minId]){
                        minId = i;
                    }
                }
            }

            // Tandai setelah dikunjungi

            visited[minId] = true;
            visitedCount++;

            //cek vertices selanjutnya
            current = minId;
        }

        // Tampilkan hasil dijsktra

        for (int i = 0; i < distanceTo.length; i++) {
            System.out.printf("Dari %s ke %s ==> %d via %s\n",
                    this.vertices[from],
                    this.vertices[i],
                    distanceTo[i],
                    this.vertices[previousVertice[i]]);

        }
     }

     **/
}
