package ru.gb.oseminar.data;

import java.util.Comparator;

// применяем DIP
public interface UserComporator<T extends User> extends Comparator<T> {
    @Override
    public int compare(T o1, T o2);
}
