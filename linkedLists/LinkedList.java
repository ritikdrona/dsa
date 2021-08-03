package linkedLists;

public abstract class LinkedList<T> {

    // Node<T> start;

    abstract void traverse();

    abstract void insert(int index, T toInsert);

    abstract T delete(int index);

    abstract void search(T toSearch);

    abstract void sort();

    abstract void reverse();

    abstract void extend(LinkedList<T> list);

}
