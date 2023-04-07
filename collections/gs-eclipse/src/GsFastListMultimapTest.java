import com.gs.collections.api.multimap.list.MutableListMultimap;
import com.gs.collections.impl.multimap.list.FastListMultimap;

import java.util.Arrays;
import java.util.List;

//
public class GsFastListMultimapTest {

    // Task: parser string with text and show all indexes of all words
    public static void main(String[] args) {
        String INPUT_TEXT = "Hello World! Hello All! Hi World!";
        // Parse text to words and index
        List<String> words = Arrays.asList(INPUT_TEXT.split(" "));
        // Create Multimap
        MutableListMultimap<String, Integer> multiMap = new FastListMultimap<String, Integer>();


        // Fill Multimap
        int i = 0;
        for(String word: words) {
            multiMap.put(word, i);
            i++;
        }

        // Print all words
        System.out.println(multiMap); // print {Hi=[4], World!=[1, 5], Hello=[0, 2], All!=[3]}- in random orders
        // Print all unique words
        System.out.println(multiMap.keysView());    // print [Hi, Hello, World!, All!] - in random orders

        // Print all indexes
        System.out.println("Hello = " + multiMap.get("Hello"));    // print [0, 2]
        System.out.println("World = " + multiMap.get("World!"));    // print [1, 5]
        System.out.println("All = " + multiMap.get("All!"));    // print [3]
        System.out.println("Hi = " + multiMap.get("Hi"));    // print [4]
        System.out.println("Empty = " + multiMap.get("Empty"));    // print []

        // Print count all words
        System.out.println(multiMap.size());    //print 6

        // Print count all unique words
        System.out.println(multiMap.keysView().size()); //print 4
    }
}
