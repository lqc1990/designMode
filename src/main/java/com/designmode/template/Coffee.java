package com.designmode.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lqc
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        if (getInput().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    private String getInput(){
        String answer = "";
        System.out.println("请问您需要添加糖和牛奶吗?(y/n)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
}
