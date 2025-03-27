package Collections;

// Java Program to remove duplicates entries
// from an Array using TreeSet

// Importing Arrays and TreeSet class from
// java.util package
import java.util.Arrays;
import java.util.TreeSet;

// Class to remove duplicates
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Input custom entries in an array
        // String type
        // Custom inputs
        String[] input
                = new String[] { "Hello", "hi",	 "Wow",
                "cute", "thanks", "hi",
                "Aww",	 "cute", "baby",
                "beloved", "Aww" };

        // Converting Array to String and printing it
        System.out.print(
                "Initial String Array(Containing Duplicates) : "
                        + (Arrays.toString(input)));

        // Creating an object of TreeSet
        TreeSet<String> dupliCheckr = new TreeSet<String>();

        // Adding array elements in TreeSet

        // For added elements in TreeSet
        for (String element : input) {

            // Displaying duplicate entries
            if (!dupliCheckr.add(element)) {

                // Print and display elements in an array
                // which are duplicated.
                System.out.println(
                        "Duplicate Data entered : " + element);
            }
        }

        // Next line
        System.out.println();

        // Print and display elements in an array
        // after removing duplicates from it.
        System.out.println(
                "TreeSet(After Removing Duplicates) : "
                        + dupliCheckr);


    }
}

