package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

	public static int[] findEvenOdd(String input) {
	    String[] parts = input.split(",");
	    int[] result = new int[2];
	    for (String part : parts) {
	        int number = Integer.parseInt(part.trim());
	        if (number % 2 == 0) {
	            result[0]++;
	        } else {
	            result[1]++;
	        }
	    }
	    return result;
	}

}
