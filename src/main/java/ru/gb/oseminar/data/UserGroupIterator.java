package ru.gb.oseminar.data;

import java.util.Iterator;

// применяем DIP
public interface UserGroupIterator<T extends User> extends Iterator<T> {

    @Override
    public boolean hasNext();

    @Override
    public T next();

}
