import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//Program to create CheckBoxes

/*
<applet code="Question76" width=200 height=150>
</applet>
*/
public class Question76 extends Applet implements ItemListener
{ 
  String msg="",msgwin98="",msgwinNT="",msgsolaris="";
  Checkbox Win98,winNT,solaris;
  
  public void init()
  {
    Win98= new Checkbox("Windows98");
    winNT= new Checkbox("Windows NT");
    solaris = new Checkbox("Solaris");
   
    add(Win98);
    add(winNT);
    add(solaris);
    
    Win98.addItemListener(this);
    solaris.addItemListener(this);
    winNT.addItemListener(this);
  }
  public void itemStateChanged(ItemEvent ie)
  {
        msgwin98="Windows 98 "+Win98.getState();
        msgwinNT="Windows NT "+winNT.getState();
        msgsolaris="Solaris  "+solaris.getState();
        repaint();
  }
  public void paint(Graphics g)
  {
    msg="Current state: ";
    g.drawString(msg,6,100);
    g.drawString(msgwinNT,6,120);
    g.drawString(msgwin98,6,140);
    g.drawString(msgsolaris,6,160);

  }
}