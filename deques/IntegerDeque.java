package deques;

public class IntegerDeque {
    Integer[] deque = {};

    void insertFront(Integer toInsert) {
        Integer[] old = deque.clone();
        deque = new Integer[old.length + 1];
        deque[0] = toInsert;
        for (int i = 0; i < old.length; i++) {
            deque[i+1] = old[i];
        }
    }

    void insertRear(Integer toInsert) {
        Integer[] old = deque.clone();
        deque = new Integer[old.length + 1];
        for (int i = 0; i < old.length; i++) {
            deque[i] = old[i];
        }
        deque[old.length] = toInsert;
    }

    Integer deleteFront() {
        Integer[] old = deque.clone();
        deque = new Integer[old.length - 1];
        for (int i = 0; i < deque.length; i++) {
            deque[i] = old[i+1];
        }
        return old[0];
    }

    Integer deleteRear() {
        Integer[] old = deque.clone();
        deque = new Integer[old.length - 1];
        for (int i = 0; i < deque.length; i++) {
            deque[i] = old[i];
        }
        return old[old.length - 1];
    }

    @Override
    public String toString() {
        String r = "Deque: Front --> ";
        for (Integer i: deque) {
            r += i + " ";
        }
        if (deque.length == 0) {
            r += "(Empty)";
        } else {
            r += "<-- Rear";
        }
        return r;
    }

    public static void main(String[] args) {
        IntegerDeque deque = new IntegerDeque();
        System.out.println(deque);
        deque.insertFront(5);
        System.out.println(deque);
        deque.insertFront(14);
        System.out.println(deque);
        deque.insertFront(7);
        System.out.println(deque);
        deque.insertRear(76);
        System.out.println(deque);
        deque.insertRear(11);
        System.out.println(deque);
        deque.deleteFront();
        deque.deleteRear();
        System.out.println(deque);
    }
}
