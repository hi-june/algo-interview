package idis;

public class Q1 {
    /**
     * 문제 조건: O(N)으로 구현할 것
     */

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 5};

        QueueManager<Integer> queue = new QueueManager();
        for (int n : nums) {
            queue.offer(n);
        }

        while (queue.getSize() >= 2) {
            queue.poll();

            int val = queue.poll();
            queue.offer(val);
        }

        System.out.println(queue.poll());
    }
}

class Node<T> {
    T val;
    Node<T> next = null;

    public Node(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public Node<T> getNext() {
        return next;
    }
}

class QueueManager<T> {
    Node<T> front = null;
    Node<T> rear = null;
    int size;

    void offer(T val) {
        Node<T> node = new Node<>(val);

        if (isEmpty()) {
            front = node;
        } else {
            rear.next = node;
        }

        rear = node;
        size++;
    }

    T poll() {
        if (isEmpty()) return null; // queue가 비어있는 경우

        T val = front.getVal();

        if (front == rear) {    // queue에 data가 1개인 경우
            front = null;
            rear = null;
        } else {    // queue에 data가 2개 이상인 경우
            front = front.getNext();
        }

        size--;
        return val;
    }

    boolean isEmpty() {
        return front == null;
    }

    int getSize() {
        return size;
    }
}
