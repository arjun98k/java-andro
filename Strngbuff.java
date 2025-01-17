public class Strngbuff {
	public static void main(String[] args){
		StringBuffer s1 = new StringBuffer("Arjun");
		// Stringbuffer class append
		s1.append("kandekar");
		// System.out.println(s1);

		// StringBuffer insert() Method
		// s1.insert(0,"boss ");
		// System.out.println(s1);

		//StringBuffer replace() Method
		s1.replace(0,5,"akash");
		// System.out.println(s1);

		// Stringbuffer reverse() method
		System.out.println(s1.reverse());

		
	}
}