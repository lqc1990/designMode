package com.designmode.decorate;

import java.io.*;

/**
 * @author lqc
 */
public class IOTest {

    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(new FileInputStream("C:\\Users\\123\\IdeaProjects\\DesignMode\\src\\main\\java\\com\\designmode\\decorate\\test.txt")));
        while ((c = in.read()) >= 0){
            System.out.print((char)c);
        }
        in.close();
    }
}
