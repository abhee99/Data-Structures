import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Queue 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();
        int q=sc.nextInt();
        int f,a;
        while(q--!=0)
        {
            f=sc.nextInt();
            if(f==1)
            {
                a=sc.nextInt();
                s1.push(a);
            }
            else if(f==2||f==3)
            {
                if(s2.empty())
                {
                    while(!s1.empty())
                    {
                        s2.push(s1.pop());
                    }
                }
                if(f==2)
                s2.pop();
                else 
                System.out.println(s2.peek());
            }
        }
    }
}

