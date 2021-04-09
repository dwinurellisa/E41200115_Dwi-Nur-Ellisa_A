/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author Ellisa
 */
public class GraphApp {
    public static void main(String[] args) {
        
        Graph theGraph = new Graph();
        
        theGraph.addGraphVertex('A'); //0
        theGraph.addGraphVertex('B'); //1
        theGraph.addGraphVertex('C'); //2
        theGraph.addGraphVertex('D'); //3
        theGraph.addGraphVertex('E');  //4
        
        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(2, 3); //CD
        theGraph.addEdge(3, 4); //DE
        
        
        theGraph.bfs();
        theGraph.display();
    }
}
