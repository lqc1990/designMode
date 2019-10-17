package com.designmode.iterator;

/**
 * @author lqc
 */
public class LunchMenuIter implements MyIterator{

    private int position = 0;

    private MenuItem[] menuItems;
    public LunchMenuIter(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position = position+1;
        return menuItem;
    }
}
