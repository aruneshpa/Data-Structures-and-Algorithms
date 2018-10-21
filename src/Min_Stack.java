class MinStack {

    Stack<Integer> minSt;
    Stack<Integer> st;

    public MinStack() {
        minSt = new Stack <Integer> ();
        st = new Stack<Integer> ();
    }

    public void push(int x) {
        st.push(x);
        if (minSt.isEmpty()) {
            minSt.push(x);
        } else if (x <= minSt.peek()) {
            minSt.push(x);
        } else {
            minSt.push(minSt.peek());
        }
    }

    public void pop() {
        minSt.pop();
        st.pop();
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek();
        }
        return -1;
    }

    public int getMin() {
        if (!minSt.isEmpty()) {
            return minSt.peek();
        }
        return -1;
    }
}

class MinStack {
    Node head = null;
    
    public MinStack() {
        head = null;
    }

    public void push(int x) {
        if (head == null) {
            head = new Node (x, x);
        } else {
            head = new Node (x, head, Math.min(head.min, x));
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    public class Node {
        int val;
        Node next;
        int min;
        public Node (int val, int min) {
            this.val = val;
            this.min = min;
        }
        public Node (int val, Node next, int min) {
            this.val = val;
            this.next = next;
            this.min = min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.peek();
 * int param_4 = obj.getMin();
 */
