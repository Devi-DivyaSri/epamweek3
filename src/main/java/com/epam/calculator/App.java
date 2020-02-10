package com.epam.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "enter two numbers");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("enter your choice\n1.addition\n2.subtraction\n3.multiplication\n4.division\n");
        int ch=s.nextInt();
        switch(ch)
        {
        case 1:
        	System.out.println(" sum of "+a+"and "+b+"is : "+(a+b));
        	break;
        case 2:
        	System.out.println(" difference of "+a+"and "+b+"is : "+(a-b));
        	break;
        case 3:
        	System.out.println(" product of "+a+"and "+b+"is : "+a*b);
        	break;
        case 4:
        	System.out.println(" division of "+a+"and "+b+"is : "+a/b);
        	break;
        default:
        System.out.println("invalid choice");
        }
    }
}
