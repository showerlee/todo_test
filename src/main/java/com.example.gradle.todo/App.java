/**
 * Created by Leon on 2019/1/5
 */

package com.example.gradle.todo;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.Scanner;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args){
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++i > 0) {
            log.info(i + ". please input todo item name");
            TodoItem item = new TodoItem(scanner.nextLine());
            System.out.println(item);
        }
    }
}
