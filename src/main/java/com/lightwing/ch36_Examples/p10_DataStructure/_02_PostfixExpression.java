package com.lightwing.ch36_Examples.p10_DataStructure;

import java.io.IOException;

/**
 * @ClassName _02_PostfixExpression
 * @Description TODO
 * @Author Lightwing Ng
 * @DateTime 2018/8/11, 14:18
 * @Version 1.0
 **/
public class _02_PostfixExpression {
    private Stack theStack;
    private String input;
    private String output = "";

    private _02_PostfixExpression(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new Stack(stackSize);
    }

    private String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen();
                    break;
                default:
                    output += ch;
                    break;
            }
        }
        while (!theStack.isEmpty()) {
            output = output + theStack.pop();
        }
        System.out.println(output);
        return output;
    }

    private void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else
                    output = output + opTop;
            }
        }
        theStack.push(opThis);
    }

    private void gotParen() {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(')
                break;
            else
                output = output + chx;
        }
    }

    public static void main(String[] args) {
        String input = "1+2*4/5-7+3/6";
        String output;
        _02_PostfixExpression theTrans = new _02_PostfixExpression(input);
        output = theTrans.doTrans();
        System.out.println("Postfix is " + output + '\n');
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
