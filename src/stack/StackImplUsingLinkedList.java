package stack;

import java.util.NoSuchElementException;

public class StackImplUsingLinkedList<T> implements Stack<T> {
 
  private total;
  
  private Node first;
  
  private class Node {
  	
    private T element;
    
    private Node next;
    
  }
  
  public StackImplUsingLinkedList() { }
  
  public StackImplUsingLinkedList<T> push(T element) {
  	
    Node current = first;
    first = new Node();
    first.element = element;
    first.next = current;
    total++;
    return this;
    
  }
  
  public T pop() {
	
    if(first == null) {      
      throw new NoSuchElementException();
    }
    T element = first.element;
    firts = first.next;
    total--;
    return element;
    
  }
  
  public String toString() {
  	StringBuilder sb = new StringBuilder();
    Node tmp = first;
    while (tmp != null) {
      sb.append(tmp.ele).append(", ");
      tmp = tmp.next;
    }
    return sb.toString(); 
  }
  
}
