/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author PC
 */
public class Basic {
    
    static void reverseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = sc.nextLine();
        String output = "";
        
        for(int i = 0; i <input.length();i++){
            output = input.charAt(i) + output;
        }        
        System.out.println("The reversed string is :"+output);
    }
    
    static void createStack(){
        
         /* stack = LIFO data structure. Last-In First-Out
                stores objects into a sort of "vertical tower"
                push() to add objects to the top
                pop() to remove objects from the top
  
   uses of stacks?
   1. undo/redo features in text editors
   2. moving back/forward through browser history
   3. backtracking algorithms (maze, file directories)
   4. calling functions (call stack)*/
         Stack<String> userStack = new Stack<String>();
        userStack.push("Username");
         userStack.push("Email");
        userStack.push("MobileNo");
        userStack.push("Address");
        userStack.push("Sex");       
       
        
        System.out.println( userStack.empty());
        System.out.println(userStack.size());
       System.out.println( userStack.peek());
        System.out.println(userStack.add("gender"));
           System.out.println(userStack.search("Sex"));
          System.out.println( userStack.lastElement());
         System.out.println( "userDetails: "+userStack);
         
         for (int i = 0; i < 1000000; i++) {
             userStack.push("Breath");
            
        }
         System.out.println("User Breaths"+ userStack);
    }
    
    static void createQueue(){
        // *****************************************************
		
		// Queue = FIFO data structure. First-In First-Out
		//		   A collection designed for holding elements prior to processing
		//		   Linear data structure
		
		//         enqueue = offer() 
		//         dequeue = poll()do not throw exceptions like dequeue
		
		// Where are queues useful?
		
		// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
		// 2. Printer Queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
                // Queue is an interface that is implemented by LinkedList and others
		
		// *****************************************************
		
		Queue<String> users = new LinkedList<String>();
		
		users.offer("Karen");
		users.offer("Chad");
		users.offer("Steve");
		users.offer("Harold");
		
		//System.out.println(users.isEmpty());
		//System.out.println(users.size());
		System.out.println(users.contains("Harold"));
		
		System.out.println(users.peek());
//		users.poll();
//		users.poll();
//		users.poll();
//		users.poll();		
//		users.poll();
//		users.poll();
//		users.poll();

                for(int i=0;i< 1000000;i++){
                    users.offer("newUser");
                }

		System.out.println(users);
    }
    
    static void createPriorityQueue(){
        //Priority Queue = A FIFO data structure that serves elements
    	//                             with the highest priorities first 
    	//				  before elements with lower priority
    	
    	//Strings in default order
//    	Queue<String> queue = new PriorityQueue<>();
    	
    	//Strings in reverse order
    	//Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
    	
//    	queue.offer("B");
//    	queue.offer("C");
//    	queue.offer("A");
//    	queue.offer("F");
//    	queue.offer("D");
//    	
//    	while(!queue.isEmpty()) {
//    		System.out.println(queue.poll());
//    	}
    Queue<Double> gps = new PriorityQueue<>();
//    Queue<Double> gps = new LinkedList<>();
    gps.offer(2.48);
    gps.offer(3.11);
    gps.offer(7.15);
    gps.offer(5.22);
    while(!gps.isEmpty()){
//        System.out.println(gps.element());
        Double gpsVal = gps.poll();
        System.out.println("The gps element includes "+gpsVal);
    }
    
    }
    
    static void createLinkedList(){
         // *****************************************************
  
  // LinkedList =  Nodes are in 2 parts (data + address)
  //                        Nodes are in non-consecutive memory locations
  //                        Elements are linked using pointers
            
  //    advantages?
  //    1. Dynamic Data Structure (allocates needed memory while running)
  //    2. Insertion and Deletion of Nodes is easy. O(1) 
  //    3. No/Low memory waste
  
  //    disadvantages?
  //    1. Greater memory usage (additional pointer)
  //    2. No random access of elements (no index [i])
  //    3. Accessing/searching elements is more time consuming. O(n)
  
  //    uses?
  //    1. implement Stacks/Queues
  //    2. GPS navigation
  //    3. music playlist
  //
  
  // *****************************************************

//LinkedList<String> linkedList = new LinkedList<String>();
		/*
		// LinkedList as a Stack
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop();
		*/
		// LinkedList as a Queue
//		linkedList.offer("A");
//		linkedList.offer("B");
//		linkedList.offer("C");
//		linkedList.offer("D");
//		linkedList.offer("F");
		//linkedList.poll();
		
		//linkedList.add(4, "E");
		//linkedList.remove("E");
		//System.out.println(linkedList.indexOf("F"));
		
		
		//System.out.println(linkedList.peekFirst());
		//System.out.println(linkedList.peekLast());
		//linkedList.addFirst("0");
		//linkedList.addLast("G");
		//String first = linkedList.removeFirst();
		//String last = linkedList.removeLast();
                
                LinkedList<String> items = new LinkedList<String>();// used as stack/queue
                items.add("iphone");
                items.add("Samsung A2");
                items.offer("Hp12");
                items.push("Apple Kindle");
		
		System.out.println(items);
    }
}
    
    
    

