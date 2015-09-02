package net.explorys.samhat;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.TopologicalOrderIterator;

import java.util.*;

/**
 * Created by stan.campbell on 9/2/15.
 */
public class DependencyGraph {

    private DirectedGraph<String, DefaultEdge> graph = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);

    public void addDependencyEntries(String label, Collection<String> refersTo) {

        if(null==label || null==refersTo) {
            throw new IllegalArgumentException("label and refersTo list must not be null");
        }

        if(!graph.containsVertex(label)) {
            // Add a new vertex for label
            graph.addVertex(label);
        }
        // For each of the labels in refersTo
        for(String otherLabel : refersTo) {
            // -- if there is a not a node for referredTo, add one
            if(!graph.containsVertex(otherLabel)) {
                graph.addVertex(otherLabel);
            }
            // -- add an edge from the new vertex to the referredTo vertex
            graph.addEdge(label, otherLabel);
        }
    }

    /**
     * Return a list of labels such that no label with a dependency appears before that dependency in the list.
     * For instance: if A->B, B->C, B->D, and D->E then a proper ordering could be E,C,D,B,A or E,D,C,B,A, or C,E,D,B,A etc.
     * Note, the arrow in this case means that "A refers to B."
     * @return
     */
    public List<String> getDependenciesInOrder() {

        ArrayList<String> result = new ArrayList<>();

        // return a depth-first traversal of the graph
        TopologicalOrderIterator<String, DefaultEdge> itr = new TopologicalOrderIterator<>(graph);
        while(itr.hasNext()) {
            String v = itr.next();
            System.out.println("\tVisiting "+v);
            result.add(0, v); // push onto the list
        }

        return result;
    }

    @Override
    public String toString() {
        return "DependencyGraph{" +
                "graph=" + graph +
                '}';
    }
}
