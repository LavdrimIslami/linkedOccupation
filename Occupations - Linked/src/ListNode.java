/* ListNode.java
this class instantiates the listnode
Last edited 6/14/23 by Lavdrim Islami
 */

//import libraries
import java.io.*;
import java.util.*;

public class ListNode {

    //attributes of listnode
    private Occupation data;
    private ListNode next;


    public ListNode(Occupation data, ListNode next) { //create node with data and a node that it points to

        this.data = data;
        this.next = next;

    }

    //accessor methods
    public Occupation getData() {
        return this.data;
    }

    public ListNode getNext() {
       return this.next;
    }

    //mutator methods
    public void setData(Occupation data){
        this.data = data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
