package grigorev.mikhail.iterators;

import grigorev.mikhail.data.Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSIterator implements Iterator<Integer> {

    private Graph graph;
    private boolean[] visited;
    private Queue<Integer> stack = new LinkedList<>();

    public BFSIterator(Graph graph) {
        this.graph = graph;
        this.visited = new boolean[graph.getV()];
        this.stack.add(0);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public Integer next() {
        int s = stack.peek();
        stack.poll();

        if(visited[s] == false)
        {
            System.out.print(s + " ");
            visited[s] = true;
        }
        Iterator<Integer> itr = graph.getAdj()[s].iterator();

        while (itr.hasNext())
        {
            int v = itr.next();
            if(!visited[v])
                stack.add(v);
        }
        return s;
    }

}
