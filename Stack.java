import java.io.*;
import java.util.*;
public class Stackarrays {
    private int[] array;
    private int top;
    public Stackarrays(int n){
        top=-1;
        array=new int[n];
    }
    public void push(int d)
    {
        if(top==array.length-1)
        {
            System.out.println("Stack is Overflow");
        }
        else
        {
            top++;
            array[top]=d;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack is Underflow");
        }
        else{
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
        Stackarrays sa=new Stackarrays(n);
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements:");
            int a=sc.nextInt();
            sa.push(a);
        }
        sa.display();
        System.out.println("Pop Happening");
        sa.pop();
        System.out.println("After pop");
        sa.display();
    }
}
