package linkedLists.seperate;

public class UnidirectionalNode<T> {

    T data;

    UnidirectionalNode<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public UnidirectionalNode<T> getNext() {
        return next;
    }

    public void setNext(UnidirectionalNode<T> next) {
        this.next = next;
    }
    
}
