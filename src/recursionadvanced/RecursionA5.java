package recursionadvanced;
// Print all subsets of a set of first n natural numbers.
import java.util.*;
public class RecursionA5 {
	public static void printSubsets(ArrayList<Integer>subset) {
		for(int i=0;i<subset.size();i++) {
			System.out.print(subset.get(i)+" ");
		}
		System.out.println();
	}
public static void findSets(int n, ArrayList<Integer>subset) {
	if(n==0) {
		printSubsets(subset);
		return;
	}
	// no. wants to get chosen
	subset.add(n);
	findSets(n-1,subset);
	//no. dont wants to get chosen
	subset.remove(subset.size()-1);
	findSets(n-1,subset);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		ArrayList<Integer>subset=new ArrayList<>();
		findSets(n,subset);

	}

}
//Time Complexity: O(2 ka power n)
