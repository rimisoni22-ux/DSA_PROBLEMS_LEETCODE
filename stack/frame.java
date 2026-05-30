package stack;

public class frame {
     public static class Stack<T> {
        private java.util.LinkedList<T> list = new java.util.LinkedList<>();

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void push(T data) {
            list.addFirst(data);
        }

        public T pop() {
            if (isEmpty()) {
                return null;
            }
            return list.removeFirst();
        }

        public T peek() {
            if (isEmpty()) {
                return null;
            }
            return list.getFirst();
        }
    }
    public static void main(String[] args) {
        
    
     Stack<Integer> s = new Stack<>();
     s.push(1);
     s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }


     
        }
    
}
