class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int i = 0, j = 0; // Pointers used to traverse the characters of s and t respectively

        while(i < s.length() && j < t.length()){ // to iterate through the characters of both strings until either s or t is fully processed
            if(sArray[i] == tArray[j]){ // if the characters match
                i++; // move to the next letter
            }
            j++; // regardless of a match being found, we increment the pointer for j to check for the order
        }

        return i == sArray.length; //check if all characters of s have been found in the same order in t
    }
}