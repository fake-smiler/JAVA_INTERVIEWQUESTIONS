/*public class Virdhi {
	public static void main(String[]args) {
		String[] arr = {"a","b","c","a","b","c","d","e"};
		String[] freq = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
			String no = arr[i];
			int count = 1;
			for(int j = i + 1; j < arr.length; j++) {                //0 0 0 0 0 0 0 0  
				if(no == arr[j]) {                                      //a b c a b c d e 
					count++;
					freq[j] = -1;
				}
			}
			if(freq[i] != -1) {
				freq[i] = count;
			}

		}

		int countofDuplicate = 0;
		for(int i = 0; i<freq.length; i++) {
			if(freq[i] != -1) {
				System.out.println(arr[i] + " appeard " + freq[i] + "times ");
			}
		}

	}
}
*/






import java.util.HashMap;
import java.util.Map;

public class Virdhi {


	public static void main(String[] args) {
        String[] inputArray = {"a", "b", "c", "a", "b", "c", "a", "e"};
        printOddDuplicateCounts(inputArray);
    }

    public static void printOddDuplicateCounts(String[] arr) {
        // Initialize a HashMap to store the count of each string
        HashMap<String, Integer> duplicateCounts = new HashMap<String, Integer>();
        
        // Loop through the array of strings
        for (String item : arr) {
        	//System.out.println(item);
        	//System.out.println(duplicateCounts.keySet());
        	//System.out.println(duplicateCounts.values());
            // If the string is already present in the HashMap, increment its count
            if (duplicateCounts.containsKey(item)) {           // return boolean value true or false
                int count = duplicateCounts.get(item);
                duplicateCounts.put(item, count + 1);
            } else {
                // If the string is not present, add it to the HashMap with count 1
                duplicateCounts.put(item, 1);
            }
        }

        // Print the strings with odd counts
        for (Map.Entry<String, Integer> entry : duplicateCounts.entrySet()) {
            //System.out.println(entry);
            String item = entry.getKey();
            int count = entry.getValue();
            if (count % 2 != 0) {
                System.out.println("Count of duplicate value of : " + item + " : " + count + " odd number ");
            }
        }
    }
}














//Javascript






/*function printOddDuplicateCounts(arr) {
  // Create an object to store the count of each string
  const duplicateCounts = {};

  // Loop through the array of strings
  for (const item of arr) {
    // If the string is already present in the object, increment its count
    if (duplicateCounts[item]) {
      duplicateCounts[item]++;
    } else {
      // If the string is not present, add it to the object with count 1
      duplicateCounts[item] = 1;
    }
  }

  // Print the strings with odd counts
  for (const item in duplicateCounts) {
    const count = duplicateCounts[item];
    if (count % 2 !== 0) {
      console.log(`${item}: ${count}`);
    }
  }
}

const inputArray = ["a", "b", "c", "a", "b", "c", "e", "f"];
printOddDuplicateCounts(inputArray);
*/



/*In this JavaScript code, we use an object (duplicateCounts) to store the count of each string. The logic to find the duplicate counts and print the strings with odd counts is similar to the Python and Java versions. The function printOddDuplicateCounts first calculates the counts and then iterates over the object's properties to print the strings with odd counts.
User*/











 