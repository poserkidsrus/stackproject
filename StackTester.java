
/**
 * Write a description of class StackTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Stack;
public class StackTester
{
  public static void main(String[] args)
{
    
    Stack<Integer> s = new Stack<Integer>();
    StackCopy tester = new StackCopy();
    s.push(5);
    s.push(7);
    s.push(10);
    s.push(8);
    s.push(9);
    
    Stack<Integer> copy = tester.copy(s);
    System.out.println("Original s: ");
    for(Integer i : s)
    {
        System.out.println(i);
    }
    
    System.out.println("Copy of Stack s: ");
    for(Integer i : copy)
    {
        System.out.println(i);
    }
    Stack<Integer> reversecopy = tester.reverseCopy(s);
    System.out.println("Original s: ");
    for(Integer i : s)
    {
        System.out.println(i);
    }
    System.out.println("Reverse copy of Stack s: ");
    for(Integer i : reversecopy)
    {
        System.out.println(i);
    }
}
}