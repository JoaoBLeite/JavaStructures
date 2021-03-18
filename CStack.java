/**
 * CStack.java using CCell.java
 * Stacked data structure
 * 
 * @author: JohnyStudent
 * @date: 18 Mar 2021
 * @version: v1.0
 */

public class CStack {
    private CCell top = null;
    private int qnt;

    /**
     * Constructing function of the stack structure.
     */
    public CStack ( ) {
        // nothing
    }

    /**
     * To stack a new element in the stack.
     * @param itemValue (Object)
     */
    public void stackUp (Object itemValue) {
        top = new CCell (itemValue, top);
        qnt++;
    }

    /**
     * Method to remove and return the value of the top item in the stack.
     * @return resp (Object)
     */
    public Object unStack ( ) {
        Object resp = null;
        if (qnt > 0) {
            resp = top.item;
            top = top.next;
            qnt--;
        }
        return resp;
    }

    /**
     * Method to return the value of the top item in the stack.
     * @return resp (Object)
     */
    public Object topStack ( ) {
        Object resp = null;
        if (qnt > 0) 
            resp = top.item;
        return resp;
    }

    /**
     * Method to return the value of the bottom item in the stack.
     * @return resp (Object)
     */
    public Object botStack ( ) {
        Object resp = null;
        for (CCell aux = top; aux.next != null; aux = aux.next)
            resp = aux.next.item;
        return resp;
    }

    /**
     * Method to check if a X value is in the stack.
     * @param x (Object)
     * @return (boolean)
     */
    public boolean inStack (Object x) {
        boolean resp = false;
        for (CCell aux = top; aux != null; aux = aux.next) {
            if (aux.item.equals(x))
                resp = true;
        }
        return resp;
    }

    /**
     * Method for counting how many times an X value appears in the stack.
     * @param x (Object)
     * @return (int)
     */
    public int qntInStack (Object x) {
        int resp = 0;
        for (CCell aux = top; aux != null; aux = aux.next) {
            if (aux.item.equals(x))
                resp++;
        }
        return resp;
    }

    /**
     * Method to check if the stack is empty.
     * @return (boolean)
     */
    public boolean isEmpty ( ) {
        return (qnt == 0);
    }

    /**
     * Method to return the number of elements in the stack.
     * @return (int)
     */
    public int quantity ( ) {
        return qnt;
    }

    /**
     * Method to print on the screen all the queue.
     */
    public void showStack ( ) {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
        } else {
            System.out.println("Stack:");
            for (CCell aux = top; aux != null; aux = aux.next) {
                System.out.println("[" + aux.item + "]");
            }
        }
    }

    
}
