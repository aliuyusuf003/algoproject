/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;
import java.util.LinkedList;
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
    
    
}
