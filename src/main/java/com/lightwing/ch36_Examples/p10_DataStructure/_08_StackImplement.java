package com.lightwing.ch36_Examples.p10_DataStructure;

/**
 * @ClassName _08_StackImplement
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:38
 * @Version 1.0
 **/
public class _08_StackImplement {
    private int maxSize;
    private long[] stackArray;
    private int top;

    private _08_StackImplement(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        _08_StackImplement theStack = new _08_StackImplement(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
    }
}
