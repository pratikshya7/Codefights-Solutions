/*
QUESTION: After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, and some of them are free, but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).

Example

For

matrix = [[0, 1, 1, 2], 
          [0, 5, 0, 0], 
          [2, 0, 3, 3]]
the output should be
matrixElementsSum(matrix) = 9.

example 1

There are several haunted rooms, so we'll disregard them as well as any rooms beneath them. Thus, the answer is 1 + 5 + 1 + 2 = 9.

SOLUTION:
*/

int matrixElementsSum(int[][] matrix) {
      int sum = 0;
    for (int col = 0; col< matrix[0].length; col ++) {
    	for (int row = 0; row < matrix.length; row++) {
    		if(matrix[row][col]==0) {
    			break;
    		}
    	 sum += matrix[row][col];
    	}
    }	
  return sum;

}
