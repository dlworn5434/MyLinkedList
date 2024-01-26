package pro.pro;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new Main().new MyLinkedList<>();
        linkedList.add("나는");
        linkedList.add("이재구");
        linkedList.add("이다");
        System.out.println("LinkedList 인덱스 1의 항목: " + linkedList.get(1));

        MyQueue<Integer> queue = new Main().new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Queue Dequeue: " + queue.dequeue());

        MyStack<Integer> stack = new Main().new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack Pop: " + stack.pop());
    }

    class MyLinkedList<T> {
        private Node<T> head;
        private int size;

        private class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        public MyLinkedList() {
            this.head = null;
            this.size = 0;
        }

        public void add(T data) {
            if (head == null) {
                head = new Node<>(data);
            } else {
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node<>(data);
            }
            size++;
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        public void delete(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            if (index == 0) {
                head = head.next;
            } else {
                Node<T> current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
            size--;
        }
    }

    class MyQueue<T> {
        private MyLinkedList<T> list = new MyLinkedList<>();

        public void enqueue(T data) {
            list.add(data);
        }

        public T dequeue() {
            if (list.size == 0) {
                return null;
            }
            T data = list.get(0);
            list.delete(0);
            return data;
        }

        public boolean isEmpty() {
            return list.size == 0;
        }
    }

    class MyStack<T> {
        private MyLinkedList<T> list = new MyLinkedList<>();

        public void push(T data) {
            list.add(data);
        }

        public T pop() {
            if (list.size == 0) {
                return null;
            }
            T data = list.get(list.size - 1);
            list.delete(list.size - 1);
            return data;
        }

        public boolean isEmpty() {
            return list.size == 0;
        }
    }
}
