package com.designmode.iterator;

/**
 * @author lqc
 */
public class Waitress {

    private LunchMenuItem lunch;
    private BreakfastMenuItem breakfast;

    public Waitress(LunchMenuItem lunch, BreakfastMenuItem breakfast) {
        this.breakfast = breakfast;
        this.lunch = lunch;
    }

    public void printMenu(){
        MyIterator breakfastIter = breakfast.createIter();
        printMenu(breakfastIter);
        System.out.println("-----------开始打印午餐");
        MyIterator lunchIter = lunch.createArrIter();
        printMenu(lunchIter);
    }

    private void printMenu(MyIterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println("商品名称:"+menuItem.getName()+
                    "\n商品描述"+ menuItem.getDescribe()+
                    "\n是否为素食:"+ menuItem.isVegetarian()+
                    "\n价格:"+menuItem.getPrice());
        }
    }
}
