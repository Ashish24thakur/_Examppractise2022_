import java.util.Scanner;

class Node2{
    int data;
    Node2 next;
}
public class LinkedList3 {

    Node2 head;
    int len;
    void detail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        len = sc.nextInt();
        LinkedList3 obj = new LinkedList3();
        for(int i=1;i<=len;i++)
        {
            obj.input();
        }
        obj.display();
        obj.insert();
        obj.display();
    }
   void input()
    {
        Node2 nn1 = new Node2();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        nn1.data = a;
        nn1.next = null;

        if(head == null)
        {
            head = nn1;
        }
        else{
            Node2 current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = nn1;
        }
    }
    void display()
    {
        Node2 current1 = head;
        System.out.println("Elements is : ");
        while(current1 != null)
        {
            System.out.println(current1.data);
            current1 = current1.next;
        }
    }

    void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int val = sc.nextInt();
        Node2 ob = new Node2();

        ob.data = val;
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();
       // int data = s
        int i=1,f=0;
        Node2 current2 = head;
        while(current2 != null)
        {
            if(i==(pos-1))
            {
                f=1;
                Node2 vari = current2.next;
                current2.next = ob;
                ob.next = vari;

            }
            i++;
            current2 = current2.next;
        }
        if(f==0)
        {
            System.out.println("Wrong positions");
        }
    }
    public static void main(String[] args) {

        LinkedList3 ob = new LinkedList3();
        ob.detail();
    }
}
