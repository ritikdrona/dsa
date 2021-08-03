package linkedLists.seperate;

public class BidirectionalNode<T> {

    T data;

    BidirectionalNode<T> next;

    BidirectionalNode<T> prev;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BidirectionalNode<T> getNext() {
        return next;
    }

    public void setNext(BidirectionalNode<T> next) {
        this.next = next;
    }

    public BidirectionalNode<T> getPrev() {
        return prev;
    }

    public void setPrev(BidirectionalNode<T> prev) {
        this.prev = prev;
    }
    
}
