/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Amine
 */
public class Graph {
    List<NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList();
    }
    
    
    public void addNode(NodeGraph n){
        nodes.add(n);
    }
    
    
    public void updateValueNodeByName(String name,int value){
        for (int i=0;i<nodes.size();++i){
            NodeGraph n = nodes.get(i);
            if (n.getName().equals(name)) n.setValue(value);
                    
        }
    }

    @Override
    public String toString() {
        String str ="Graph \n";
        for (NodeGraph n : nodes) {
            str = str + n.toString() + '\n';
            
        }
        
        return str;
            
        }
    
    
    

}
