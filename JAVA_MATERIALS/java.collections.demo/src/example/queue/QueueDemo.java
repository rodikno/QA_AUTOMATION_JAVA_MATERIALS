package example.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Звичайна черга - FIFO
        Queue<String> mcdonaldsQueue = new LinkedList<>();
        mcdonaldsQueue.offer("Іван");    // зайшов в чергу
        mcdonaldsQueue.offer("Марія");   // зайшла за Іваном
        mcdonaldsQueue.offer("Петро");   // зайшов за Марією

        // Обслуговуємо клієнтів
        String nextCustomer = mcdonaldsQueue.poll(); // "Іван" - першим і обслуговується

        // Пріоритетна черга - пріоритетність визначається не порядком додавання,
        // а натуральним порядком сортування
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5); // п*ятий пріоритет
        queue.add(1); // перший пріоритет
        queue.add(3); // третій пріоритет

        System.out.println(queue.poll()); // 1 (smallest element is retrieved first)
        System.out.println(queue.poll()); // 3
        System.out.println(queue.poll()); // 5

    }
}
