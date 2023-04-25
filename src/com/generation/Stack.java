package com.generation;

import java.util.Scanner;

class Stack{
    int[] stack;

    int top;

    int maxSize;

    public  Stack(int size){
        maxSize=size;
        stack=new int[maxSize];
        top=-1;
    }
    public boolean isFull() {
        return  top==maxSize-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int x){
        if (isFull()){
            System.out.println("stack is full");
        }else {
            top++;
            stack[top]=x;
        }
        System.out.println("one element push in stack "+x);
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return top;
        }
        int temp=stack[top];
        top--;
        System.out.println("element is removed from stack " + temp);
        return temp;


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack obj=new Stack(scanner.nextInt());
        obj.push(5);
        obj.push(8);
        obj.push(7);
        obj.push(2);
        obj.push(1);
        obj.pop();
    }
}