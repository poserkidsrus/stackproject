
/**
 * Write a description of class StackCopy here.
 *
 * @Keilbarracliffe
 * @11/20/22
 */
import java.util.Stack;
public class StackCopy<E>
{
    private E element;
    // instance variables - replace the example below with your own
    /**
	 * Make an identical copy of a Stack.
	 * post-condition: s is the same as it was before the method was called.
	 * @param s The Stack to copy.
	 * @return An identical copy of the Stack s.
	 */
    
    /**
     * Constructor for objects of class StackCopy
     */
    public StackCopy()
    {
    }




    // (1) Complete this method.  Although Java's Stack class provides methods
    //     for access by an index, you are not allowed to use those methods in
    //     this lab assignment.  You are also not allowed to use the clone method
    //     of Java's Stack class.  You are allowed to use only the following
    //     methods of Java's Stack class: empty, peek, pop, and push (and also 
    //     the constructor since you will need to construct a couple Stacks).
    public  <E> Stack<E> copy(Stack<E> s)
    {
        // put your code here
        Stack<E> copy = new Stack<E>();
        Stack<E> temp = new Stack<E>();
        
        
        while(!s.empty())
        {
            E element = s.pop();
            temp.push(element);
        }
        while(!temp.empty())
        {
            E element = (E) temp.pop();
            copy.push(element);
            s.push(element);
        }
        return copy;
    }
    //(2) Complete this method.  Although Java's Stack class provides methods
    //     for access by an index, you are not allowed to use those methods in
    //     this lab assignment.  You are also not allowed to use the clone method
    //     of Java's Stack class.  You are allowed to use only the following
    //     methods of Java's Stack class: empty, peek, pop, and push (and also 
    //     the constructor since you will need to construct a couple Stacks).
		
    // Stack Reverse Copy Algorithm: Assumes the Stack to copy is named s 
    //(as it is in the parameter of this method.
    public <E> Stack<E> reverseCopy(Stack<E> s)
    {
        Stack<E> reverse = new Stack<E>();
        Stack<E> temp = new Stack<E>();
        while(!s.empty())
        {
            E element = (E) s.pop();
            temp.push(element);
            reverse.push(element);
        }
        while(!temp.empty())
        {
            E element = temp.pop();
            s.push(element);
        }
        return reverse;
    }
}
