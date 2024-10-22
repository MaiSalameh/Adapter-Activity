package problem.client;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter<T> implements Enumeration {
    Iterator<T> iterator;

    public EnumerationAdapter(Iterator<T> iterator){
        this.iterator=iterator;
    }
    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return iterator.next();
    }

    @Override
    public Iterator asIterator() {
        return Enumeration.super.asIterator();
    }
}
