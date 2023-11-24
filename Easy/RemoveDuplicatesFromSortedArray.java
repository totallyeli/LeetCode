public class RemoveDuplicatesFromSortedArray {
    public int lengthOfLastWord(String s) {
        // Trim leading and trailing whitespaces
        String strippedString = s.trim();

        // Split the string into an array using space as the delimiter
        String[] stringArray = strippedString.split(" ");

        // Get the last element of the array
        String lastElement = stringArray[stringArray.length - 1];

        // Return the length of the last word
        return lastElement.length();
    }
}