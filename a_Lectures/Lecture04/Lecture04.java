// Lecture structure:
// 01. Types of collections, differences
// 02. LinkedList
// 03. Queue
// 04. Deque
// 05. Stack

import java.sql.SQLOutput;
import java.util.*;

public class Lecture04 {
    public static void main(String[] args) {
//1. ===================== QUEUE =============================
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
//        queue.add(2810);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll();
        System.out.println(queue); // [2809]
        queue.remove(2809); // зачем очередь??
//        queue.element();
//        queue.peek();

//2. ================== PRIORITY QUEUE =========================
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

//3. ======================= DEQUE =============================
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);   deque.addLast(2);
        deque.addFirst(3);   deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();  deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst();   deque.pollLast();
        deque.getFirst();    deque.getLast();
        deque.peekFirst();   deque.peekLast();
        System.out.println(deque);

//4. ======================= STACK =============================
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1


        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])){
                st.push(Integer.parseInt(exp[i]));
            }else{
                switch (exp[i]){
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = st.pop() - st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
