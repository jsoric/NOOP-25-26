package pckg_enumeration;

import java.util.Iterator;

public class Client<E> {

    private Iterator<E> someIterator;

    public Client(Iterator<E> someIterator) {
        this.someIterator = someIterator;
    }

    public boolean hasSomeElement() {
        return someIterator.hasNext();
    }


    public E getNextElement() {
        return someIterator.next();
    }

    public void removeElement() {
        someIterator.remove();
    }

}
