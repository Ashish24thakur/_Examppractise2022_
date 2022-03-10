import java.util.Scanner;

class Node5{
    int data;
    Node5 next;
    Node5 reverse;
}
public class DoublyLinkedList1 {
    Node5 head,end;
    void detail()
    {
        DoublyLinkedList1 obj = new DoublyLinkedList1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            obj.insert();
        }
        obj.display();
        //obj.fdelete();
        //obj.display();
        //obj.ldelete();
        //obj.display();
        //obj.finddelete();
        //obj.display();
        //obj.insertAt();
        //obj.display();
        obj.ReverseDisp();
    }
    void insert()
    {
        Scanner sc = new Scanner(System.in);
        Node5 nn2 = new Node5();
        int da = sc.nextInt();
        nn2.data  = da;
        nn2.next = null;
        nn2.reverse = null;

        if(head == null)
        {
            head = nn2;
            end = null;
        }
        else{
            Node5 current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = nn2;
            nn2.reverse = current;
            end = current;

        }
    }
    void insertAt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnetr the position : \n");
        int pos = sc.nextInt();
        System.out.println("\nEnter the ele : \n");
        int ele = sc.nextInt();
        Node5 obb = new Node5();
        obb.data = ele;
        Node5 curr6 = head;
        int i=1,f=1;
        while(curr6 != null)
        {
            Node5 add2;
            if(i==(pos)-1)
            {
               f=0;
               add2 = curr6;

               Node5 curr8 = head;
               while(curr8 != null)
               {
                   if(curr8.next == add2)
                   {
                       add2 = curr8.next;
                       curr8.next = obb;
                       obb.next = add2;
                       obb.reverse = curr8;

                   }
                   curr8 = curr8.next;
               }
            }
            curr6 = curr6.next;
        }

    }
    void display()
    {
        Node5 current = head;
        System.out.println("Element is : ");
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    void ReverseDisp()
    {
        System.out.println("\nReverse print : \n");
        Node5 pre = end;
        while(pre != null)
        {
            System.out.print(pre.data + " ");
            pre = pre.reverse;
        }

    }
    void fdelete()
    {
        Node5 curr = head;
        head = curr.next;
        System.out.println("\nFirst element deleted..........\n");
    }
    void ldelete()
    {
        Node5 curr1 = head;
        while(curr1.next!= null)
        {
            curr1 = curr1.next;
        }
        Node5 curr2 = head;
        while(curr2 != null)
        {
            if (curr2.next == curr1)
            {
                curr2.next = null;
            }
            curr2 = curr2.next;
        }
        System.out.println("\nLast element deleted..........\n");

    }
    void finddelete()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the element which you want to delete  : \n");
        int ele = sc.nextInt();
        Node5 curr3 = head;
        while(curr3 != null)
        {
            if(curr3.data == ele)
            {
                Node5 dadd = curr3;
                Node5 curr4 = head;
                if(dadd==head)
                {
                    head = dadd.next;
                }
                else {
                    while (curr4 != null) {
                        if (curr4.next == dadd) {
                            curr4.next = dadd.next;
                        }
                        curr4 = curr4.next;
                    }
                }
            }
            curr3 = curr3.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList1 ob = new DoublyLinkedList1();
        ob.detail();
    }
}
