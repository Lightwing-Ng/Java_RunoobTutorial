package com.lightwing.ch36_Examples.p10_DataStructure;

/**
 * @ClassName _10_StringReverse
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:44
 * @Version 1.0
 **/

public class _10_StringReverserThroughStack {
    private String input;

    private _10_StringReverserThroughStack(String in) {
        input = in;
    }

    private String doRev() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        String output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "www.w3cschool.cc";
        String output;
        _10_StringReverserThroughStack theReverser =
                new _10_StringReverserThroughStack(input);
        output = theReverser.doRev();
        System.out.println("反转前: " + input);
        System.out.println("反转后: " + output);
    }

    class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;

        public Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }

        public void push(char j) {
            stackArray[++top] = j;
        }

        public char pop() {
            return stackArray[top--];
        }

        public char peek() {
            return stackArray[top];
        }

        public boolean isEmpty() {
            return (top == -1);
        }
    }
}
