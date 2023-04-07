import com.gs.collections.api.bag.MutableBag;
import com.gs.collections.impl.bag.mutable.HashBag;

import java.util.Arrays;

//
public class GsMutableBagTest {

    public static void main(String[] args) {
        // Parse text to separate words
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Create Multiset
        MutableBag<String>  bag = HashBag.newBag(Arrays.asList(INPUT_TEXT.split(" ")));

        // Print count words
        System.out.println(bag); // print [Hi, World!, World!, Hello, Hello, All!]- in random orders
        // Print all unique words
        System.out.println(bag.toSet());    // print [Hi, Hello, World!, All!] - in random orders

        // Print count occurrences of words
        System.out.println("Hello = " + bag.occurrencesOf("Hello"));    // print 2
        System.out.println("World = " + bag.occurrencesOf("World!"));    // print 2
        System.out.println("All = " + bag.occurrencesOf("All!"));    // print 1
        System.out.println("Hi = " + bag.occurrencesOf("Hi"));    // print 1
        System.out.println("Empty = " + bag.occurrencesOf("Empty"));    // print 0

        // Print count all words
        System.out.println(bag.size());    //print 6

        // Print count unique words
        System.out.println(bag.toSet().size());    //print 4
    }
}
