import java.util.Scanner;

public class Stack1 {

    int arr[];
    int top;
    Stack1(int data)
    {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the number of elements : ");
        int n = data;
        arr = new int[n];
        top = -1;
    }

    void insert()
    {
        if(top == (arr.length-1))
        {
            System.out.println("Stack is full");

        }
        else {
             Scanner sc = new Scanner(System.in);

                int data = sc.nextInt();
                top++;
                arr[top] = data;
            }
    }
    void delete()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println(arr[top]);
            //int temp = arr[top];
            top--;

        }

    }
    void display()
    {
        System.out.println("Element is : ");
        for (int i = top; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Enter the total number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack1 ob = new Stack1(n);
        for (int i = 0; i < n; i++) {
            ob.insert();
        }
        ob.display();
        ob.delete();
    }
}
