/*
Question: Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.

Solution:
*/

boolean checkPalindrome(String inputString) {
    StringBuilder  mystring = new StringBuilder();
    mystring.append(inputString);
    StringBuilder  x = mystring.reverse();
    String reverseString = x.toString();
    if(reverseString.equals(inputString)){
        return true;
    }
    else{
        return false;
    }
}

