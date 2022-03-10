import java.util.Scanner;

public class Stack1Example {
    int top;
    int arr[];
     Stack1Example(int n)
    {
        top = -1;
        arr = new int[n];
    }
    void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element : ");
        int a = sc.nextInt();
        if(top==(arr.length-1))
        {
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top] = a;
        }
    }
    public static void main(String[] args) {


    }
}
