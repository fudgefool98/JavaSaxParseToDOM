/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasaxparsetodom;

import java.util.ArrayList;
import javax.lang.model.element.Element;

/**
 *
 * @author Jordan
 */
public class Dom {
    private ArrayList<Node> nodes;
    
    public Dom() {
        nodes = new ArrayList<>();
    }
    
    public ArrayList<Node> getNodes() {
        return nodes;
    }
    
    public void addNode(Node node) {
        nodes.add(node);
    }
}
