/*
QUESTION: Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

SOLUTION:
*/

function almostIncreasingSequence(sequence) {
    var count =0;
	for( var i=0; i< sequence.length; i++) 
		if(sequence[i] <= sequence[i-1]){
			count++;
			if(count > 1)
				return false;
			if(sequence[i] <= sequence[i-2] && sequence[i+1]<=sequence[i-1])
				return false;
		}
	return true;
}
