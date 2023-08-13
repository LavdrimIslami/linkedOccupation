/* linkedList.java
this class will instantiate a linked list
last edited 6/14/23 by Lavdrim Islami
*/

import java.io.FileNotFoundException;

public class linkedList {

    //set variables
    private ListNode head = null; //head doesn't point to anything, new list
    private ListNode tail = null;//tail doesn't point to anything, new list
    private int size = 0;

    //instantiates a linked list
    public linkedList(){
        this.head = head;
        this.tail = tail;
        this.size = size;

    }

    public void append(Occupation Object) throws FileNotFoundException { //if statement for if the list has a size of 0
       if(size == 0){
           ListNode newObject = new ListNode(Object, null); //creates new listnode object with occupation object
           this.head = newObject;
           this.tail = newObject;
           this.size++;
       }//end if
       else{ //adding to end of the list if >0
           ListNode newObject = new ListNode(Object, null);
           this.tail.setNext(newObject); //sets last node next to the new node
           this.tail = newObject; //set the tail to the new node
           this.size++;
       }//end else
    }

    //accessor for size of the list
    public int getSize(){
        return this.size;
    }

    //return the head of linked list
    public ListNode getHead() {
        return this.head;
    }
}
