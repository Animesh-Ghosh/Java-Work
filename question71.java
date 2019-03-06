import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//program to demonstrate adapter class for mouse events

/*
 <applet code="AdapterDemo" width=350 height=100>
 </applet>
 */
public class AdapterDemo extends Applet{
 String msg="";
 int mouseX=0;
 int mouseY=0;
 
public void init(){ 
  addMouseListener(new MouseDemo(this));
}

public void paint (Graphics g) {
  g.drawString (msg, mouseX, mouseY);
 }

class MouseDemo extends MouseAdapter{
AdapterDemo adapter_demo;
public MouseDemo(AdapterDemo adapter_demo)
{this.adapter_demo=adapter_demo;
}

public void mouseClicked(MouseEvent me)
{msg="Mouse Clicked";
mouseX=me.getX();
mouseY=me.getY();
repaint();
}

public void mousePressed(MouseEvent me) {  
  msg="Mouse Pressed";
mouseX=me.getX();
mouseY=me.getY();
repaint();
}  

public void mouseReleased(MouseEvent me) {  
msg="Mouse Released";
mouseX=me.getX();
mouseY=me.getY();
repaint();
}  
   } 
     }