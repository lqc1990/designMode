package com.designmode.iterator;

import java.util.List;

/**
 * @author lqc
 */
public class BreakfastMenuIter implements MyIterator {

    private int position = 0;
    private List list;

    public BreakfastMenuIter(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(position >= list.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) list.get(position);
        position = position+1;
        return menuItem;
    }
}
