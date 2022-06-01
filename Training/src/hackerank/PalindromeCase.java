package hackerank;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCase {
    // Write your code here.
    //instance property for queue and stack
    LinkedList<Object> queue;
    Stack<Object> stack;
    
    // constructor
    public PalindromeCase(){
        this.queue = new LinkedList<>();
        this.stack = new Stack<>();
    }
    
    // methods
    public void enqueueCharacter(char c){
        queue.addLast(c);
    }
    
    public void pushCharacter(char c){
        stack.push(c);
    }
    
    public char dequeueCharacter(){
        return (char) queue.remove(0);
    }
    
    public char popCharacter(){
        return (char) stack.pop();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        PalindromeCase p = new PalindromeCase();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
