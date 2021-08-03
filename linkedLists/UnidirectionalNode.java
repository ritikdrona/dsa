package linkedLists;

public class UnidirectionalNode<T> extends Node<T> {

    Node<T> next;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
}
