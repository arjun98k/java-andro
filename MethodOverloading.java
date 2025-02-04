class MethodOverloading {

	private int Sum(int a , int b){
		return a+b;
	}

	private int Sum(int a , int b , int c){
		return a+b+c;
	}

	private Double Sum(Double a, Double b){
		return a+b;
	}
	public static void main(String[] args){
      MethodOverloading a1 = new MethodOverloading();
      System.out.println(a1.Sum(11,12));
      System.out.println(a1.Sum(11.1,12.1));
      System.out.println(a1.Sum(11,12,13));
	}
}