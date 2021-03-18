/**
 * CCell.java
 * 
 * @author: Rodrigo Richard
 * @version: v1.0
 */
public class CCell {
    public Object item;
    public CCell next;

    public CCell (Object itemValue, CCell nextCell) {
        item = itemValue;
        next = nextCell;
    }

    public CCell (Object itemValue) {
        item = itemValue;
        next = null;
    }

    public CCell ( ) {
        item = null; 
        next = null;
    }
}
