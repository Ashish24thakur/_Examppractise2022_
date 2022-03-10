import java.util.Scanner;

class Node15{
    int data;
    Node15 next;
    Node15 reverse;
}
public class QueueWithLinkedList {
    Node15 head,tail;
    void insert()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Node15 ob = new Node15();
        ob.data = a;
        ob.next = null;
        ob.reverse = null;
        if(head == null && tail == null)
        {
            head = ob;
            tail = ob;
        }
        else{
            tail = ob;
            Node15 current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = ob;
            ob.reverse = current;

        }
    }
    void enqueue()
    {
        Node15 curr = tail;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        Node15 obj = new Node15();
        obj.data = data;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = obj;
        obj.reverse = curr;
        obj.next = null;
    }
    void dequeue()
    {
        Node15 curr15 = head;
        if(head==null)
        {
            tail = null;
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println(head.data);
            head = curr15.next;
        }

    }
    void traverse()
    {
        Node15 currr = head;
        while(currr!= null)
        {
            System.out.print(currr.data + " ");
            currr = currr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueWithLinkedList obb = new QueueWithLinkedList();
        obb.insert();
        System.out.println("-----------------------");
        obb.enqueue();
        obb.enqueue();
        System.out.println("Element is ");
        obb.traverse();
        obb.dequeue();
        System.out.println("Element is ");
        obb.traverse();

    }

}
