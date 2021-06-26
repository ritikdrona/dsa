package linkedLists;

public interface IntegerLinkedList {
    UnidirectionalNode<Integer> list = new UnidirectionalNode<Integer>();
    void traverse();
    void insert(int index, Integer toInsert);
    Integer delete(int index);
    void search(Integer toSearch);
    void sort();
    void reverse();
    void extend(IntegerLinkedList list);
}
