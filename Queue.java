import java.io.*;
import java.util.*;
public class QueueArray {
    private int[] array;
    private int top;
    public QueueArray(int n){
        top=-1;
        array=new int[n];
    }
    public void enqueue(int d)
    {
        if(top==array.length-1)
        {
            System.out.println("Queue is Overflow");
        }
        else
        {
            top++;
            array[top]=d;
        }
    }
    public void dequeue(){
        if(top==-1){
            System.out.println("Queue is Underflow");
        }
        else{
            for(int i=0;i<top;i++){
                array[i]=array[i+1];
            }
            top--;
        }
    }
    public void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        QueueArray qa=new QueueArray(n);
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements:");
            int a=sc.nextInt();
            qa.enqueue(a);
        }
        qa.display();
        System.out.println("Pop Happening");
        qa.dequeue();
        System.out.println("After pop");
        qa.display();
    }
}

