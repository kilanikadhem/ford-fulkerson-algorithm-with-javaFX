/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Amine
 */
public class NodeGraph {
    String name;
    int value;
    List<NodeGraph> nextNodes;

    public NodeGraph(String name, int value) {
        this.name = name;
        this.value = value;
        this.nextNodes=new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addNextNode(NodeGraph n){
        if (this.name.equals(n.getName())){
            System.out.println("ERROR : You cannot add attach a node to itself");
            
        }
        else {
            nextNodes.add(n);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NodeGraph other = (NodeGraph) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        if (this.nextNodes.isEmpty()==false)
        return "Node{" + name + ", value=" + value + ", nextNodes=" + nextNodes + '}';
        return "Node{" + name + ", value=" + value +'}';
    }
    

    
    
    
    
    
}
