package recursionadvanced;

// Count total paths in a maze to move from (0,0) to (n,m)
public class RecursionA2 {
public static int totalPaths(int i,int j,int n,int m) {
	if(i==n || j==m) {
		return 0;
	}
	if(i== (n-1) && j== (m-1)) {
		return 1;
	}
	
	// Contraints 1. can move only right or downwards
	
	// move only right
	int rightPath=totalPaths(i,j+1,n,m);
	
	// move only downwards
	int downPath=totalPaths(i+1,j,n,m);
	
	//return totalpaths that will be possible
    return rightPath+downPath;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3 , m=3;
int total=totalPaths(0,0,n,m);
System.out.println(total);
	}

}





