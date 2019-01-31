//Q30. Write a program to demonstrate the use of push buttons.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MyButtons" width=200 height=100>
</applet>
*/
public class MyButtons extends Applet implements ActionListener{
String msg="";
public void init(){
Button yes=new Button("YES");
Button no=new Button("NO");
Button undecided=new Button("UNDECIDED");
add(yes);
add(no);
add(undecided);
yes.addActionListener(this);
no.addActionListener(this);
undecided.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
String str=ae.getActionCommand();
if(str.equals("YES")){
msg="YOU PRESSED YES";
}
else if(str.equals("NO")){
msg="YOU PRESSED NO";
}
else{
msg="YOU PRESSED UNDECIDED";
}
repaint();
}
public void paint(Graphics g){
g.drawString(msg,6,100);
}
}

