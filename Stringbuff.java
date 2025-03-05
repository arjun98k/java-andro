class Stringbuff{
	public static void main(String[] args){
		StringBuilder str1 = new StringBuilder("Arjun");
		System.out.println(str1);
		for (int i = 0; i < 10; i++) {
			str1.append('a');

		}

		System.out.println(str1);
		
		
	}
}