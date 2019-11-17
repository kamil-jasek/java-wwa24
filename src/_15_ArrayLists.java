import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _15_ArrayLists {

    public static void main(String[] args) {
        // generic list
        // default capacity of array list is 10
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            integers.add(i);
        }
        System.out.println(integers);

        // iterate over elements
        for (Integer i : integers) {
            System.out.println("i = " + i);
        }
        System.out.println("list size: " + integers.size());

        // methods

        boolean containsOne = integers.contains(1);
        System.out.println("contains one: " + containsOne);

        // check if is empty
        boolean empty = integers.isEmpty();
        System.out.println("empty: " + empty);

        // remove element at index
        integers.remove(1);
        System.out.println("list removed 1: " + integers);
        System.out.println("list size: " + integers.size());

        // remove object
        integers.remove(Integer.valueOf(12));
        System.out.println("list removed 12: " + integers);
        System.out.println("list size: " + integers.size());

        // get element at index
        Integer i1 = integers.get(1); // watch out for list size!!
        System.out.println("i1 is: " + i1);

        // update value at given index
        integers.set(17, 55);
        System.out.println("integers: " + integers);

        // add element
        integers.add(15);
        System.out.println("integers: " + integers);

        integers.add(5, 100);
        System.out.println("integers: " + integers);

        // sort elements
        Collections.sort(integers);
        System.out.println("integers: " + integers);

        // task
        List<Integer> numbers = Arrays.asList(8, 3, 4, 19);
        // remove from integers all elements apart from "numbers"
        integers.retainAll(numbers);
        System.out.println("integers: " + integers);

        // clear list
        integers.clear();
        System.out.println("is empty: " + integers.isEmpty());
    }
}
