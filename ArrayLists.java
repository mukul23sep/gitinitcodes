import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        int element = list.get(0);
        System.out.println(element);
        list.add(1, 1);
        System.out.println(list);

    }

}
