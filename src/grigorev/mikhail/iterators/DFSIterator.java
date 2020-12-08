package grigorev.mikhail.iterators;

import grigorev.mikhail.data.Graph;

import java.util.Iterator;
import java.util.Stack;

public class DFSIterator implements Iterator<Integer> {

    private Graph graph;
    private boolean[] visited;
    private Stack<Integer> stack = new Stack<>();

    public DFSIterator(Graph graph) {
        this.graph = graph;
        this.visited = new boolean[graph.getV()];
        this.stack.push(0);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public Integer next() {
        int s = stack.peek();
        stack.pop();

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
                stack.push(v);
        }
        return s;
    }

}
