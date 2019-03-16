/*
QUESTION : Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

SOLUTION :
*/

function allLongestStrings(inputArray) {
    var max = 0;
    for(var i = 0;i<inputArray.length;i++){
        if(max < inputArray[i].length){
            max = inputArray[i].length;
        }
    }
        return inputArray.filter(inputArray => inputArray.length == max);
       
}
