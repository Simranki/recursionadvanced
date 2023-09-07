package recursionadvanced;
// Qs. Find no. of ways in which you can invite n people to your part, single or in pairs
public class RecursionA4 {
public static int guestCall(int n) {
	if(n<=1) {
		return 1;
	}
	
	//Single 
	int single=guestCall(n-1);
	//In pairs
	int pair=(n-1)*guestCall(n-2);
	//total no. of ways
	return single+pair;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
System.out.println(guestCall(n));
	}

}
