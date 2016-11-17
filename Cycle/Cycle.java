import java.util.*;
public class Cycle {

	public static boolean hasCycleHelper(int v, HashMap<Integer, ArrayList<Integer>> h, 
											boolean[] visited, boolean[] recStack) {
		if (!visited[v]) {
			visited[v] = true;
			recStack[v] = true;
			if (h.containsKey(v)) {
				ArrayList<Integer> temp = h.get(v);
				for(Integer elem: temp) {
					if (!visited[elem] && hasCycleHelper(elem, h, visited, recStack) == true) {
						return true;
					} else if(recStack[elem] == true) {
						return true;
					}
				}
			}
		}
		recStack[v] = false;
		return false;
	}

	public static boolean hasCycle(int n, HashMap<Integer, ArrayList<Integer>> h) {
		// Visited and Recursion Stack arrays
		boolean visited[] = new boolean[n];
		boolean recStack[] = new boolean[n];

		for(int i=0; i<n; i++) {
			visited[i] = false;
			recStack[i] = false;
		}
		for(int i=0; i<n; i++) {
			//if (!visited[i]) {
				if (hasCycleHelper(i, h, visited, recStack) == true) {
					return true;
				}
			//}
		}
		return false;
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// No of Nodes
		int v = sc.nextInt();	// No of edges

		// Input and dict Creation. Adjacency List
		HashMap<Integer, ArrayList<Integer>> h = new HashMap<Integer, ArrayList<Integer>>();
		for(int i=0; i<v; i++) {
			int s, d;
			s = sc.nextInt();
			d = sc.nextInt();
			if (h.containsKey(d)) {
				ArrayList<Integer> temp = h.get(d);
				temp.add(s);
			} else {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(s);
				h.put(d, temp);
			}
		}

		// Call helper for DFS.
		System.out.println(hasCycle(n, h));
	}
}