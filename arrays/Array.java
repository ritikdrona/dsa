package arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Array<T> {

    List<T> array = new ArrayList<>();

    // public T get(int index) {
    //     return array.get(index);
    // }

    public void traverse() {
        for(T element: array) {
            System.out.println(element);
        }
    }

    public void insert(int index, T toAdd) {
        array.add(index, toAdd);
    }

    public void delete(int index) {
        array.remove(index);
    }

    // yet to implement
    public int search(T toSearch) {
        return array.indexOf(toSearch);
    }

    // yet to implement
    public void sort(Comparator<T> c) {
        array.sort(c);
    }

    public void extend(Array<T> toExtend) { // merge
        array.addAll(toExtend.array);
    }

    @Override
    public String toString() {
        String r = "";
        for (T element: array) {
            r += element.toString() + " ";
        }
        return r;
    }

}
