import java.io.IOException;
import java.lang.Math;
import java.awt.*;
import java.lang.*;
import java.lang.Object;
import java.awt.event.*;
import java.awt.Robot;
import java.awt.PointerInfo;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.util.*;

class Auto
{
	public static void main(String[] args)
	{
		/*
		double oldx = 0; // old cursor x value
		double oldy = 0; // old cursor y value
		while(true) // do while
		{
			PointerInfo pointer = MouseInfo.getPointerInfo(); // get pointer in pointer object
			Point z = pointer.getLocation(); // get pointer x,y
			double x = z.getX(); // set x to x
			double y = z.getY(); // set y to y
			if( (!(x==oldx)) || (!(y==oldy)) ) // only if x and y are not the same as old x and old y
			{
				System.out.println("X:"+x); // update output.
				System.out.println("Y:"+y);
				oldx = x; // save new as old values
				oldy = y;
			}
		}
		*/
		
		int i = 0; // counter
		
		Scanner sc = new Scanner(System.in); // user input.
		System.out.println("How many times:");
		System.out.print(">");
		int x = sc.nextInt(); // save next incoming number as x
		
		try
		{
			Robot rb = new Robot(); // create new robot object
			rb.delay(5000); // set a 5 second delay to allow you to get to where you need to be before automation.
			while(i<x){ // while counter is less than max.
				rb.delay(800); // delay 800ms
				rb.mouseMove(615,545); // put cursor here (x,y)
				rb.mousePress(InputEvent.BUTTON1_MASK);  System.out.print("click buy");
				rb.mouseRelease(InputEvent.BUTTON1_MASK);  System.out.print("let go buy");
				rb.waitForIdle();
				rb.delay(400); // delay
				rb.mouseMove(952,616); // new point
				rb.mousePress(InputEvent.BUTTON1_MASK);  System.out.print("let go confirm");
				rb.mouseRelease(InputEvent.BUTTON1_MASK);  System.out.print("let go confirm");
				rb.waitForIdle();
				rb.delay(400);
				rb.mouseMove(1017,394);
				rb.mousePress(InputEvent.BUTTON1_MASK);System.out.print("let go x");
				rb.mouseRelease(InputEvent.BUTTON1_MASK);System.out.print("let go x");
				i++;
				System.out.print("		");
				System.out.println("i:"+i);
			}
		}
		catch(AWTException e)
		{
			System.out.println("AWTError:"+e);
		}

		/*
		X:615.0 buy button
		Y:545.0

		X:952 confirm
		Y:616

		X:1017
		Y:394
		*/
	}
}