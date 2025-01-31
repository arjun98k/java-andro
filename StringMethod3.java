 class StringMethod3 {
	public static void main(String[] args){
		String str1 = "aditya";
		String str2 = "adia";
	
		System.out.println(str1.compareTo(str2));

// 		The result of `19` is due to the **lexicographical comparison** between the two strings, `str1` and `str2`, using the `compareTo()` method in Java.

// ### How `compareTo()` Works:
// 1. `compareTo()` compares strings **character by character** from left to right based on their **Unicode values**.
// 2. It stops as soon as a mismatch is found and returns the difference between the Unicode values of the mismatched characters.
// 3. If one string is a prefix of the other, the method returns the difference in their lengths.

// ### Breaking Down the Example:
// - **`str1 = "aditya"`**  
//   Unicode values of characters:  
//   `'a' = 97`, `'d' = 100`, `'i' = 105`, `'t' = 116`, `'y' = 121`, `'a' = 97`

// - **`str2 = "adia"`**  
//   Unicode values of characters:  
//   `'a' = 97`, `'d' = 100`, `'i' = 105`, `'a' = 97`

// #### Step-by-Step Comparison:
// - Compare first characters:  
//   `'a'` vs `'a'` → Equal, move to next characters.

// - Compare second characters:  
//   `'d'` vs `'d'` → Equal, move to next characters.

// - Compare third characters:  
//   `'i'` vs `'i'` → Equal, move to next characters.

// - Compare fourth characters:  
//   `'t'` (Unicode 116) vs `'a'` (Unicode 97) → Mismatch found.  

// #### Result:
// The difference between the Unicode values is:  
// `116 - 97 = 19`

// The method stops here and returns `19`.

// ### Summary:
// The output `19` indicates that the first mismatched character in `str1` is **19 Unicode points greater** than the corresponding character in `str2`.

	}
}