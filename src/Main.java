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

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.sort();
//        Object[] listi = list.toArray();

//        for (int i = 0; i < listi.length; i++) {
//            System.out.println(listi[i]);
//        }

//        list.add(0, 10);
//        System.out.println(list.getLast());
        printArray(list);
//
//        System.out.println(list.exists(4));
    }

    public static <T> void printArray(MyLinkedList list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}