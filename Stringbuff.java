class Stringbuff{
	public static void main(String[] args){
		StringBuilder str1 = new StringBuilder("Arjun");
		System.out.println(str1);
		for (int i = 0; i < 10; i++) {
			str1.append('a');

		}

		System.out.println(str1);
		StringBuilder str2 = new StringBuilder("aditya");
		System.out.println(str2.append(" Kandekar"));
		System.out.println(str2.delete(6, 15));
		System.out.println(str2);

		// System.out.println(str2.reverse());
		System.out.println(str2.insert(6," jadhav" ));
		
		
	}
}