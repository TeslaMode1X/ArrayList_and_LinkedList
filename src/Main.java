import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        MyArrayList list = new MyArrayList();
//
//        list.add(2);
//        list.add(3);
//        list.sort();
//
//        Object[] int_arr = list.toArray();
//
//        for (int i = 0; i < int_arr.length; i++) {
//            System.out.println(int_arr[i]);
//        }
//
//        printArray(list);
//
//        System.out.println(list + " " + list.size() + " " + list.length());

//        MyLinkedList<Integer> list = new MyLinkedList<>();
//
//        list.add(5);
//        list.add(4);
//        list.add(3);
//        list.add(2);
//        list.add(1);
//        list.sort();
//        Object[] listi = list.toArray();
//        for (int i = 0; i < listi.length; i++) {
//            System.out.println(listi[i]);
//        }
//        list.add(0, 10);
//        System.out.println(list.getLast());
//        printArray(list);
//
//        System.out.println(list.exists(4));

//        MyStack<String> stack = new MyStack<>();
//
//        stack.push("first");
//        stack.push("second");
//        stack.push("third");
//        stack.push("fourth");
//        stack.push("fifth");
//        stack.push("sixth");
//
//        System.out.println(stack.peek());
//        printStack(stack);

//        MyQueue<String> queue = new MyQueue<>();
//
//        queue.enqueue("first");
//        queue.enqueue("second");
//        queue.enqueue("third");
//
//        System.out.println(queue.dequeue());
//
//        System.out.println(queue.dequeue());
//
//        System.out.println(queue.dequeue());
//
//        System.out.println(queue.size());

        MyHeap<Integer> heap = new MyHeap<>();

        heap.insert(10);

        heap.insert(9);

        heap.insert(8);

        heap.insert(7);
        heap.insert(6);

        heap.insert(5);
        heap.insert(4);
        heap.insert(3);
        heap.insert(2);
        heap.insert(1);

        heap.extractMin();

        for (int i = 0; i < heap.size(); i++) {
            System.out.print(heap.get(i) + " ");
        }


    }

    public static <T> void printArray(MyArrayList list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static <T> void printStack(MyStack stack) {
        while (!stack.isEmpty()) {
            T item = (T) stack.pop();
            System.out.println(item);
        }
    }
}