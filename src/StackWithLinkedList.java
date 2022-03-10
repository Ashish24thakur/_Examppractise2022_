import java.util.Scanner;

class  Node10{
    int data;
    Node10 next;
}

class StackLinked {
    Node10 top;
    int StackLength=-1;

    void insert()
    {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node10 ob = new Node10();
        ob.data = data;
        ob.next = null;
        if(top == null)
        {
            top = ob;
        }
        else{
            ob.next = top;
            top = ob;
        }
        StackLength++;
    }
    void display()
    {
        System.out.println("Element is : ");
        Node10 current = top;
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
    void delete()
    {
        if(StackLength == -1)
        {
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Deleted element : " + top.data);
            top = top.next;
        }
    }
    public static void main(String[] args) {
        StackLinked obj = new StackLinked();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            obj.insert();

        }
        obj.display();
        obj.delete();
        obj.display();

    }

}


