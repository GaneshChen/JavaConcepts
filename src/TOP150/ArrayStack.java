package TOP150;

import java.util.Stack;

public class ArrayStack<T> {

    Stack<Character> st = new Stack<>();


    final int MAX_SIZE = 30;
    T[] arr = (T[]) new Object[MAX_SIZE];
    int top;

    ArrayStack(){
        top = -1;
    }

   void push(T val){

        if(top==MAX_SIZE-1)
            throw new IndexOutOfBoundsException("Stack is OverFull");
       arr[++top] = val;
    }

  T pop(){
        if(top==-1){
            throw new IndexOutOfBoundsException("Stack is Underflow");
        }
        return arr[top--];
  }
  T peek(){
        return arr[top];
  }

  boolean isEmpty(){
        if(top==-1){
            return true;
        }
     return false;
  }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();


        stack.push(8);
        stack.push(11);
        stack.pop();
        stack.peek();
    }
}
