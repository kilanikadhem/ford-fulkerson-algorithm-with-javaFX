package netflow.test;

import java.io.IOException;
import netflow.Fulkerson;

public class FulkersonTest {
    public static void main(String[] args) throws IOException {
        Fulkerson g = new Fulkerson();
      /*  g.addEdge("s","o",3,0);
        g.addEdge("s","p",3,0);
        g.addEdge("o","p",2,0);
        g.addEdge("o","q",3,0);
        g.addEdge("p","r",2,0);
        g.addEdge("r","t",3,0);
        g.addEdge("q","r",4,0);
        g.addEdge("q","t",2,0);*/
      g.addEdge("s","1",12,0);
      g.addEdge("s","3",15,0);
      g.addEdge("s","5",10,0);
      g.addEdge("1","2",15,0);
      g.addEdge("1","3",10,0);
      g.addEdge("3","4",10,0);
      g.addEdge("5","3",6,0);
      g.addEdge("5","4",6,0);
      g.addEdge("5","6",1,0);
      g.addEdge("2","4",4,0);
      g.addEdge("2","t",10,0);
      g.addEdge("4","6",4,0);
      g.addEdge("4","t",10,0);
      g.addEdge("6","t",9,0);
        System.out.println("Le flot maximale est :"+g.maxFlow("s","t"));
        System.out.println(g.flow);
        
    }
        
    }

