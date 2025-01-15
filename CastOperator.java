class CastOperator{
	public static void main(String[] args){
		byte a = 98;
		// a = a + 5  explicite casting will give
		// will give error
		a = (byte)( a + 5); // manual casting
		// System.out.println(a);

        // compound addition
		byte b = 100;
		b += 5; // implicite direct cast will allowed
		// System.out.println(b);
      
      int z = 1;
      int x = z + ++z;
      // 1 + 1+1
      System.out.println(x);


	}
}