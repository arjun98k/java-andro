class Recursion {

	public static int SumNatural(int n){
		if (n == 1){
			return 1;
		}

		return n + SumNatural(n-1);
	}
	public static void main(String[] args){
		// 5 +4+3+2+1
		System.out.println(SumNatural(5));
	}
}