package com.view.ch04;

import java.util.Collection;
import java.util.Set;

public class InstrumentedHashSet<E> extends ForwardingSet<E> {
    // The number of attempted element insertions
    private int addCount = 0;

    public InstrumentedHashSet(Set<E> s){
        super(s);
    }

    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c){
        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount(){
        return addCount;
    }
}
