package main.java;

public class BinarySearchSortedArray {
	
	boolean binarySearchAlt(int[] arrayNumbers, int startPositionSearch, 
			int endPositionSearch, int numberToSearch) {
		
		
		if (endPositionSearch >= startPositionSearch) {
			
			int positionIndex = startPositionSearch + (endPositionSearch - startPositionSearch)  / 2;
			
			if(arrayNumbers[positionIndex] == numberToSearch) {
				return true;
			}
			
			if (arrayNumbers[positionIndex] > numberToSearch) {
				return binarySearchAlt(arrayNumbers,  startPositionSearch, 
						positionIndex - 1,  numberToSearch);
			}
			
			
				return binarySearchAlt(arrayNumbers,  positionIndex + 1, 
						 endPositionSearch,  numberToSearch);
			
		}
	
		return false;
	}
	
	
	
    // Driver method to test above
    public static void main(String args[])
    {
    	BinarySearchSortedArray ob = new BinarySearchSortedArray();
       int arr2[] = { 2, 3, 4, 10, 40,45,50,54,67 };
       int n2 = arr2.length;
       boolean isP =  ob.binarySearchAlt(arr2, 0, n2 - 1, 54);
       
      System.out.println("Alternative way result: " + isP);
    }

}
