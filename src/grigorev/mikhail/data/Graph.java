package grigorev.mikhail.data;

import grigorev.mikhail.iterators.BFSIterator;
import grigorev.mikhail.iterators.DFSIterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph implements Iterable<Integer> {

    private int v;
    private LinkedList<Integer>[] adj;

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

    public void setAdj(LinkedList<Integer>[] adj) {
        this.adj = adj;
    }

    public Graph(int v)
    {
        this.v = v;
        adj = new LinkedList[v];

        for (int i = 0; i < adj.length; i++)
            adj[i] = new LinkedList<Integer>();
    }

    public void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    public Iterator<Integer> iterator() {
        return new DFSIterator(this);
    }

    public Iterator<Integer> BFSiterator() {
        return new BFSIterator(this);
    }

}
