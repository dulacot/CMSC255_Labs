package Lab8;

public class Array {
    public static void main(String[] args) {
        // Step 1: Go to Run à Edit Configurations
        // Step 2: Go to Application, you might need to use the + key to find it, and add the program arguments needed.
        // This will allow that string to be entered into the program when it is run. This string will be stored in the String[] args array in the 0 position.
        // Use this inputted String and the method .split(",") to create an array of String objects called tokens.
        String[] tokens = args[0].split(",");

        // Create another String array called customerName. This array will have eight String objects.
        String[] customerName = new String[8];

        // Create a for loop to copy each element in the tokens array into the customerName array.
        // At this point the last two positions in the tokens array will be null.
        for (int i = 0; i < tokens.length; i++) {
            customerName[i] = tokens[i];
        }

        // Display the names within the array
        displayNames(customerName);

        // Move the existing elements from indices 4 and 5 to indices 6 and 7 respectively.
        // You can then add the Strings “Rick” and “Jessica” into index 4, and 5, respectively.
        customerName[6] = customerName[4];
        customerName[7] = customerName[5];
        customerName[4] = "Rick";
        customerName[5] = "Jessica";

        // Display the names within the array
        displayNames(customerName);

        // Reverse the elements in the array
        String[] reversedArray = reverseNames(customerName);

        // Display the names within the array that was returned from the reverseNames method
        displayNames(reversedArray);

        // Reverse the elements in the customerNames array without creating a new array
        reverseNames2(customerName);

        // Display the names within the array
        displayNames(customerName);

        // Remove all instances of "Rick" from the array
        for (int i = 0; i < customerName.length; i++) {
            if (customerName[i] != null && customerName[i].equals("Rick")) {
                for (int j = i; j < customerName.length - 1; j++) {
                    customerName[j] = customerName[j + 1];
                }
                customerName[customerName.length - 1] = null;
                i--;
            }
        }

        // Display the names within the array
        displayNames(customerName);
    }

    // Method to display the names within the array
    public static void displayNames(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    // Method to reverse the elements in the array and return a new array with the elements reversed
    public static String[] reverseNames(String[] names) {
        String[] reversedArray = new String[names.length];
        int index = 0;
        for (int i = names.length - 1; i >= 0; i--) {
            reversedArray[index] = names[i];
            index++;
        }
        return reversedArray;
    }

    // Method to reverse the elements in the array without creating a new array
    public static void reverseNames2(String[] names) {
        for (int i = 0; i < names.length / 2; i++) {
            String temp = names[i];
        }
    }
}

// What is displayed for the last two array elements?
// The last two array elements are displayed as null.

// Why is it that value?
// The last two positions in the tokens array were null and were copied into the customerName array.

// Are all instances of “Rick” removed correctly from the array?
// No, there is still one "Rick" remaining.

// Why or why not? Can you explain what you observe in your code? Why do you still have one “Rick” or how did you adjust your algorithm to not have a remaining “Rick”?
// The code only shifts the elements up once, so there will still be a "Rick" remaining in the array. To remove all instances of "Rick", we need to check the entire array for "Rick" after each shift. This can be done using a while loop instead of a for loop. See the adjusted code below.

    // Step 9 (adjusted)
//    int i = 0;
//while (i < customerName.length) {
//        if (customerName[i] != null && customerName[i].equals
