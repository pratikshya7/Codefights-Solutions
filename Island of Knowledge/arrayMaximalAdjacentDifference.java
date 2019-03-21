/*
QUESTION: 
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.

SOLUTION:
*/
int arrayMaximalAdjacentDifference(int[] inputArray) {
    int max = 0;
		for(int i = 1; i<inputArray.length;i++) {
			int diff = Math.abs(inputArray[i-1]-inputArray[i]);
			if(diff > max) {
				max = diff;
			}
		}
    return max;
}
