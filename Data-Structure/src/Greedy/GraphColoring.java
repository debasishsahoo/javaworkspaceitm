package Greedy;

import java.util.*;

//A class to store a graph edge
class Edge
{
 int source, dest;

 public Edge(int source, int dest)
 {
     this.source = source;
     this.dest = dest;
 }
}

//A class to represent a graph object
class Graph
{
 // A list of lists to represent an adjacency list
 List<List<Integer>> adjList = null;

 // Constructor
 Graph(List<Edge> edges, int n)
 {
     adjList = new ArrayList<>();
     for (int i = 0; i < n; i++) {
         adjList.add(new ArrayList<>());
     }

     // add edges to the undirected graph
     for (Edge edge: edges)
     {
         int src = edge.source;
         int dest = edge.dest;

         adjList.get(src).add(dest);
         adjList.get(dest).add(src);
     }
 }
}

class GraphColoring 
{
 // Add more colors for graphs with many more vertices
 private static String[] color = {
         "", "BLUE", "GREEN", "RED", "YELLOW", "ORANGE", "PINK",
         "BLACK", "BROWN", "WHITE", "PURPLE", "VOILET"
 };

 // Function to assign colors to vertices of a graph
 public static void colorGraph(Graph graph, int n)
 {
     // keep track of the color assigned to each vertex
     Map<Integer, Integer> result = new HashMap<>();

     // assign a color to vertex one by one
     for (int u = 0; u < n; u++)
     {
         // set to store the color of adjacent vertices of `u`
         Set<Integer> assigned = new TreeSet<>();

         // check colors of adjacent vertices of `u` and store them in a set
         for (int i: graph.adjList.get(u))
         {
             if (result.containsKey(i)) {
                 assigned.add(result.get(i));
             }
         }

         // check for the first free color
         int color = 1;
         for (Integer c: assigned)
         {
             if (color != c) {
                 break;
             }
             color++;
         }

         // assign vertex `u` the first available color
         result.put(u, color);
     }

     for (int v = 0; v < n; v++)
     {
         System.out.println("The color assigned to vertex " + v + " is "
                 + color[result.get(v)]);
     }
 }

 // Greedy coloring of a graph
 public static void main(String[] args)
 {
     // List of graph edges as per the above diagram
     List<Edge> edges = Arrays.asList(
             new Edge(0, 1), new Edge(0, 4), new Edge(0, 5), new Edge(4, 5),
             new Edge(1, 4), new Edge(1, 3), new Edge(2, 3), new Edge(2, 4)
     );

     // total number of nodes in the graph (labelled from 0 to 5)
     int n = 6;

     // build a graph from the given edges
     Graph graph = new Graph(edges, n);

     // color graph using the greedy algorithm
     colorGraph(graph, n);
 }
}