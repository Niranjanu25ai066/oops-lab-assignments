// Interface
interface QueueImpl {
    void insert(int item) throws OverflowException;
    int delete() throws UnderflowException;
    void display();
}

// User-defined Exceptions
class OverflowException extends Exception {
    OverflowException(String msg) {
        super(msg);
    }
}

class UnderflowException extends Exception {
    UnderflowException(String msg) {
        super(msg);
    }
}

// Queue Implementation
class QueueDemo implements QueueImpl {
    int queue[] = new int[10];
    int front = -1, rear = -1;

    // Insert operation
    public void insert(int item) throws OverflowException {
        if (rear == 9) {
            throw new OverflowException("Queue Overflow!");
        }

        if (front == -1) front = 0;

        queue[++rear] = item;
        System.out.println(item + " inserted.");
    }

    // Delete operation
    public int delete() throws UnderflowException {
        if (front == -1 || front > rear) {
            throw new UnderflowException("Queue Underflow!");
        }

        int item = queue[front++];
        System.out.println(item + " deleted.");
        return item;
    }

    // Display operation
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

// Main class
public class Queues {
    public static void main(String[] args) {

        QueueDemo q = new QueueDemo();

        try {
            // Insert elements
            for (int i = 1; i <= 10; i++) {
                q.insert(i);
            }

            // This will cause overflow
            q.insert(11);

        } catch (OverflowException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        q.display();

        try {
            // Delete all elements
            for (int i = 1; i <= 10; i++) {
                q.delete();
            }

            // This will cause underflow
           q.delete();

        } catch (UnderflowException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        q.display();
    }
}