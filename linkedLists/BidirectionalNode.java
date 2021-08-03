package linkedLists;

public abstract class BidirectionalNode<T> extends Node<T> {

    Node<T> prev;

    Node<T> next;

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}
