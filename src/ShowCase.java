import java.util.*;

public class ShowCase {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        int index = 10;
        if (index> linkedList.size()){
            System.out.println("no no no");
        }else
        linkedList.add(10,"D");
        System.out.println("LinkedList: " + linkedList);

        // Queue
        Queue<Integer> queue = new LinkedList<>();//FIFO- first in, first out
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue: " + queue);

        // Deque (LinkedList-based)
        Deque<Character> deque = new LinkedList<>();
        deque.addLast('B');
        deque.addFirst('A');

        System.out.println("Deque: " + deque);

        // PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        System.out.println("PriorityQueue: " + priorityQueue);

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("X");
        stack.push("Y");
        stack.push("Z");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println("Stack: " + stack);

        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTimeArrayList = System.nanoTime();//время ОС в мл.секундах
        for (int i = 0; i< 100000000;i++){
            arrayList.add(i);
        }
        long endTimeArrayList = System.nanoTime();
        double durarution = (endTimeArrayList - startTimeArrayList)/1e9;//вычитание и преобразование в секунды
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        long startTimeLinkedList = System.nanoTime();
        for (int i = 0; i< 100000000;i++){
            linkedList2.add(i);
        }
        long endTimeLinkedList = System.nanoTime();
        double linkedListDuration = (endTimeLinkedList -startTimeLinkedList)/1e9;//вычитание и преобразование в секунды
        System.out.println("arrayList " + durarution);
        System.out.println("linkedList " + linkedListDuration);

    }
}
