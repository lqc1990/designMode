package com.designmode.combination;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author lqc
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    Stack stack = new Stack();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        } else {
            Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
            MenuComponent menuComponent = iterator.next();
            stack.push(menuComponent.createIterator());
            return menuComponent;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
