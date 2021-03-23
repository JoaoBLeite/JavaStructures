/**
 * CList.java using CCell.java
 * List data structure
 * 
 * @author: JohnyStudent
 * @date: 18 Mar 2021
 * @version: v1.0
 */
public class CList {
    private CCell first;
    private CCell last;
    private int qnt;

    /**
     * Constructing function of the list structure.
     * Creates the "head cell" pointed from the first and last.
     */
    public CList ( ) {
        first = new CCell( );
        last = first;
    }

    /**
     * To list a new element at the end of the list.
     * @param itemValue (Object)
     */
    public void insertEnd (Object itemValue) {
        last.next = new CCell(itemValue);
        last = last.next;
        qnt++;
    }

    /**
     * To list a new element at the beginning of the list.
     * @param itemValue (Object)
     */
    public void insertBeginning (Object itemValue) {
        first.next = new CCell(itemValue, first.next);
            if (first == last)
                last = first.next;
        qnt++;
    }

    /**
     * Method to check if the list is empty.
     * @return (boolean)
     */
    public boolean isEmpty ( ) {
        return (first == last);
    }

    /**
     * Method to return the number of elements in the list.
     * @return (int)
     */
    public int quantity ( ) {
        return qnt;
    }

    /**
     * Method to return the value of the n-th item in the list.
     * Obs: first value is in the position number 1.
     * @return resp (Object)
     */
    public Object returnIndex (int index) {
        Object resp = null;
        if (!(isEmpty()) && qnt >= index) {
            int count = 0;
            CCell aux = first.next;
            while (count != index - 1) {
                aux = aux.next;
                count++;
            }
            resp = aux.item;
        }
        return resp;
    }

    /**
     * Method to remove and return the value of the n-th item in the list.
     * Obs: first value is in the position number 1.
     * @return resp (Object)
     */
    public Object removeIndex (int index) {
        Object resp = null;
        if (!(isEmpty()) && qnt >= index) {
            int count = 1;
            CCell aux = first.next;
            while (count != index) {
                aux = aux.next;
                count++;
            }
            resp = aux.item;
            aux = first.next; count = 2;
            while (count != index) {
                aux = aux.next;
                count++;
            }
            aux.next = aux.next.next;
            qnt--;
        }
        return resp;
    }
    
     /**
     * Method to return the list in array style.
     * @return vet (Object[])
     */
    public Object[] toArray ( ) {
        if (isEmpty()) {
            System.out.println("The list is empty!");
            Object[] vet = new Object[1];
            vet[0] = null;
            return vet;
        } else {
            Object[] vet = new Object[quantity()];
            int i = 0;
            for (CCell aux = first.next; aux != null; aux = aux.next) {
                vet[i] = aux.item;
                i++;
            }
            return vet;
        }
    }

    /**
     * Method to print on the screen all the list.
     */
    public void showList ( ) {
        if (isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            System.out.print("List:");
            int i = 1;
            for (CCell aux = first.next; aux != null; aux = aux.next) {
                System.out.print("[" + i + ": " + aux.item + "]");
                i++;
            }
            System.out.println("");
        }
    }
    
}
