/*
QUESTIONS:

Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.

SOLUTION: 
*/

boolean isLucky(int n) {
String s = Integer.toString(n);
char[] c = Integer.toString(n).toCharArray();
int halfSumLen = c.length/2;
int sumFirst = 0;
int sumSecond = 0;
for(int i = 0, j = halfSumLen; i< halfSumLen; i++, j++ ) {
	sumFirst += Character.getNumericValue(c[i]);
	sumSecond += Character.getNumericValue(c[j]);
  }
  return (sumFirst == sumSecond);
}
