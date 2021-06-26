package arrays;

import arrays.search.BinarySearch;
import arrays.search.IntegerSearch;
import arrays.search.LinearSearch;
import arrays.search.SearchType;
import arrays.sort.BubbleSort;
import arrays.sort.IntegerSort;
import arrays.sort.SortType;

public class IntegerArray {
    Integer[] array = {};

    // public T get(int index) {
    // return array.get(index);
    // }

    public void traverse() {
        System.out.print("Traversing: ");
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void insert(int index, Integer toAdd) {
        Integer[] old = array.clone();
        if (index < 0) {
            System.out.println("Index Invalid !");
            // index = 0;
        } else if (index > old.length) {
            System.out.println("Index Invalid !");
            // index = old.length;
        } else {
            array = new Integer[old.length + 1];
            for (int i = 0; i < index; i++) {
                array[i] = old[i];
            }
            array[index] = toAdd;
            for (int i = index; i < old.length; i++) {
                array[i + 1] = old[i];
            }
        }
    }

    public void delete(int index) {
        Integer[] old = array.clone();
        if (index < 0) {
            System.out.println("Index Invalid !");
        } else if (index > old.length) {
            System.out.println("Index Invalid !");
        } else {
            array = new Integer[old.length - 1];
            for (int i = 0; i < index; i++) {
                array[i] = old[i];
            }
            // array[index] = toAdd;
            for (int i = index + 1; i < old.length; i++) {
                array[i - 1] = old[i];
            }
        }
    }

    public int search(Integer toSearch, SearchType type) {
        IntegerSearch search;
        switch (type) {
            case LINEAR_SEARCH:
                search = new LinearSearch();
                break;
            case BINARY_SEARCH:
                search = new BinarySearch();
                // this.sort(SortType.BUBBLE_SORT);
                break;
            default:
                search = new LinearSearch();
        }
        return search.search(array, toSearch);
    }

    public void sort(SortType type) {
        IntegerSort sort;
        switch(type) {
            case BUBBLE_SORT:
                sort = new BubbleSort();
                break;
            default:
                sort = new BubbleSort();
        }
        array = sort.sort(array);
    }

    public void extend(IntegerArray toExtend) { // merge
        Integer[] old = array.clone();
        array = new Integer[old.length + toExtend.array.length];
        for(int i = 0; i < old.length; i++) {
            array[i] = old[i];
        }
        for(int i = 0; i < toExtend.array.length; i++) {
            array[old.length + i] = toExtend.array[i];
        }
    }

    @Override
    public String toString() {
        String r = "Array: ";
        for (Integer element : array) {
            r += element + " ";
        }
        if (array.length == 0) {
            r += "(Empty)";
        }
        return r;
    }

    public static void main(String[] args) {
        IntegerArray array = new IntegerArray();
        System.out.println(array);
        array.insert(0, 12);
        array.insert(1, 13);
        array.insert(2, 14);
        array.insert(3, 15);
        array.insert(4, 16);
        System.out.println(array);
        array.insert(0, 17);
        array.insert(6, 17);
        System.out.println(array);
        array.delete(-10);
        array.delete(20);
        array.delete(2);
        System.out.println(array);
        System.out.println(array.search(21, SearchType.LINEAR_SEARCH));
        array.traverse();
        IntegerArray a2 = new IntegerArray();
        a2.insert(0, 11);
        a2.insert(0, 14);
        a2.insert(0, 17);
        array.extend(a2);
        System.out.println(a2);
        System.out.println(array);
        // System.out.flush();
        array.sort(SortType.BUBBLE_SORT);
        System.out.println("Sorted: ");
        System.out.println(array);
        System.out.println(array.search(21, SearchType.BINARY_SEARCH));
        System.out.println(array.search(12, SearchType.BINARY_SEARCH));
    }

}
