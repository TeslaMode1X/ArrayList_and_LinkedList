
public class Main {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();



        list.add(1);
        list.add(2);
        list.add(3);
        list.sort();

        printArray(list);

        System.out.println(list + " " + list.size() + " " + list.length());
    }

    public static <T> void printArray(MyArrayList list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}