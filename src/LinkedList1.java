import java.util.Scanner;

class Node{

    int data;
    Node next;

   Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList1 {

    Node Head;

    void insert(int k)
    {
        Node ob = new Node(k);
        if(Head == null)
        {
            Head = ob;
        }
        else{
            Node current = Head;

            while(current.next!=null)
            {
                current = current.next;
            }
            current.next = ob;
            //current = ob;
            //current.next = null;
        }

    }

    void display()
    {
        Node current = Head;
       while(current!=null)
        {
            System.out.println(current.data);
            current = current.next;
        }


    }

    public static void main(String[] args) {

        LinkedList1 obj = new LinkedList1();
       for (int i = 0; i < 5; i++) {
           Scanner sc = new Scanner(System.in);
           int aa = sc.nextInt();
            obj.insert(aa);
            //obj.insert(20);
        }

        obj.display();
    }
}
