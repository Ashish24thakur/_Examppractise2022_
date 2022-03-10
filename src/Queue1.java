import java.util.Scanner;

public class Queue1 {

    int arr[];
    int front,rear;
    Queue1(int n)
    {
        front = -1;
        rear = -1;
        arr = new int[n];
    }
    void enqueue()
    {

        Scanner sc = new Scanner(System.in);
        if(front == -1 && rear == -1)
        {
            front = 0;
            rear = 0;
            arr[rear] = sc.nextInt();
        }
        else if(rear == arr.length-1)
        {
            System.out.println("Queue Full");
        }
        else{
            rear++;
            arr[rear] = sc.nextInt();
        }
    }
    void dequeue()
    {
        if(front <= rear)
        {
            front++;
        }
        else{
            front =-1;
            rear =-1;
        }
    }
    void traverse()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println("\nElement is : ");
            for (int i = front; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        Queue1 ob = new Queue1(n);
        for (int i=0;i<n;i++)
        {
            ob.enqueue();
        }
        ob.traverse();
        ob.dequeue();
        ob.traverse();


    }
}
