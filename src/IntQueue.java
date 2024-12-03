import java.util.LinkedList;

public class IntQueue {
    private LinkedList<Integer> queue;

    // Конструктор
    public IntQueue() {
        queue = new LinkedList<>();
    }

    // Додавання елемента в чергу
    public void enqueue(int element) {
        queue.addLast(element);
        System.out.println("Додано елемент: " + element);
    }

    // Вилучення елемента з черги
    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Черга порожня!");
            return null;
        }
        int removedElement = queue.removeFirst();
        System.out.println("Вилучено елемент: " + removedElement);
        return removedElement;
    }

    // Пошук елемента в черзі
    public boolean contains(int element) {
        return queue.contains(element);
    }

    // Перевірка на порожність черги
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Вивід елементів черги
    public void display() {
        System.out.println("Елементи черги: " + queue);
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        IntQueue intQueue = new IntQueue();

        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        intQueue.display();

        intQueue.dequeue();
        intQueue.display();

        int elementToFind = 20;
        System.out.println("Чи є елемент " + elementToFind + " в черзі? " + intQueue.contains(elementToFind));
    }
}

