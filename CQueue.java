/**
 * CQueue.java using CCell.java
 * Queued data structure
 * 
 * @author: JohnyStudent
 * @date: 18 Mar 2021
 * @version: v1.0
 */

public class CQueue {
    private CCell front;
    private CCell back;
    private int qnt;

    /**
     * Constructing function of the queue structure.
     * Creates the "head cell" pointed from the front and back.
     */
    public CQueue ( ) {
        front = new CCell( );
        back = front;
    }

    /**
     * To queue a new element in the queue.
     * @param itemValue (Object)
     */
    public void toQueue (Object itemValue) {
        back.next = new CCell(itemValue);
        back = back.next;
        qnt++;
    }

    /**
     * Method to return the value of the first item in the queue.
     * @return resp (Object)
     */
    public Object firstQueue ( ) {
        Object resp = null;
        if (front != back) {
            resp = front.next.item;
        }
        return resp;
    }

    /**
     * Method to return the value of the last item in the queue.
     * @return resp (Object)
     */
    public Object lastQueue ( ) {
        Object resp = null;
        if (front != back) {
            resp = back.item;
        }
        return resp;
    }

    /**
     * Method to remove and return the value of the first item in the queue.
     * @return resp (Object)
     */
    public Object deQueue ( ) {
        Object resp = null;
        if (front != back) {
            resp = front.next.item;
            front = front.next;
            qnt--;
        }
        return resp;
    }

    /**
     * Method to check if a X value is in the queue.
     * @param x (Object)
     * @return (boolean)
     */
    public boolean inQueue (Object x) {
        boolean resp = false;
        for (CCell aux = front.next; aux != null; aux = aux.next) {
            if (aux.item.equals(x))
                resp = true;
        }
        return resp;
    }

    /**
     * Method to return the number of elements in the queue.
     * @return (int)
     */
    public int quantity ( ) {
        return qnt;
    }

    /**
     * Method to check if the queue is empty.
     * @return (boolean)
     */
    public boolean isEmpty ( ) {
        return (front == back);
    }

    /**
     * Method to print on the screen all the queue.
     */
    public void showQueue ( ) {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
        } else {
            System.out.print("Queue:");
            for (CCell aux = front.next; aux != null; aux = aux.next) {
                System.out.print("[" + aux.item + "]");
            }
            System.out.println("");
        }
    }

}
