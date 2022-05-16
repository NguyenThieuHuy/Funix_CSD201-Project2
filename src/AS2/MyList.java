package AS2;
/**

* Generic version of the LinkedList class.

*

* @param <T> the type of the value

*/

public class MyList<T> {

 

    /**
   
     * Head node, default is null
   
     */
   
    Node<T> head;
   
    
   
    /**
   
     * Tail node, default is null
   
     */
   
    Node<T> tail;
   
    
   
    /**
   
     * Default constructor
   
     */
   
    public MyList() {
   
    }
   
    
   
    /**
   
     * Constructor with head and tail
   
     *
   
     * @param head Head node of this list
   
     * @param tail Tail node of this list
   
     */
   
    public MyList(Node head, Node tail) {
   
    }
   
    
   
    /**
   
     * Checking if this list is empty
   
     *
   
     * @return true if list is empty
   
     */
   
    public boolean isEmpty() {
        return false;
   
    }
   
    
   
    /**
   
     * Returning the length of this list
   
     *
   
     * @return The length of this list
   
     */
   
    public int length() {
        return 0;
   
    }
   
    
   
    /**
   
     * Insert an item to the head of this list
   
     *
   
     * @param item The item to be inserted
   
     */
   
    public void insertToHead(T item) {
   
    }
   
    
   
    /**
   
     * Insert an item at position to this list
   
     *
   
     * @param position The position of new item
   
     * @param item     The item to be inserted
   
     */
   
    public void insertAfterPosition(int position, T item) {
   
    }
   
    
   
    /**
   
     * Deleting the tail of this list
   
     */
   
    public void deleteTail() {
   
    }
   
    
   
    /**
   
     * Searching and deleting an item from this list by comparing the ID of items
   
     *
   
     * @param item The item to be deleted
   
     */
   
    public void deleteElement(T item) {
   
    }
   
    
   
    /**
   
     * Swaping two nodes [firstNode] and [secondNode]
   
     *
   
     * @param firstNode
   
     * @param secondNode
   
     */
   
    public void swap(Node<T> firstNode, Node<T> secondNode) {
   
    }
   
    
   
    /**
   
     * Deleting all items in the list
   
     */
   
    public void clear() {
   
    }
   
    
   
   }
