public class RemoveDuplicatesFromSortedArray {
    public int lengthOfLastWord(String s) {
        String strippedString = s.trim();

        String[] stringArray = strippedString.split(" ");

        String lastElement = stringArray[stringArray.length - 1];

        return lastElement.length();
    }
}