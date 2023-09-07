package recursionadvanced;
//Print permutations of a string :- "abc"-> abc, acb, bac, bca, cab, cba
public class RecursionA1 {
public static void printPer(String str, String permutation) {
	if(str.length()==0) {
		System.out.println(permutation);
		return;
	}
	for(int i=0;i<str.length();i++) {
		char currentChar=str.charAt(i);
		String newStr=str.substring(0,i)+str.substring(i+1);
		printPer(newStr,permutation+currentChar);
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		printPer(str,"");
	}

}
 
//Time Complexity:- O(n!)