import java.util.Scanner;

class Node1{
    int roll;
    Node1 next;
        }
public class LinkedList2 {
    Node1 head;
    void insert()
    {
        Scanner sc = new Scanner(System.in);
        int sr = sc.nextInt();
        Node1 nn = new Node1();
        nn.roll = sr;
        nn.next = null;
        if(head==null)
        {
            head = nn;
        }
        else{
            Node1 temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = nn;
        }
    }

    void display()
    {
        Node1 current = head;
        while(current != null)
        {
            System.out.println(current.roll);
            current = current.next;
        }
    }

    void Delete(int data)
    {
        Node1 current = head;
         Node1 address;
         int f=1;
        while(current != null)
        {
            if(current.roll == data)
            {
                f=0;
                address = current;
                Node1 current2 = head;
                while(current2 != null)
                {
                    if(current2.next== address)
                    {
                      current2.next = current2.next.next;
                    }
                    else if(current2 == address)
                    {
                        head = current2.next;
                    }
                    current2 = current2.next;
                }
                System.out.println("Element deleted.........");
                break;
            }
            current = current.next;
        }
        if(f==1)
        {
            System.out.println("Element not found");
        }

    }
    void fDelete()
    {
        Node1 crr = head;
        head = crr.next;
        System.out.println("First element deleted...........");
    }
    void lastDelete()
    {
        Node1 cu = head;
        while(cu.next!= null)
        {
            cu = cu.next;
        }
        Node1 cu1 = head;
        while(cu1 != null)
        {
            if(cu1.next == cu)
            {
                cu1.next = null;
            }
            cu1 = cu1.next;
        }
        System.out.println("Last element deleted");
    }
    public static void main(String[] args) {

        LinkedList2 obj = new LinkedList2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            obj.insert();
        }
        System.out.println("Enter the element which you want to delete : ");
        int d= sc.nextInt();
        obj.Delete(d);
        obj.display();
        System.out.println("/n First element deleted...............");
        obj.fDelete();
        System.out.println("Element is : ");
        obj.display();
        obj.lastDelete();
        obj.display();

    }
}
