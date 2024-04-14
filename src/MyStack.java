import java.util.NoSuchElementException;

public class MyStack<T extends Comparable<T>> {
    private MyLinkedList<T> list;

    public MyStack() {
        list = new MyLinkedList<>();
    }

    public boolean isEmpty() {
        return list.size == 0;
    }

    public int size() {
        return list.size;
    }

    public T peek() {
        return list.getLast();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        T item = list.get(list.size - 1);
        list.removeLast();
        return item;
    }

}
