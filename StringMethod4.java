class StringMethod4 {
	public static void main(String[] args){
		String str1 = "   aditya    ";
		String str2 = "amey";
		// System.out.println(str1.equals(str2));
    System.out.println("hii");
    // substring method
    // System.out.println(str1.substring(1,3));
    // contains method
    System.out.println(str1.contains("di")); // true because di present in str1 Aditya

    // trim() remove start and space from string
    System.out.println(str1.trim());

    //String equalIgnoreCase(String anotherString)
    String Str3 = "Arjun";
    String Str4 = "ARJUN";
    System.out.println(Str3.equalsIgnoreCase(Str4));
    

	}
}
