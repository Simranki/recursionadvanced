package recursionadvanced;

// Qs. Place tiles of size 1*m in a floor of size n*m
public class RecursionA3 {
public static int totalWays(int n,int m) {
	//base cases
	//1. if(n=m)
	if(n==m) {
		return 2;
	}
	//2.if(n<m)
	if(n<m) {
		return 1;
	}
	// place tiles horizontally
	int horizontal=totalWays(n-1,m);
	//place tiles vertically
int vertical=	totalWays(n-m,m);
	//total no. of ways
	return horizontal+vertical;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4, m=2;
	System.out.println(	totalWays(n,m));

	}

}

//Time Complexity: - O(n*m)