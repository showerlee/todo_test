/**
 * Created by Leon on 2019/1/5
 */

package com.example.gradle.todo;

public class TodoItem {
    //待办事项名称
    private String name;

    //已完成
    private boolean hasDone;

    public TodoItem(String name) { this.name = name; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public boolean isHasDone() { return hasDone; }

    public void setHasDone(boolean hasDone) { this.hasDone = hasDone; }

    public String toString() { return name + (hasDone ? " hasDone" : " need to do") + "!"; }
}
