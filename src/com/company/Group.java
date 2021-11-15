package com.company;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

class Group<T> {
    private Stack<T> someInfo;

    public Group(Stack<T> someInfo) {
        this.someInfo = someInfo;

    }
    public Stack<T> getId() {
        return someInfo;
    }

    public void invertGroup(Stack<T> someInfo){
        System.out.println("Inverted Stack: ");
        Collections.reverse(someInfo);
        System.out.println(someInfo);
    }
}
