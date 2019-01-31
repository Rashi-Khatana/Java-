//Q28. Write a program to demonstrate different keyboard handling events.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MyKey" width=300 height=100>
</applet>
*/
public class MyKey extends Applet implements KeyListener 
{
	String msg = "";
	int X = 10, Y = 20; // output coordinates
	public void init() 
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke) 
	{
		showStatus("Key Pressed");
	}
	public void keyReleased(KeyEvent ke) 
	{
		showStatus("Key Released");
	}
	public void keyTyped(KeyEvent ke) 
	{
		msg += ke.getKeyChar();
		repaint();
	}
	// Display keystrokes.
	public void paint(Graphics g) 
	{
		g.drawString(msg, X, Y);
	}
}