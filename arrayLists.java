import java.util.ArrayList;
import java.util.Collections;

public class arrayLists {
    public static void main(String[] args) {
        // Sntax
        ArrayList<Integer> list = new ArrayList<>();
        //OR  ArrayList<Integer> list = new ArrayList<Integer>();
        //FOR STRING -- ArrayList<String> list = new ArrayList<>();
        // Similarly for Boolean

        // add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get elements
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(1, 1);
        System.out.println(list);

        // set element
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size
        System.out.println(list.size());

        // loops
        for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
