/*Q25. Write a program that creates a Banner and then creates a thread to scrolls the message in the
banner from left to right across the applet’s window */
import java.awt.*;
import java.applet.*; 
/*
<applet code="movingbanner" height=200 width=400>
</applet>
*/
public class movingbanner extends Applet implements Runnable
{   String s="A SIMPLE BANNER ";
    Thread t=null;
    boolean stopflag;
    public void init()
     {  setBackground(Color.gray);
        setForeground(Color.black);
     }
    public void start() 
    {  
        t=new Thread(this);
        stopflag=false;
        t.start();
   }
    public void run()
    {  

       for(;;)
         {  try
             {   
              repaint();
              Thread.sleep(250);
              if(stopflag)
               break;
          } catch(InterruptedException e)
            {   
                System.out.println(" interrupted exception called");
             }
       }
	}
     public void stop()
     { stopflag=true;
        t=null;

     }
     public void paint(Graphics g)
      {     
           char ch;
            ch=s.charAt(0);
            s=s.substring(1,s.length());
            s+=ch;
            g.drawString(s,30,50);
       }
}
             

