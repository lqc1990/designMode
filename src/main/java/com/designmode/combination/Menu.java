package com.designmode.combination;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lqc
 */
public class Menu extends MenuComponent{

    ArrayList<MenuComponent> menuComponents = new ArrayList<>();

    private String name;
    private String describe;

    public Menu(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescribe() {
        return describe;
    }

    @Override
    public void print() {
        System.out.print(getName());
        System.out.print(", "+getDescribe());
        System.out.println("----------------");
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
