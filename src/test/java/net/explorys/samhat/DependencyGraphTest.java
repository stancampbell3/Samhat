package net.explorys.samhat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by stan.campbell on 9/2/15.
 */
public class DependencyGraphTest {

    @Test
    public void canBuildAGraph() {

        DependencyGraph instance = new DependencyGraph();
        instance.addDependencyEntries("A", Arrays.asList("B"));
        instance.addDependencyEntries("B", Arrays.asList("C", "D"));
        instance.addDependencyEntries("C", new ArrayList<>());
        instance.addDependencyEntries("D", Arrays.asList("E"));
        instance.addDependencyEntries("E", new ArrayList<>());
    }

    @Test
    public void returnsNodesInProperOrder() {

        DependencyGraph instance = new DependencyGraph();
        instance.addDependencyEntries("A", Arrays.asList("B"));
        instance.addDependencyEntries("B", Arrays.asList("C", "D"));
        instance.addDependencyEntries("C", new ArrayList<>());
        instance.addDependencyEntries("D", Arrays.asList("E"));
        instance.addDependencyEntries("E", new ArrayList<>());

        List<String> labelsInOrder = instance.getDependenciesInOrder();
        HashMap<String, Integer> labelToOrderMap = new HashMap<>();
        // Determine the ordering
        for(int i=0;i<labelsInOrder.size();i++) {
            labelToOrderMap.put(labelsInOrder.get(i), i);
        }
        // Make sure it is correct
        assertTrue("B is defined before A", labelToOrderMap.get("B") < labelToOrderMap.get("A"));
        assertTrue("C is defined before B", labelToOrderMap.get("C") < labelToOrderMap.get("B"));
        assertTrue("D is defined before B", labelToOrderMap.get("D") < labelToOrderMap.get("B"));
        assertTrue("E is defined before D", labelToOrderMap.get("E") < labelToOrderMap.get("D"));
    }
}
