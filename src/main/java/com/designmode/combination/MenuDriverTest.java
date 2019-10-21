package com.designmode.combination;



import javax.swing.*;
import java.math.BigDecimal;

/**
 * @author lqc
 */
public class MenuDriverTest {
    public static void main(String[] args) {

        MenuComponent breakfastMenu = new Menu("早餐","快餐车");
        MenuComponent lunchMenu = new Menu("午餐","实体店");

        MenuComponent menuComponent = new Menu("全部","所有菜单");
        menuComponent.add(breakfastMenu);
        menuComponent.add(lunchMenu);

        breakfastMenu.add(new MenuItem("煎饼","薄饼,鸡蛋,油条",new BigDecimal(10),false));
        breakfastMenu.add(new MenuItem("油条","面，植物油",new BigDecimal(8),true));

        MenuItem lunchMenuItem = new MenuItem("红烧肉","猪肉，鹌鹑蛋",new BigDecimal(60),false);
        lunchMenu.add(lunchMenuItem);

        Waiterss waitress = new Waiterss(menuComponent);
        waitress.menuPrint();

    }


}
