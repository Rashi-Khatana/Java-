/*Q27. Write a program to demonstrate different mouse handling events like mouseClicked(),
mouseEntered(), mouseExited(), mousePressed, mouseReleased() and mouseDragged().*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="AllMouseEvents" width=200 height=100>
</applet>
*/
public class AllMouseEvents extends Applet implements MouseListener,MouseMotionListener{
String msg="";
int mouseX=0;
int mouseY=0;
public void init(){
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me){
mouseX=0;
mouseY=10;
msg="MOUSE CLICKED";
repaint();
}
public void mouseEntered(MouseEvent me){
mouseX=0;
mouseY=10;
msg="MOUSE ENTERED";
repaint();
}
public void mouseExited(MouseEvent me){
mouseX=0;
mouseY=10;
msg="MOUSE EXITED";
repaint();
}
public void mousePressed(MouseEvent me){
mouseX=me.getX();
mouseY=me.getY();
msg="DOWN";
repaint();
}
public void mouseReleased(MouseEvent me){
mouseX=me.getX();
mouseY=me.getY();
msg="UP";
repaint();
}
public void mouseDragged(MouseEvent me){
mouseX=me.getX();
mouseY=me.getY();
msg="*";
showStatus("DRAGGING MOUSE AT " +mouseX+" "+mouseY);
repaint();
}
public void mouseMoved(MouseEvent me){
showStatus("MOVING MOUSE AT "+me.getX()+","+me.getY());
}
public void paint(Graphics g){
g.drawString(msg,mouseX,mouseY);
}
}



