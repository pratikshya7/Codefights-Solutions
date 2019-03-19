/*

QUESTION:
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
 SOLUTION: 
 
*/
String[] addBorder(String[] picture) {
int arrayLength = picture.length + 2;
int stringLength = picture[0].length();
	
	String[] answer = new String[arrayLength]; 
	String border1 = "";
	int index = 0;

  for(int i = 0; i<stringLength; i++) {
     border1 += "*";
    }
    
  for(int i = 0; i<arrayLength;i++) {
    	  if(i == 0) {
    		 answer[arrayLength-1] = "*" + border1 + "*";
    		 answer[0] = "*" + border1 + "*";
    	 }
    	  else if(i == arrayLength-1) {
     		 answer[arrayLength-1] = "*" + border1 + "*";

    	  }
    	  else {
     		 answer[i] = "*" + picture[index++] + "*";
     	 }
     }
 return answer;
}
