package com.prateek.ds;

import java.util.LinkedList;

public class Graph {
     public HashMap<Integer, Node> nodeLookup=new HashMap<>();
     public static class Node{
          private int id;
          LinkedList<Node> adjacent=new LinkList<>();
          public Node(int id){
               this.id=id;
          }
     }
    
    public Node getNode(int id){
         return nodeLookup.get(id);
    }
    
    public void addEdge(int source, int destination) {
         Node s=getNode(source);
         Node d=getNode(destination);
         s.adjacent.add(d);
    }
    
    public boolean hasPathDFS(int source, int destination){
         
    }
    
    public boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){
         
    }
    
    public static void main(String[] args) {
	    // write your code here
    }
}
