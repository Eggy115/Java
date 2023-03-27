import java.util.*;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        int[][] graph = {{0, 6, 0, 1, 0},
                         {6, 0, 5, 2, 2},
                         {0, 5, 0, 0, 5},
                         {1, 2, 0, 0, 1},
                         {0, 2, 5, 1, 0}};
        int start = 0;
        int[] dist = dijkstra(graph, start);
        System.out.println(Arrays.toString(dist));
    }

    public static int[] dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<Integer> pq = new
