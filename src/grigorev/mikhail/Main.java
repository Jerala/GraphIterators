package grigorev.mikhail;

import grigorev.mikhail.data.Graph;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(8);

        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(0, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);

        System.out.print("DFS: ");
        for (Iterator<Integer> iterator = g.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
        }
        System.out.println();
        System.out.print("BFS: ");
        for (Iterator<Integer> bdfIt = g.BFSiterator(); bdfIt.hasNext(); ) {
            Integer next = bdfIt.next();
        }
    }
}
