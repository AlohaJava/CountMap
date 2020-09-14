package com.company;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface CountMap<T>  {
    void add(T element);

    int getCount(T o);

    //current count
    int remove(T o);

    int size();

    void addAll(CountMap<? extends T> source);

    Map<T, Integer> toMap();

    void toMap(Map<? super T, Integer> destination);

}