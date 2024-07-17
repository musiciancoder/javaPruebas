package mystreams.mapasconstreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapaStream {

    /*
    The principal thing to notice is that Streams are sequences of elements which can be easily obtained from a Collection.

Maps have a different structure, with a mapping from keys to values, without sequence. However, this doesn’t mean that we can’t convert a Map structure into different sequences which then allow us to work in a natural way with the Stream API.

Let’s see ways of obtaining different Collections from a Map, which we can then pivot into a Stream:
     */

    public static void main(String[] args) {
        Map<String, Integer> someMap = new HashMap<>();

   //     We can obtain a set of key-value pairs:

        Set<Map.Entry<String, Integer>> entries = someMap.entrySet();


   //     We can also get the key set associated with the Map:

        Set<String> keySet = someMap.keySet();

    //    Or we could work directly with the set of values:

        Collection<Integer> values = someMap.values();

 //       These each give us an entry point to process those collections by obtaining streams from them:

        Stream<Map.Entry<String, Integer>> entriesStream = entries.stream();
        Stream<Integer> valuesStream = values.stream();
        Stream<String> keysStream = keySet.stream();


       /* 3. Getting a Map‘s Keys Using Streams
        3.1. Input Data
        Let’s assume we have a Map:*/



        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

      /*  We are interested in finding the ISBN for the book titled “Effective Java.”

        3.2. Retrieving a Match
        Since the book title could not exist in our Map, we want to be able to indicate that there is no associated ISBN for it. We can use an Optional to express that:

        Let’s assume for this example that we are interested in any key for a book matching that title:*/

        Optional<String> optionalIsbn = books.entrySet().stream()
                .filter(e -> "Effective Java".equals(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        assertEquals("978-0134685991", optionalIsbn.get());

        System.out.println(optionalIsbn.get());

/*        Let’s analyze the code. First, we obtain the entrySet from the Map, as we saw previously.
                We only want to consider the entries with “Effective Java” as the title, so the first intermediate operation will be a filter.



        We’re not interested in the whole Map entry, but in the key of each entry. So the next chained intermediate operation does just that: it is a map operation that will generate a new stream as output, which will contain only the keys for the entries that matched the title we were looking for.

        As we only want one result, we can apply the findFirst() terminal operation, which will provide the initial value in the Stream as an Optional object.

        Let’s see a case in which a title does not exist:*/

        Optional<String> optionalIsbn2 = books.entrySet().stream()
                .filter(e -> "Non Existent Title".equals(e.getValue()))
                .map(Map.Entry::getKey).findFirst();

        assertEquals(false, optionalIsbn2.isPresent());

      /*  3.3. Retrieving Multiple Results
        Now let’s change the problem to see how we could deal with returning multiple results instead of one.

                To have multiple results returned, let’s add the following book to our Map:*/

        books.put("978-0321356680", "Effective Java: Second Edition");

     //   So now if we look for all books that start with “Effective Java,” we’ll get more than one result back:

        List<String> isbnCodes = books.entrySet().stream()
                .filter(e -> e.getValue().startsWith("Effective Java"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        assertTrue(isbnCodes.contains("978-0321356680"));
        assertTrue(isbnCodes.contains("978-0134685991"));

/*        What we have done in this case is to replace the filter condition to verify if the value in the Map starts with “Effective Java” instead of comparing for String equality.

        This time we collect the results, instead of just picking the first, and put the matches into a List.*/

    }
}
