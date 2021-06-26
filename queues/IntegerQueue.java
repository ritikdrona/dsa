package queues;

public class IntegerQueue {
    Integer[] queue = {};

    void insert(Integer toInsert) {
        Integer[] old = queue.clone();
        queue = new Integer[old.length + 1];
        for (int i = 0; i < old.length; i++) {
            queue[i] = old[i];
        }
        queue[old.length] = toInsert;
    }

    Integer delete() {
        Integer[] old = queue.clone();
        queue = new Integer[old.length - 1];
        for (int i = 0; i < queue.length; i++) {
            queue[i] = old[i+1];
        }
        return old[0];
    }

    @Override
    public String toString() {
        String r = "Queue: Front --> ";
        for (Integer i: queue) {
            r += i + " ";
        }
        if (queue.length == 0) {
            r += "(Empty)";
        } else {
            r += "<-- Rear";
        }
        return r;
    }

    public static void main(String[] args) {
        IntegerQueue queue = new IntegerQueue();
        System.out.println(queue);
        queue.insert(14);
        queue.insert(10);
        queue.insert(21);
        System.out.println(queue);
        queue.delete();
        System.out.println(queue);
        queue.delete();
        System.out.println(queue);
    }
}
