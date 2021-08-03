package linkedLists.seperate;

public class SinglyLinkedList<T> {
    
    UnidirectionalNode<T> start;
    // int length = 0;

    T delete(int index) {
        UnidirectionalNode<T> node = this.start, prev = null;
        // UnidirectionalNode<T> prev;
        if (index == 0) {
            UnidirectionalNode<T> lastStart = this.start;
            this.start = lastStart.getNext();
            return lastStart.getData();
        }
        while (index != 0) {
            prev = node;
            node = node.getNext();
            index--;
        }
        // delete node and return data
        if (prev != null) {
            prev.setNext(node.getNext());
            return node.getData();
        } else {
            return null;
        }
    }

    void extend(SinglyLinkedList<T> list) {
        UnidirectionalNode<T> node = this.start;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(list.start);
        // another thing that can be done is to insert items one by one at the end
    }

    void insert(int index, T toInsert) {
        UnidirectionalNode<T> node = this.start, prev = null;
        while (index != 0) {
            prev = node;
            node = node.getNext();
            index--;
        }
        UnidirectionalNode<T> newNode = new UnidirectionalNode<T>();
        newNode.setData(toInsert);
        newNode.setNext(node);
        if (prev == null) {
            this.start = newNode;
        } else {
            prev.setNext(newNode);
        }
    }

    void reverse() {
        // TODO Auto-generated method stub
        // way 1: swap nodes in back and front
        // way 2: create new list and insert every time in front
    }

    int search(T toSearch) {
        // Linear Search
        UnidirectionalNode<T> node = this.start;
        int index = 0;
        while (node != null) {
            if (node.getData().equals(toSearch)) {
                return index;
            }
            node = node.getNext();
            index++;
        }
        return -1;
    }

    void sort() {
        // TODO Auto-generated method stub
    }

    void traverse() {
        UnidirectionalNode<T> node = this.start;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    int getLength() {
        int length = 0;
        UnidirectionalNode<T> node = this.start;
        while (node != null) {
            node = node.getNext();
            length++;
        }
        return length;
    }

    void swap(int index1, int index2) {
        if (index1 < 0 || index2 < 0) {
            return;
        }
        if (index2 < index1) {
            swap(index2, index1);
        }

        UnidirectionalNode<T> node = this.start, prev = null, lastPrev = null, lastNext, last = null;
        while (node != null && index1 != 0) {
            prev = node;
            node = node.getNext();
            index1--;
            index2--;
        }

        lastPrev = prev;
        last = node;
        lastNext = node.getNext();
        
        while (node != null && index2 != 0) {
            prev = node;
            node = node.getNext();
            index2--;
        }

        prev.setNext(last);
        last.setNext(node.getNext());

        lastPrev.setNext(node);
        node.setNext(lastNext);
    }

    T get(int index) {
        int currentIndex = 0;
        UnidirectionalNode<T> node = this.start;
        while (currentIndex != index) {
            if (node == null) {
                return null;
            }
            node = node.getNext();
        }
        return node.getData();
    }

    @Override
    public String toString() {
        String r = "List - ";
        UnidirectionalNode<T> node = this.start;
        while (node != null) {
            r += node.toString() + " ";
            node = node.getNext();
        }
        return r;
    }

}
