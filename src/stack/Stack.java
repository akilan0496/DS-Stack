package stack;

interface Stack<T> {
    Stack<T> push(T ele);
    T pop();
}