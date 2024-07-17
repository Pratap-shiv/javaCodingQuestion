package com.example.javaCodingQuestion.mis;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

 class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		System.out.println("Add element by add methods ");
		queue.add("John"); /*Add the element in  this queue and return true if success otherwise throw exception*/
		queue.add("Jane");
		queue.add("Jack");
		
		System.out.println("Add element by offer methods ");
		queue.offer("prashant"); /*Add the element in  this queue and return true if success otherwise return false and handle the exception*/
		
		String poll = queue.poll(); /*Removes the head of this queue and return null if queue is null */
		System.out.println("Removed Element  by Poll " + poll); 
		
		String peek = queue.peek(); /*Retrieve but not remove the head of this queue and return null if queue is null */
		System.out.println("Head of the queue  by peek " + peek); 
		
		String element =queue.element();  /*Retrieve but not remove the head of this queue and give error if queue is null */
		System.out.println("Head of the queue  by element " + element); /*Removes the head of this queue and give error if queue is null */
		
		String remove =queue.remove();
		System.out.println("Removed Element  by remove " + remove); /*Removes the head of this queue and give error if queue is null */
		
		
		Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);

        boolean containsElement = pq.contains(20);
        System.out.println("Contains 20? " + containsElement); // Return true if element exist otherwise false

        pq.remove(30); // Removes the element if exist and return true otherwise false
        System.out.println("PriorityQueue after removal: " + pq); // Output: PriorityQueue after removal: [10, 15]

        pq.clear(); // Clears all elements from the queue
        System.out.println("PriorityQueue after clear: " + pq); 

        System.out.println("Size of PriorityQueue: " + pq.size()); // return the size of the queue

        System.out.println("Is PriorityQueue empty? " + pq.isEmpty()); // return true if queue is empty otherwise false

        pq.add(5);
        pq.add(12);
        pq.add(8);
        System.out.println("PriorityQueue: " + pq); // Output: PriorityQueue: [5, 12, 8]

        Object[] array = pq.toArray();
        System.out.println("Array representation of PriorityQueue: " + Arrays.toString(array)); // Output: Array representation of PriorityQueue: [5, 12, 8]

        // Example of addAll(Collection<? extends E> c)
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(20);
        pq.addAll(list);
        System.out.println("PriorityQueue after adding collection: " + pq); // Output: PriorityQueue after adding collection: [5, 12, 8, 15, 20]

        // Example of iterator()
        Iterator<Integer> iterator = pq.iterator();
        System.out.print("PriorityQueue elements using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // Output: PriorityQueue elements using iterator: 5 12 8 15 20
        }
        System.out.println();
		
	}

}


 class DequeExample {
    public static void main(String[] args) {
        // Creating an ArrayDeque to demonstrate Deque methods
        Deque<String> deque = new ArrayDeque<>();
        
        // Adding elements using Deque methods
        deque.addFirst("First");
        deque.addLast("Last");
        deque.offerFirst("Offered First");
        deque.offerLast("Offered Last");

        System.out.println("Deque after adding elements: " + deque);

        // Removing elements using Queue methods
        String removedElement = deque.remove();
        System.out.println("Removed element using remove(): " + removedElement);

        String polledElement = deque.poll();
        System.out.println("Polled element using poll(): " + polledElement);

        System.out.println("Deque after removing elements using Queue methods: " + deque);

        // Inspecting elements using Deque methods
        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();
        String peekFirstElement = deque.peekFirst();
        String peekLastElement = deque.peekLast();

        System.out.println("First element using getFirst(): " + firstElement);
        System.out.println("Last element using getLast(): " + lastElement);
        System.out.println("Peek first element using peekFirst(): " + peekFirstElement);
        System.out.println("Peek last element using peekLast(): " + peekLastElement);

        // Stack operations using Deque methods
        deque.push("Pushed Element");
        String poppedElement = deque.pop();
        System.out.println("Popped element using pop(): " + poppedElement);

        // Queue operations using Deque methods
        deque.offer("Offered Element");
        String removedOfferedElement = deque.remove();
        System.out.println("Removed offered element using remove(): " + removedOfferedElement);

        // Collection methods
        deque.addAll(Arrays.asList("One", "Two", "Three"));
        System.out.println("Deque after adding elements using addAll(): " + deque);

        // Iterator and descendingIterator
        Iterator<String> iterator = deque.iterator();
        System.out.println("Iterating over deque:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<String> descendingIterator = deque.descendingIterator();
        System.out.println("Iterating over deque in reverse:");
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        // Miscellaneous methods
        Deque<String> clonedDeque = ((ArrayDeque<String>) deque).clone();
        System.out.println("Cloned deque: " + clonedDeque);

        System.out.println("Deque size: " + deque.size());
        System.out.println("Deque contains 'First': " + deque.contains("First"));
        System.out.println("Is deque empty? " + deque.isEmpty());

        // Removing elements
        deque.removeFirstOccurrence("One");
        deque.removeLastOccurrence("Three");
        System.out.println("Deque after removing elements: " + deque);

        // Clearing the deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);
    }
}
