package com.example.javaCodingQuestion.mis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
		// Creating a HashSet using the Set interface
        Set<String> hashSet = new HashSet<>();

        // Adding Elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        System.out.println("HashSet after adding elements: " + hashSet);

        // Removing Elements
        hashSet.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + hashSet);

        // Clearing the Set
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);

        // Checking Size and Empty Status
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());

        // Adding elements again
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Checking Membership
        System.out.println("HashSet contains 'Apple'? " + hashSet.contains("Apple"));
        System.out.println("HashSet contains 'Grapes'? " + hashSet.contains("Grapes"));

        // Iterating Over Elements
        System.out.print("Iterating over HashSet: ");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Bulk Operations
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        System.out.println("HashSet contains all elements from list? " + hashSet.containsAll(list));

        hashSet.addAll(list);
        System.out.println("HashSet after adding all elements from list: " + hashSet);

        hashSet.removeAll(list);
        System.out.println("HashSet after removing all elements from list: " + hashSet);

        // Set Operations
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Banana");
        anotherSet.add("Grapes");

        hashSet.retainAll(anotherSet);
        System.out.println("HashSet after retaining elements present in anotherSet: " + hashSet);

        // Constructors and Cloning
        Set<String> clonedSet = new HashSet<>(hashSet);
        System.out.println("Cloned HashSet: " + clonedSet);

        // Hash Table Statistics
        System.out.println("Size of cloned HashSet: " + clonedSet.size());
	}
}

 class TreeSetExample {
    public static void main(String[] args) {
    	 // Create a TreeSet of integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(5);
        treeSet.addAll(Arrays.asList(1, 3, 7));

        // Ceiling and Floor elements
        System.out.println("Ceiling of 4: " + treeSet.ceiling(4)); // 5  	It returns the equal or closest greatest element 
        System.out.println("Floor of 4: " + treeSet.floor(4)); // 3 It returns the equal or closest least element

        // Comparator
        Comparator<? super Integer> comparator = treeSet.comparator();
        System.out.println("Comparator: " + comparator); // null (natural ordering)

        // Iterating through TreeSet
        System.out.println("Iterating through TreeSet:");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Descending iterator
        System.out.println("Descending Iterator:");
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        // Descending set
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println("Descending Set: " + descendingSet); // [7, 5, 3, 1]

        // Removing elements
        treeSet.remove(3);

        System.out.println("Poll First: " + treeSet.first()); // 1 retrieve the lowest(first) element.
        System.out.println("Poll Last: " + treeSet.last()); // 7 retrieve  the highest(last) element.
        
        // Poll first and last elements
        System.out.println("Poll First: " + treeSet.pollFirst()); // 1 etrieve and remove the lowest(first) element.
        System.out.println("Poll Last: " + treeSet.pollLast()); // 7 retrieve and remove the highest(last) element.
        
       

        // Spliterator
        Spliterator<Integer> spliterator = treeSet.spliterator();
        System.out.println("Spliterator characteristics: " + spliterator.characteristics()); // ORDERED, DISTINCT

        // Subset operations
        SortedSet<Integer> subset = treeSet.subSet(1, 7); 
        System.out.println("Subset from 1 to 7: " + subset); // [5] It returns a set of elements that lie between the given range

        NavigableSet<Integer> navigableSubset = treeSet.subSet(1, true, 5, true);
        System.out.println("Navigable Subset from 1 to 5 (inclusive): " + navigableSubset); // [5] It returns a set of elements that lie between the given range and excludes toElement.

        // Head set
        SortedSet<Integer> headSet = treeSet.headSet(5);
        System.out.println("Head Set less than 5: " + headSet); // [] It returns the group of elements that are less than

        NavigableSet<Integer> navigableHeadSet = treeSet.headSet(5, true);
        System.out.println("Navigable Head Set less than or equal to 5: " + navigableHeadSet); // [5] 	It returns the group of elements that are less than or equal to(if, inclusive is true) the specified element.

        // Tail set
        SortedSet<Integer> tailSet = treeSet.tailSet(5);
        System.out.println("Tail Set greater than or equal to 5: " + tailSet); // [5] It returns a set of elements that are greater than or equal 

        NavigableSet<Integer> navigableTailSet = treeSet.tailSet(5, false);
        System.out.println("Navigable Tail Set greater than 5: " + navigableTailSet); // [] It returns a set of elements that are greater than or equal to (if, inclusive is true) the specified element.

        // Contains
        boolean contains = treeSet.contains(5);
        System.out.println("Contains 5? " + contains); // true

        // Is empty
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("Is TreeSet empty? " + isEmpty); // false

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("After clearing, TreeSet is empty? " + treeSet.isEmpty()); // true
    }
}
