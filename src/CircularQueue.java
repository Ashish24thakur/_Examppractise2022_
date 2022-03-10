import java.util.Scanner;

public class CircularQueue {

    int arr[];
    int n;
    int front,rear;
    CircularQueue()
    {
        arr = new int[5];
        front = -1;
        rear = -1;
    }
    boolean IsEmpty()
    {
        if(front == -1 && rear == -1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    boolean IsFull()
    {
        if(rear + 1 == front)
        {
            return true;
        }
        else if(rear + 1 == 5 && front == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    void Enqueue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        int data = sc.nextInt();
        if (IsFull())
        {
            System.out.println("Queue Full");
        }
        else if(IsEmpty())
        {
            front = 0;
            rear = 0;
            arr[rear] = data;
        }
        else{
           // int data1 = sc.nextInt();
            if(rear + 1 == 5)
            {
                rear = 0;
            }
            else{
                rear++;
            }
            arr[rear] = data;

        }

    }
    void dequeue()
    {
        System.out.println(arr[front]);
        arr[front] = 0;
        if(IsEmpty())
        {
            System.out.println("Queue Is Empty");
        }
        else if(front == rear)
        {
            front = rear = -1;
        }
        else if(front + 1 == 5)
        {
            front = 0;
        }
        else{
            front++;
        }
    }
    void traverse()
    {
        for(int i=0 ;i<5;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        CircularQueue ob = new CircularQueue();
        while (true) {
            System.out.println("Press 1 for Enque ");
            System.out.println("Press 2 for Dequeue");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for exit");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    ob.Enqueue();
                    break;
                }
                case 2: {
                    ob.dequeue();
                    break;
                }
                case 3: {
                    ob.traverse();
                    break;
                }
                case 4:
                {
                    System.exit(0);
                    //System.out.println("Invalid choice");
                }
                default:{
                    System.out.println("Invalid choice");
                }

            }

        }
    }
}
