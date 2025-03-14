public class StringMethod1 {
    public static void main(String[] args) {
        String str1 = "Arjun   ";

//         1. charAt(int index)
// Description: Returns the character at the specified index of the string.
// Usage: To access a specific character in a string.

        char ak = str1.charAt(4);
        // System.out.println(ak);

//         2. length()
// Description: Returns the length (number of characters) of the string.
// Usage: To find how many characters are in a string.
        
        //    System.out.println(str1.length());

//            3. substring(int beginIndex, int endIndex)
// Description: Returns a new string that is a substring of the original string, starting at beginIndex and ending before endIndex.
// Usage: To extract a part of the string.
            
// System.out.println(str1.substring(1, 3));
// 6. trim()

// Description: Removes leading and trailing whitespace from the string.
// Usage: To clean up spaces from the beginning and end of the string.
    //  System.out.println(str1.trim());

//      7. replace(char oldChar, char newChar)
// Description: Replaces all occurrences of oldChar with newChar in the string.
// Usage: To replace specific characters in a string.

   System.out.println(str1.replace('A', 'k'));

    }
}
