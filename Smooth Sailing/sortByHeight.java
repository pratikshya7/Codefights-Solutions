/*
QUESTION: 

Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

SOLUTION: 
*/

int[] sortByHeight(int[] a) {
   ArrayList<Integer> sorted = new ArrayList<Integer>();
   for(int i = 0;i<a.length; i++) {	   
	   if(a[i] != -1) {	  
		   sorted.add(a[i]);
	   }
   }
   Collections.sort(sorted);
   
   int indexWithoutTree = 0;
   for(int i = 0; i<a.length;i++) {
	   if(a[i] != -1) {
		   a[i] = sorted.get(indexWithoutTree++);
	   }
   }
   return a;

}
